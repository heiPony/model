package com.pony.model.singletonModel;

import org.springframework.stereotype.Component;

@Component
public class LazySingletonThread {


    private static LazySingletonThread instance=null;
    private LazySingletonThread() {};

    public static LazySingletonThread getInstance(){
        if(instance==null){
            System.out.println("==============线程安全为题===============");
            instance=new LazySingletonThread();
        }
        return instance;
    }
}
