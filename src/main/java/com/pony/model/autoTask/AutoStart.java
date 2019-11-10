package com.pony.model.autoTask;

import com.pony.model.autoTask.singletonTask.SingletonProcessor;
import com.pony.model.autoTask.singletonTask.SingletonProcessor_2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
@Component
public class AutoStart implements CommandLineRunner {

    public final ThreadPoolExecutor POOL=new ThreadPoolExecutor(4, 64, 10000,
            TimeUnit.MICROSECONDS, new ArrayBlockingQueue<Runnable>(16),new ThreadPoolExecutor.DiscardOldestPolicy());
    @Override
    public void run(String... args) throws Exception {

        new Thread(new SingletonProcessor(POOL)).start();
        new Thread(new SingletonProcessor_2(POOL)).start();

    }
}
