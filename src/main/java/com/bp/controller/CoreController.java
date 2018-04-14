package com.bp.controller;

import com.bp.domain.pojo.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.bp.mapper.CoreDao;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.*;

@CrossOrigin(origins="*" )
@RestController	//使用restcontroller requestmapping不需要responsebody 自动返回JSON格式
public class CoreController {

   ExecutorService executorService = Executors.newCachedThreadPool();

	protected static final Logger logger = LoggerFactory.getLogger(CoreController.class);

	@Resource
	private CoreDao coreDao;


    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String insertUser(@RequestBody User user) throws ExecutionException, InterruptedException {

        long time = System.currentTimeMillis();
        coreDao.insertUser(user);
        logger.debug(Thread.currentThread().getName()+"cost "+(System.currentTimeMillis()-time) + "ms");
        return "cost" +(System.currentTimeMillis()) +"ms";
    }


    @RequestMapping(value = "/brand",method = RequestMethod.POST)
    public String insertBrand(@RequestBody Brand brand) throws ExecutionException, InterruptedException {

        long time = System.currentTimeMillis();
        coreDao.insertBrand(brand);
        logger.debug(Thread.currentThread().getName()+"cost "+(System.currentTimeMillis()-time) + "ms");
        return "cost" +(System.currentTimeMillis()) +"ms";
    }


    @RequestMapping(value = "/car",method = RequestMethod.POST)
    public String insertCar(@RequestBody Car car) throws ExecutionException, InterruptedException {

        long time = System.currentTimeMillis();
        coreDao.insertCar(car);
        logger.debug(Thread.currentThread().getName()+"cost "+(System.currentTimeMillis()-time) + "ms");
        return "cost" +(System.currentTimeMillis()) +"ms";
    }

    @RequestMapping(value = "/channel",method = RequestMethod.POST)
    public String insertChannel(@RequestBody Channel channel) throws ExecutionException, InterruptedException {

        long time = System.currentTimeMillis();
        coreDao.insertChannel(channel);
        logger.debug(Thread.currentThread().getName()+"cost "+(System.currentTimeMillis()-time) + "ms");
        return "cost" +(System.currentTimeMillis()) +"ms";
    }

    @RequestMapping(value = "/city",method = RequestMethod.POST)
    public String insertCity(@RequestBody City city) throws ExecutionException, InterruptedException {

        long time = System.currentTimeMillis();
        coreDao.insertCity(city);
        logger.debug(Thread.currentThread().getName()+"cost "+(System.currentTimeMillis()-time) + "ms");
        return "cost" +(System.currentTimeMillis()) +"ms";
    }


    @RequestMapping(value = "/order",method = RequestMethod.POST)
    public String insertOrder(@RequestBody Order order) throws ExecutionException, InterruptedException {

        long time = System.currentTimeMillis();
        coreDao.insertOrder(order);
        logger.debug(Thread.currentThread().getName()+"cost "+(System.currentTimeMillis()-time) + "ms");
        return "cost" +(System.currentTimeMillis()) +"ms";
    }

    @RequestMapping(value = "/orderdetail",method = RequestMethod.POST)
    public String insertOrderDetail(@RequestBody OrderDetail orderdetail) throws ExecutionException, InterruptedException {

        long time = System.currentTimeMillis();
        coreDao.insertOrderDetail(orderdetail);
        logger.debug(Thread.currentThread().getName()+"cost "+(System.currentTimeMillis()-time) + "ms");
        return "cost" +(System.currentTimeMillis()) +"ms";
    }

    @RequestMapping(value = "/province",method = RequestMethod.POST)
    public String insertProvince(@RequestBody Province province) throws ExecutionException, InterruptedException {

        long time = System.currentTimeMillis();
        coreDao.insertProvince(province);
        logger.debug(Thread.currentThread().getName()+"cost "+(System.currentTimeMillis()-time) + "ms");
        return "cost" +(System.currentTimeMillis()) +"ms";
    }

    @RequestMapping(value = "/supervisor",method = RequestMethod.POST)
    public String insertSupervisor(@RequestBody Supervisor supervisor) throws ExecutionException, InterruptedException {

        long time = System.currentTimeMillis();
        coreDao.insertSupervisor(supervisor);
        logger.debug(Thread.currentThread().getName()+"cost "+(System.currentTimeMillis()-time) + "ms");
        return "cost" +(System.currentTimeMillis()) +"ms";
    }

    @RequestMapping(value = "/supervisorevent",method = RequestMethod.POST)
    public String insertSupervisorEvent(@RequestBody SupervisorEvent supervisorevent) throws ExecutionException, InterruptedException {

        long time = System.currentTimeMillis();
        coreDao.insertSupervisorEvent(supervisorevent);
        logger.debug(Thread.currentThread().getName()+"cost "+(System.currentTimeMillis()-time) + "ms");
        return "cost" +(System.currentTimeMillis()) +"ms";
    }

    @RequestMapping(value = "/queryAgency",method = RequestMethod.POST)
    public List<Agency> queryAgency(@RequestBody Agency agency) throws ExecutionException, InterruptedException {

        return coreDao.queryAgencyList(agency);
    }

    @RequestMapping(value = "/queryOrderDetail",method = RequestMethod.POST)
    public List<OrderDetail> queryOrderDetail(@RequestBody OrderDetail orderDetail) throws ExecutionException, InterruptedException {

        return coreDao.queryOrderDetailList(orderDetail);
    }

    @RequestMapping(value = "/queryOrder",method = RequestMethod.POST)
    public List<Order> queryOrder(@RequestBody Order order) throws ExecutionException, InterruptedException {

        return coreDao.queryOrderList(order);
    }

    @RequestMapping(value = "/queryUser",method = RequestMethod.POST)
    public List<User> queryUser(@RequestBody User user) throws ExecutionException, InterruptedException {
        List<User> userList = coreDao.queryUserList(user);
        return userList;
    }
	
}