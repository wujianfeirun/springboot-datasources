package com.example.game.domain.mapper;

import com.example.game.domain.pojo.CarInfo;
import org.apache.ibatis.annotations.Update;

public interface TestMapper {

	Integer queryCount();
	
	@Update("INSERT INTO project.user (name,age,phone) VALUES('www',22,'1823241');")
	Integer insertRow();

    Integer insertCarRow(CarInfo carInfo);



}

