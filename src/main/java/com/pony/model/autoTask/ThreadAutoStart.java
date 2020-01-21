package com.pony.model.autoTask;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Component
public class ThreadAutoStart implements CommandLineRunner {

    public final ThreadPoolExecutor POOL1 = new ThreadPoolExecutor(4, 64, 1000, TimeUnit.MICROSECONDS, new ArrayBlockingQueue<>(16), new ThreadPoolExecutor.DiscardOldestPolicy());

    @Override
    public void run(String... args) throws Exception {
        new Thread(new SingleTonProcessor(POOL1)).start();
    }
}
