package com.liumapp.DNSQueen.worker.ready;

import com.liumapp.DNSQueen.worker.job.JobTodo;

import java.util.List;

/**
 * Created by liumapp on 7/14/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public interface StandReady {

    /**
     * when queen says, what you should do?
     *
     * @param whatQueenSays
     */
    public String doWhatYouShouldDo(String whatQueenSays);

    /**
     * Which kind of job you will do after hear what queen says?
     *
     * @return
     */
    public Class<? extends JobTodo> whatKindOfJobWillYouDo();

    /**
     * Assign jobs to you!
     *
     * @param jobs
     */
    public void setJobs(List<? extends JobTodo> jobs);

}
