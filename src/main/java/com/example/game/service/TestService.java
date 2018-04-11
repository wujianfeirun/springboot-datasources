package com.example.game.service;

import com.example.game.domain.pojo.*;

import java.util.List;
import java.util.Map;

public interface TestService {

	Integer queryCountBySlave();
	Integer insertIntoMaster();
	Integer insertInforToMaster(CarInfo carInfo);


	Integer insertAgency(Agency agengy);
	Integer insertBrand(Brand brand);
	Integer insertCar(Car car);
	Integer insertChannel(Channel channel);
	Integer insertCity(City city);
	Integer insertOrder(Order order);
	Integer insertOrderDetail(OrderDetail orderDetail);
	Integer insertProvince(Province province);
	Integer insertSupervisor(Supervisor supervisor);
	Integer insertSupervisorEvent(SupervisorEvent supervisorEvent);
	Integer insertUser(User user);

	Boolean updateAgency(Agency agengy);
	Boolean updateBrand(Brand brand);
	Boolean updateCar(Car car);
	Boolean updateChannel(Channel channel);
	Boolean updateCity(City city);
	Boolean updateOrder(Order order);
	Boolean updateOrderDetail(OrderDetail orderDetail);
	Boolean updateProvince(Province province);
	Boolean updateSupervisor(Supervisor supervisor);
	Boolean updateSupervisorEvent(SupervisorEvent supervisorEvent);
	Boolean updateUser(User user);

	List<Agency> queryAgency(Map<String,Object> conditions);
	List<Brand> queryBrand(Map<String,Object> conditions);
	List<Car> queryCar(Map<String,Object> conditions);
	List<Channel> queryChannel(Map<String,Object> conditions);
	List<City> queryCity(Map<String,Object> conditions);
	List<Order> queryOrder(Map<String,Object> conditions);
	List<OrderDetail> queryOrderDetail(Map<String,Object> conditions);
	List<Province> queryProvince(Map<String,Object> conditions);
	List<Supervisor> querySupervisor(Map<String,Object> conditions);
	List<SupervisorEvent> querySupervisorEvent(Map<String,Object> conditions);
	List<User> queryUser(Map<String,Object> conditions);



}
