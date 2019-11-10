package com.pony.model.autoTask;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 任务调度基础类
 * 
 * @author felix
 * @date 2015-8-12 下午2:29:09
 */
public abstract class Task implements Runnable{
	
	private Logger logger = LoggerFactory.getLogger(Task.class);
	
	@Override
	public void run() {
		try {
			deal();
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
		}
	}
	
	/**
	 * 具体业务逻辑处理
	 * 
	 * @author felix  @date 2015-8-12 下午2:27:44
	 */
	public abstract String deal() throws Exception;
	
	/**
	 * 类转json串
	 * @author shenjun
	 * @return
	 * @throws Exception
	 */
	public abstract String toJsonString() throws Exception;
	
	/**
	 * json转类对象
	 * @author shenjun
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public abstract Task parseObject(JSONObject params) throws Exception;
	
}
