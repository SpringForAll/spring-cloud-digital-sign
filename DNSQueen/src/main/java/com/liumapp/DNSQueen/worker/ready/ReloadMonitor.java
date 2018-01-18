package com.liumapp.DNSQueen.worker.ready;

import com.liumapp.DNSQueen.worker.Commands;
import com.liumapp.DNSQueen.worker.job.JobTodo;
import com.liumapp.DNSQueen.worker.job.ReloadAble;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by liumapp on 7/14/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Component
public class ReloadMonitor implements StandReady {
    private List<ReloadAble> reloadList;
    private ExecutorService reloadExecutors = Executors.newFixedThreadPool(10);
    private Logger logger = Logger.getLogger(getClass());

    /**
     *
     * @param whatQueenSays
     * @return
     */
    @Override
    public String doWhatYouShouldDo(String whatQueenSays) {
        if (Commands.RELOAD.equalsIgnoreCase(whatQueenSays)) {
            for (final ReloadAble reloadAble : reloadList) {
                reloadExecutors.execute(new Runnable() {

                    @Override
                    public void run() {
                        try {
                            reloadAble.reload();
                        } catch (Throwable e) {
                            logger.warn("oops!My ears!", e);
                        }

                    }
                });
            }
            return "success";
        }
        return null;
    }

    @Override
    public Class<? extends JobTodo> whatKindOfJobWillYouDo() {
        return ReloadAble.class;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void setJobs(List<? extends JobTodo> jobs) {
        reloadList = (List<ReloadAble>) jobs;
    }

}