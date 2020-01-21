package com.pony.model.autoTask;


import com.pony.model.singletonModel.StaticSingleTon;
import com.pony.model.util.SpringContextUtils;

public class SingletonTask implements  Runnable{


    public SingletonTask() {
    }

    @Override
    public void run() {
        StaticSingleTon singleTon = SpringContextUtils.getBean(StaticSingleTon.class);
        singleTon.getDesc();
    }
}
