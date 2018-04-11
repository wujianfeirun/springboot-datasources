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

	List<Agency> queryAgency(Agency agency);
	List<Brand> queryBrand(Brand brand);
	List<Car> queryCar(Car car);
	List<Channel> queryChannel(Channel channel);
	List<City> queryCity(City city);
	List<Order> queryOrder(Order order);
	List<OrderDetail> queryOrderDetail(OrderDetail orderDetail);
	List<Province> queryProvince(Province province);
	List<Supervisor> querySupervisor(Supervisor supervisor);
	List<SupervisorEvent> querySupervisorEvent(SupervisorEvent supervisorEvent);
	List<User> queryUser(User user);



}
