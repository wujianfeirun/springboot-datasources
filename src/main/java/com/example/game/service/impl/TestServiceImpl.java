package com.example.game.service.impl;

import com.example.game.domain.pojo.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.datasource.DataSourceType;
import com.example.datasource.MyDataSource;
import com.example.game.domain.mapper.TestMapper;
import com.example.game.service.TestService;

import java.util.List;


/**
 * 
 * @ClassName TestServiceImpl
 * @Description TODO
 * @author lide
 * @date 2018年2月27日 下午4:14:57
 */
@Service
public class TestServiceImpl implements TestService {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private TestMapper testMapper;
	
	@Override
	@MyDataSource(DataSourceType.Master)
	public Integer queryCountBySlave() {
		return testMapper.queryCount();
	}

	
	@Override
	@MyDataSource(DataSourceType.Master)
	@Transactional
	public Integer insertIntoMaster() {
		//测试事务
		Integer rows = testMapper.insertRow();
		if(rows<=0) {	//更新小于1 执行回滚
			throw new RuntimeException();
		}
		return rows;
	}

    @Override
    @MyDataSource(DataSourceType.Master)
    @Transactional
    public Integer insertInforToMaster(CarInfo carInfo) {
        //测试事务
        Integer rows = testMapper.insertCarRow(carInfo);
        if(rows<=0) {	//更新小于1 执行回滚
            throw new RuntimeException();
        }
        return rows;
    }

/*	@Override
	@MyDataSource(DataSourceType.Master)
	@Transactional
	public Integer insertAgency(Agency agengy) {
		Integer rows = testMapper.insertAgency(agengy);
		if(rows<=0) {	//更新小于1 执行回滚
			throw new RuntimeException();
		}
		return rows;
	}*/

	@Override
	@MyDataSource(DataSourceType.Master)
	@Transactional
	public Integer insertBrand(Brand brand) {
		Integer rows = testMapper.insertBrand(brand);
		if(rows<=0) {	//更新小于1 执行回滚
			throw new RuntimeException();
		}
		return rows;
	}

	@Override
	@MyDataSource(DataSourceType.Master)
	@Transactional
	public Integer insertCar(Car car) {
		Integer rows = testMapper.insertCar(car);
		if(rows<=0) {	//更新小于1 执行回滚
			throw new RuntimeException();
		}
		return rows;
	}

	@Override
	@MyDataSource(DataSourceType.Master)
	@Transactional
	public Integer insertChannel(Channel channel) {
		Integer rows = testMapper.insertChannel(channel);
		if(rows<=0) {	//更新小于1 执行回滚
			throw new RuntimeException();
		}
		return rows;
	}

	@Override
	@MyDataSource(DataSourceType.Master)
	@Transactional
	public Integer insertCity(City city) {
		Integer rows = testMapper.insertCity(city);
		if(rows<=0) {	//更新小于1 执行回滚
			throw new RuntimeException();
		}
		return rows;
	}

	@Override
	@MyDataSource(DataSourceType.Master)
	@Transactional
	public Integer insertOrder(Order order) {
		Integer rows = testMapper.insertOrder(order);
		if(rows<=0) {	//更新小于1 执行回滚
			throw new RuntimeException();
		}
		return rows;
	}

	@Override
	@MyDataSource(DataSourceType.Master)
	@Transactional
	public Integer insertOrderDetail(OrderDetail orderDetail) {
		Integer rows = testMapper.insertOrderDetail(orderDetail);
		if(rows<=0) {	//更新小于1 执行回滚
			throw new RuntimeException();
		}
		return rows;
	}

	@Override
	@MyDataSource(DataSourceType.Master)
	@Transactional
	public Integer insertProvince(Province province) {
		Integer rows = testMapper.insertProvince(province);
		if(rows<=0) {	//更新小于1 执行回滚
			throw new RuntimeException();
		}
		return rows;
	}

	@Override
	@MyDataSource(DataSourceType.Master)
	@Transactional
	public Integer insertSupervisor(Supervisor supervisor) {
		Integer rows = testMapper.insertSupervisor(supervisor);
		if(rows<=0) {	//更新小于1 执行回滚
			throw new RuntimeException();
		}
		return rows;
	}

	@Override
	@MyDataSource(DataSourceType.Master)
	@Transactional
	public Integer insertSupervisorEvent(SupervisorEvent supervisorEvent) {
		Integer rows = testMapper.insertSupervisorEvent(supervisorEvent);
		if(rows<=0) {	//更新小于1 执行回滚
			throw new RuntimeException();
		}
		return rows;
	}

	@Override
	@MyDataSource(DataSourceType.Master)
	@Transactional
	public Integer insertUser(User user) {
		Integer rows = testMapper.insertUser(user);
		if(rows<=0) {	//更新小于1 执行回滚
			throw new RuntimeException();
		}
		return rows;
	}

	@Override
	@MyDataSource(DataSourceType.Master)
	public List<Agency> queryAgencyList(Agency agency) {
		return testMapper.queryAgencyList(agency);
	}

	@Override
	@MyDataSource(DataSourceType.Master)
	public List<OrderDetail> queryOrderDetailList(OrderDetail orderDetail) {
		return testMapper.queryOrderDetailList(orderDetail);
	}

    @Override
	@MyDataSource(DataSourceType.Master)
	public List<Order> queryOrderList(Order order) {
		return testMapper.queryOrderList(order);
	}

	@Override
	@MyDataSource(DataSourceType.Master)
	public List<User> queryUserList(User user) {
		return testMapper.queryUserList(user);
	}

}
