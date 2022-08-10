package com.carbuyer.service.intfc;

import java.util.List;
import java.util.Map;

import com.carbuyer.model.Order;

public interface OrderService {
	public List<Order> getAllOrder();
	public List<Map<String, ?>> getOrderByUser(Integer id);
}
