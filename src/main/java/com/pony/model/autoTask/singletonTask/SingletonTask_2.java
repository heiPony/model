package com.pony.model.autoTask.singletonTask;

import com.alibaba.fastjson.JSONObject;
import com.pony.model.autoTask.Task;
import com.pony.model.singletonModel.HungerSingleton;
import com.pony.model.singletonModel.LazySingleton;

public class SingletonTask_2 extends Task {


    @Override
    public String deal() throws Exception {
//        LazySingleton instance = LazySingleton.getInstance();
        HungerSingleton hunger = HungerSingleton.getInstance();
//        instance.setName("hai");
//        System.out.println(instance.getName());
        System.out.println(hunger.getName());
        return null;
    }

    @Override
    public String toJsonString() throws Exception {
        return null;
    }

    @Override
    public Task parseObject(JSONObject params) throws Exception {
        return null;
    }
}
