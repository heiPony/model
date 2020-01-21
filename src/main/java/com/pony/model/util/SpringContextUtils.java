package com.pony.model.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringContextUtils  implements ApplicationContextAware {

    /**
     * 上下文对象实例
     * @Author huangzhanping
     * @param
     * @return 2020/1/21 18:07
     */
    private static ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
            this.applicationContext=applicationContext;
    }

    /**
     * 获取applicationContext
     * @Author huangzhanping
     * @param []
     * @return 2020/1/21 18:08
     */
    public static  ApplicationContext getApplicationContext(){
        return applicationContext;
    }

    public static <T> T getBean(Class<T> clazz){
        return getApplicationContext().getBean(clazz);
    }

}
