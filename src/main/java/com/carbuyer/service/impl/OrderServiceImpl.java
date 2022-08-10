package com.carbuyer.service.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carbuyer.model.Order;
import com.carbuyer.repository.OrderRepository;
import com.carbuyer.service.intfc.OrderService;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public List<Order> getAllOrder() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

	@Override
	public List<Map<String, ?>> getOrderByUser(Integer id) {
		// TODO Auto-generated method stub
		List<Map<String, ?>> listOrder = orderRepository.getOrderByUser(id);
//		for(Iterator iterator = listOrder.iterator(); iterator.hasNext();) {
//			Map<String, ?> map = (Map<String, ?>) iterator.next();
//		}
		for (Map<String, ?> map : listOrder) {
			System.out.println(map.get("user_id"));
		}
		return listOrder;
	}
	
	
}
