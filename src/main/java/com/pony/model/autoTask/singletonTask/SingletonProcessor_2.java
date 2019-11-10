package com.pony.model.autoTask.singletonTask;

import java.util.concurrent.ThreadPoolExecutor;

public class SingletonProcessor_2 implements Runnable {
    private ThreadPoolExecutor pool;

    public SingletonProcessor_2(ThreadPoolExecutor pool) {
        this.pool = pool;
    }

    @Override
    public void run() {
        while (true) {
            try {
                pool.execute(new SingletonTask_2());
                Thread.sleep(15000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
