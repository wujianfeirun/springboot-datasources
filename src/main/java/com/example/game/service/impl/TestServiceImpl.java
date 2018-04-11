package com.example.game.service.impl;

import com.example.game.domain.pojo.CarInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.datasource.DataSourceType;
import com.example.datasource.MyDataSource;
import com.example.game.domain.mapper.TestMapper;
import com.example.game.service.TestService;


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
}
