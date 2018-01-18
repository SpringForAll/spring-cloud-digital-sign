package com.liumapp.DNSQueen.worker.ready;

import com.liumapp.DNSQueen.worker.Commands;
import com.liumapp.DNSQueen.worker.job.JobTodo;
import com.liumapp.DNSQueen.worker.job.ShutDownAble;
import com.liumapp.DNSQueen.worker.utils.ExecutorUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.ExecutorService;

/**
 * Created by liumapp on 7/14/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@SuppressWarnings("restriction")
@Component
public class ShutDownMonitor implements StandReady, InitializingBean {

    private List<ShutDownAble> shutDownList;

    private int delay = 1;

    private Logger logger = Logger.getLogger(getClass());

    private ExecutorService shutDownExecutors = ExecutorUtils
            .newBlockingExecutors(4);

    @Override
    public String doWhatYouShouldDo(String whatQueenSays) {
        if (Commands.SHUTDOWN.equalsIgnoreCase(whatQueenSays)) {
            return shutDown();
        }
        return null;
    }

    private String shutDown() {
        if (shutDownList != null) {
            for (final ShutDownAble shutDownAble : shutDownList) {
                shutDownExecutors.execute(new Runnable() {

                    @Override
                    public void run() {
                        try {
                            shutDownAble.shutDown();
                        } catch (Throwable e) {
                            logger.warn("oops!My ears!", e);
                        }
                    }
                });
            }
        }
        logger.info("Application will shut down in " + delay + " seconds...");
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(delay * 1000);
                    logger.info("Shutting down success.");
                    System.exit(0);
                } catch (Throwable e) {
                    logger.error("Shutting down failed", e);
                }
            }
        });
        thread.setDaemon(true);
        thread.start();
        return "success";
    }

    @Override
    public Class<? extends JobTodo> whatKindOfJobWillYouDo() {
        return ShutDownAble.class;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void setJobs(List<? extends JobTodo> jobs) {
        shutDownList = (List<ShutDownAble>) jobs;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                shutDown();
            }
        });
    }

}
