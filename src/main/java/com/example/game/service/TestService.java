package com.example.game.service;

import com.example.game.domain.pojo.CarInfo;

public interface TestService {

	Integer queryCountBySlave();
	
	Integer insertIntoMaster();

	Integer insertInforToMaster(CarInfo carInfo);
}
