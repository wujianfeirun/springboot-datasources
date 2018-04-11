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

import com.example.game.domain.pojo.*;
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
@CrossOrigin(origins="*" )
@RestController	//使用restcontroller requestmapping不需要responsebody 自动返回JSON格式
public class BigProjectController {

   ExecutorService executorService = Executors.newCachedThreadPool();

	protected static final Logger logger = LoggerFactory.getLogger(BigProjectController.class);

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

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String insertUser(@RequestBody User user) throws ExecutionException, InterruptedException {

        long time = System.currentTimeMillis();
        testService.insertUser(user);
        logger.debug(Thread.currentThread().getName()+"cost "+(System.currentTimeMillis()-time) + "ms");
        return "cost" +(System.currentTimeMillis()) +"ms";
    }

/*    @RequestMapping(value = "/agency",method = RequestMethod.POST)
    public String insertAgency(@RequestBody Agency agency) throws ExecutionException, InterruptedException {

        long time = System.currentTimeMillis();
        testService.insertAgency(agency);
        logger.debug(Thread.currentThread().getName()+"cost "+(System.currentTimeMillis()-time) + "ms");
        return "cost" +(System.currentTimeMillis()) +"ms";
    }*/

    @RequestMapping(value = "/brand",method = RequestMethod.POST)
    public String insertBrand(@RequestBody Brand brand) throws ExecutionException, InterruptedException {

        long time = System.currentTimeMillis();
        testService.insertBrand(brand);
        logger.debug(Thread.currentThread().getName()+"cost "+(System.currentTimeMillis()-time) + "ms");
        return "cost" +(System.currentTimeMillis()) +"ms";
    }


    @RequestMapping(value = "/car",method = RequestMethod.POST)
    public String insertCar(@RequestBody Car car) throws ExecutionException, InterruptedException {

        long time = System.currentTimeMillis();
        testService.insertCar(car);
        logger.debug(Thread.currentThread().getName()+"cost "+(System.currentTimeMillis()-time) + "ms");
        return "cost" +(System.currentTimeMillis()) +"ms";
    }

    @RequestMapping(value = "/channel",method = RequestMethod.POST)
    public String insertChannel(@RequestBody Channel channel) throws ExecutionException, InterruptedException {

        long time = System.currentTimeMillis();
        testService.insertChannel(channel);
        logger.debug(Thread.currentThread().getName()+"cost "+(System.currentTimeMillis()-time) + "ms");
        return "cost" +(System.currentTimeMillis()) +"ms";
    }

    @RequestMapping(value = "/city",method = RequestMethod.POST)
    public String insertCity(@RequestBody City city) throws ExecutionException, InterruptedException {

        long time = System.currentTimeMillis();
        testService.insertCity(city);
        logger.debug(Thread.currentThread().getName()+"cost "+(System.currentTimeMillis()-time) + "ms");
        return "cost" +(System.currentTimeMillis()) +"ms";
    }


    @RequestMapping(value = "/order",method = RequestMethod.POST)
    public String insertOrder(@RequestBody Order order) throws ExecutionException, InterruptedException {

        long time = System.currentTimeMillis();
        testService.insertOrder(order);
        logger.debug(Thread.currentThread().getName()+"cost "+(System.currentTimeMillis()-time) + "ms");
        return "cost" +(System.currentTimeMillis()) +"ms";
    }

    @RequestMapping(value = "/orderdetail",method = RequestMethod.POST)
    public String insertOrderDetail(@RequestBody OrderDetail orderdetail) throws ExecutionException, InterruptedException {

        long time = System.currentTimeMillis();
        testService.insertOrderDetail(orderdetail);
        logger.debug(Thread.currentThread().getName()+"cost "+(System.currentTimeMillis()-time) + "ms");
        return "cost" +(System.currentTimeMillis()) +"ms";
    }

    @RequestMapping(value = "/province",method = RequestMethod.POST)
    public String insertProvince(@RequestBody Province province) throws ExecutionException, InterruptedException {

        long time = System.currentTimeMillis();
        testService.insertProvince(province);
        logger.debug(Thread.currentThread().getName()+"cost "+(System.currentTimeMillis()-time) + "ms");
        return "cost" +(System.currentTimeMillis()) +"ms";
    }

    @RequestMapping(value = "/supervisor",method = RequestMethod.POST)
    public String insertSupervisor(@RequestBody Supervisor supervisor) throws ExecutionException, InterruptedException {

        long time = System.currentTimeMillis();
        testService.insertSupervisor(supervisor);
        logger.debug(Thread.currentThread().getName()+"cost "+(System.currentTimeMillis()-time) + "ms");
        return "cost" +(System.currentTimeMillis()) +"ms";
    }

    @RequestMapping(value = "/supervisorevent",method = RequestMethod.POST)
    public String insertSupervisorEvent(@RequestBody SupervisorEvent supervisorevent) throws ExecutionException, InterruptedException {

        long time = System.currentTimeMillis();
        testService.insertSupervisorEvent(supervisorevent);
        logger.debug(Thread.currentThread().getName()+"cost "+(System.currentTimeMillis()-time) + "ms");
        return "cost" +(System.currentTimeMillis()) +"ms";
    }

    @RequestMapping(value = "/queryAgency",method = RequestMethod.POST)
    public List<Agency> queryAgency(@RequestBody Agency agency) throws ExecutionException, InterruptedException {

        return testService.queryAgencyList(agency);
    }

    @RequestMapping(value = "/queryOrderDetail",method = RequestMethod.POST)
    public List<OrderDetail> queryOrderDetail(@RequestBody OrderDetail orderDetail) throws ExecutionException, InterruptedException {

        return testService.queryOrderDetailList(orderDetail);
    }

    @RequestMapping(value = "/queryOrder",method = RequestMethod.POST)
    public List<Order> queryOrder(@RequestBody Order order) throws ExecutionException, InterruptedException {

        return testService.queryOrderList(order);
    }

    @RequestMapping(value = "/queryUser",method = RequestMethod.POST)
    public List<User> queryUser(@RequestBody User user) throws ExecutionException, InterruptedException {
        return testService.queryUserList(user);
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