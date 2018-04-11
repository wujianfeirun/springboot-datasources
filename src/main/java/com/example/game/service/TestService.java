package com.example.game.service;

import com.example.game.domain.pojo.*;

import java.util.List;

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

	List<Agency> queryAgency(List<String> Conditions, List<Object> values);
	List<Brand> queryBrand(List<String> Conditions, List<Object> values);
	List<Car> queryCar(List<String> Conditions, List<Object> values);
	List<Channel> queryChannel(List<String> Conditions, List<Object> values);
	List<City> queryCity(List<String> Conditions, List<Object> values);
	List<Order> queryOrder(List<String> Conditions, List<Object> values);
	List<OrderDetail> queryOrderDetail(List<String> Conditions, List<Object> values);
	List<Province> queryProvince(List<String> Conditions, List<Object> values);
	List<Supervisor> querySupervisor(List<String> Conditions, List<Object> values);
	List<SupervisorEvent> querySupervisorEvent(List<String> Conditions, List<Object> values);
	List<User> queryUser(List<String> Conditions, List<Object> values);



}
