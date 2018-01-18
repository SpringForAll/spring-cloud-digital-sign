package com.liumapp.DNSQueen.worker.utils;

import org.apache.log4j.Logger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by liumapp on 7/14/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class ExecutorUtils {

    private static Logger LOGGER = Logger.getLogger(ExecutorUtils.class);

    /**
     * @param size
     * @return
     */
    public static ExecutorService newBlockingExecutors(int size) {
        return new ThreadPoolExecutor(size, size, 0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(1) {
                    /**
                     *
                     */
                    private static final long serialVersionUID = 1L;

                    /**
                     * (non-Jsdoc)
                     *
                     * @see java.util.concurrent.LinkedBlockingQueue#offer(java.lang.Object)
                     */
                    @Override
                    public boolean offer(Runnable e) {
                        try {
                            this.put(e);
                        } catch (Exception e1) {
                            LOGGER.warn("offer error ", e1);
                        }
                        return true;
                    }
                });
    }
}

