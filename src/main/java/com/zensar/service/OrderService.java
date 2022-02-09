package com.zensar.service;

import com.zensar.dto.OrderStatusDto;
import com.zensar.dto.ProducerJSONDto;

public interface OrderService {

	public boolean updateJSONOrderStatus(OrderStatusDto orderStatusDto);

	public boolean updateXMLOrderStatus(OrderStatusDto orderStatusDto);
}
