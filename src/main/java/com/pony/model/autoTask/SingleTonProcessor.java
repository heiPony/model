package com.pony.model.autoTask;


import com.pony.model.singletonModel.StaticSingleTon;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.ThreadPoolExecutor;

public class SingleTonProcessor implements Runnable {

    private ThreadPoolExecutor pool;
    private Logger logger= LoggerFactory.getLogger(SingleTonProcessor.class);

    public SingleTonProcessor(ThreadPoolExecutor pool) {
        this.pool=pool;
    }

    @Override
    public void run() {

        while (true){
            try {
                Thread.sleep(1000);
                pool.execute(new SingletonTask());

            } catch (InterruptedException e) {
               logger.info("单例模式线程异常");
            }


        }




    }

    private Runnable test() {
        System.out.println("===");
        return null;
    }


}
