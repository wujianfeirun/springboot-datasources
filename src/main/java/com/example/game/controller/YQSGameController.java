/**
 * 
 */
/**
 * @ClassName package-info
 * @Description TODO
 * @author lide
 * @date 2018年2月9日 下午2:08:30
 */
package com.example.game.controller;

import com.example.game.domain.pojo.CarInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.game.service.TestService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * 
 * @ClassName YQSGameController
 * @Description TODO
 * @author lide
 * @date 2018年2月27日 下午4:15:08
 */
@CrossOrigin
@RestController	//使用restcontroller requestmapping不需要responsebody 自动返回JSON格式
public class YQSGameController{

   ExecutorService executorService = Executors.newCachedThreadPool();

	protected static final Logger logger = LoggerFactory.getLogger(YQSGameController.class);

	@Autowired
	private TestService testService;

	@RequestMapping("/test/{var}")
	public String test(@PathVariable("var") Integer var) throws ExecutionException, InterruptedException {
	    List<Future<Object>> futList = new ArrayList<>();

	    for(int i=0;i<var;i++){
            Future<Object>  fut =    executorService.submit(new Callable<Object>() {
                @Override
                public Object call() throws Exception {
                    long time = System.currentTimeMillis();
                    testService.insertIntoMaster();
                    logger.debug(Thread.currentThread().getName()+"cost "+(System.currentTimeMillis()-time) + "ms");
                    return null;
                }
            });
            futList.add(fut);
        }
        long ctime = System.currentTimeMillis();
        for (int i = 0; i < futList.size(); i++) {
            futList.get(i).get();
        }
		return "主表插入 "+var+ "条数据" +"cost" +(System.currentTimeMillis()-ctime) +"ms";
	}


    @RequestMapping(value = "/carInfo/{var}",method = RequestMethod.POST)
    public String test(@PathVariable("var") Integer var,@RequestBody CarInfo carInfo) throws ExecutionException, InterruptedException {
        List<Future<Object>> futList = new ArrayList<>();
        for(int i=0;i<var;i++){
            Future<Object>  fut =    executorService.submit(new Callable<Object>() {
                @Override
                public Object call() throws Exception {
                    long time = System.currentTimeMillis();
                    testService.insertInforToMaster(carInfo);
                    logger.debug(Thread.currentThread().getName()+"cost "+(System.currentTimeMillis()-time) + "ms");
                    return null;
                }
            });
            futList.add(fut);
        }

        for (int i = 0; i < futList.size(); i++) {
            futList.get(i).get();
        }
        logger.info("系统当前时间"+ LocalDateTime.now());
        return "主表插入 "+var+ "条数据" +"cost" +(System.currentTimeMillis()) +"ms";
    }

    @RequestMapping("/test1/{var}")
	public String index(@PathVariable("var") Integer var) throws ExecutionException, InterruptedException {


        List<Future<Object>> futList = new ArrayList<>();

        for(int i=0;i<var;i++){
            Future<Object>  fut =    executorService.submit(new Callable<Object>() {
                @Override
                public Object call() throws Exception {
                    long time = System.currentTimeMillis();
                    testService.queryCountBySlave();
                    logger.debug(Thread.currentThread().getName()+"cost "+(System.currentTimeMillis()-time) + "ms");
                    return null;
                }
            });
            futList.add(fut);
        }
        long ctime = System.currentTimeMillis();
        for (int i = 0; i < futList.size(); i++) {
            futList.get(i).get();
        }
        return "读取 "+var+ "次" +"cost" +(System.currentTimeMillis()-ctime) +"ms";

	}
	
}