package com.bp.mapper;

import com.bp.domain.pojo.*;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import javax.annotation.Resource;
import java.util.List;

public class CoreDaoImpl extends SqlSessionDaoSupport implements CoreDao{
    @Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
        super.setSqlSessionFactory(sqlSessionFactory);
    }
    @Override
    public Integer insertAgency(Agency agency) {
        return null;
    }

    @Override
    public Integer insertBrand(Brand brand) {
        return null;
    }

    @Override
    public Integer insertCar(Car car) {
        return null;
    }

    @Override
    public Integer insertChannel(Channel channel) {
        return null;
    }

    @Override
    public Integer insertCity(City city) {
        return null;
    }

    @Override
    public Integer insertOrder(Order order) {
        return null;
    }

    @Override
    public Integer insertOrderDetail(OrderDetail orderDetail) {
        return null;
    }

    @Override
    public Integer insertProvince(Province province) {
        return null;
    }

    @Override
    public Integer insertSupervisor(Supervisor supervisor) {
        return null;
    }

    @Override
    public Integer insertSupervisorEvent(SupervisorEvent provinceEvent) {
        return null;
    }

    @Override
    public Integer insertUser(User user) {
        return null;
    }

    @Override
    public List<Agency> queryAgencyList(Agency agency) {
        return null;
    }

    @Override
    public List<OrderDetail> queryOrderDetailList(OrderDetail orderDetail) {
        return null;
    }

    @Override
    public List<Order> queryOrderList(Order order) {
        return null;
    }

    @Override
    public List<User> queryUserList(User user) {
        return null;
    }
}
