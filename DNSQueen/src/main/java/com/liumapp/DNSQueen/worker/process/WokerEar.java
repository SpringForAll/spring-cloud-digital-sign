package com.liumapp.DNSQueen.worker.process;

import com.liumapp.DNSQueen.worker.job.JobTodo;
import com.liumapp.DNSQueen.worker.ready.StandReady;
import com.liumapp.DNSQueen.worker.tcp.TCPSocketMonitor;
import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by liumapp on 7/14/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Component
public class WokerEar implements TextProcessor, BeanPostProcessor,
        InitializingBean, Ordered {

    @Autowired
    private TCPSocketMonitor tcpSocketMonitor;

    private int startDelay = 3000;

    private List<JobTodo> jobs = new LinkedList<JobTodo>();

    /**
     * @param startDelay
     *            the startDelay to set
     */
    public void setStartDelay(int startDelay) {
        this.startDelay = startDelay;
    }
    
    private List<StandReady> listeners = new LinkedList<StandReady>();

    private Logger logger = Logger.getLogger(getClass());

    public void start() {
        try {
            logger.info("start to hear queen says!");
            tcpSocketMonitor.run();
        } catch (Throwable e) {
            logger.warn("init fail ", e);
        }
    }

    private void delayStart() {
        try {
            Thread.sleep(startDelay);
        } catch (InterruptedException e) {
            logger.warn("WTF!!??", e);
        }
    }

    private void assignJobs() {
        try {
            for (StandReady standReady : listeners) {
                List<JobTodo> jobsForThisListener = new LinkedList<JobTodo>();
                for (JobTodo jobTodo : jobs) {
                    if (standReady.whatKindOfJobWillYouDo() != null
                            && standReady.whatKindOfJobWillYouDo().isInstance(
                            jobTodo)) {
                        jobsForThisListener.add(jobTodo);
                    }
                }
                standReady.setJobs(jobsForThisListener);
            }
        } catch (Throwable e) {
            logger.warn("Opps! " + e);
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see com.liumapp.DNSQueen.worker.process.TextProcessor
     */
    @Override
    public String process(String lineIn) {
        logger.info("queen says \"" + lineIn + "\" ,what you should do?");
        try {
            for (StandReady listener : listeners) {
                String whatYouShouldDo = listener.doWhatYouShouldDo(lineIn);
                if (whatYouShouldDo != null) {
                    return whatYouShouldDo;
                }
            }
        } catch (Throwable e) {
            logger.warn("Oops! Maybe not inited " , e);
            assignJobs();
        }
        return "unkown command";
    }

    /*
     * (non-Javadoc)
     *
     * @see org.springframework.beans.factory.config.BeanPostProcessor#
     * postProcessBeforeInitialization(java.lang.Object, java.lang.String)
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
        return bean;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.springframework.beans.factory.config.BeanPostProcessor#
     * postProcessAfterInitialization(java.lang.Object, java.lang.String)
     * 实例化Bean之后调用
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        if (bean instanceof JobTodo) {
            logger.info("a job assigned: " + bean.getClass().getName());
            jobs.add((JobTodo) bean);
        }
        if (bean instanceof StandReady) {
            logger.info(bean.getClass().getName()
                    + " will listen what queen says, good guy!");
            listeners.add((StandReady) bean);
        }
        return bean;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                delayStart();
                assignJobs();
                start();
            }
        });
        thread.setDaemon(true);//将其定义为守护线程
        thread.start();
    }

    /*
     * (non-Javadoc)
     *
     * @see org.springframework.core.Ordered#getOrder()
     */
    @Override
    public int getOrder() {
        return Integer.MAX_VALUE / 2;
    }
}
