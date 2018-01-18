package com.liumapp.DNSQueen.worker.ready;

import com.liumapp.DNSQueen.worker.job.JobTodo;

import java.util.List;

/**
 * Created by liumapp on 7/14/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public abstract class StandReadyWorker implements StandReady {

    @Override
    public Class<? extends JobTodo> whatKindOfJobWillYouDo() {
        return null;
    }

    @Override
    public void setJobs(List<? extends JobTodo> jobs) {

    }

}

