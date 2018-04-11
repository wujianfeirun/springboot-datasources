package com.example.game.domain.mapper;

import com.example.game.domain.pojo.*;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface TestMapper {

	Integer queryCount();
	
	@Update("INSERT INTO project.user (name,age,phone) VALUES('www',22,'1823241');")
	Integer insertRow();

    Integer insertCarRow(CarInfo carInfo);


    Integer insertAgency(Agency agency);

	Integer insertBrand(Brand brand);

	Integer insertCar(Car car);

	Integer insertChannel(Channel channel);

	Integer insertCity(City city);

	Integer insertOrder(Order order);

	Integer insertOrderDetail(OrderDetail orderDetail);

	Integer insertProvince(Province province);

	Integer insertSupervisor(Supervisor supervisor);

	Integer insertSupervisorEvent(SupervisorEvent provinceEvent);

	Integer insertUser(User user);

	List<Agency> queryAgencyList(Agency agency);
	List<OrderDetail> queryOrderDetailList(OrderDetail orderDetail);
	List<Order> queryOrderList(Order order);
	List<User> queryUserList(User user);


}

