package com.pony.model.autoTask.singletonTask;

import java.util.concurrent.ThreadPoolExecutor;

public class SingletonProcessor implements Runnable{

    private ThreadPoolExecutor pool;
    public SingletonProcessor(ThreadPoolExecutor pool) {
        this.pool=pool;
    }

    @Override
    public void run() {
        while (true) {
            try {
                pool.execute(new SingletonTask());
                Thread.sleep(14000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
