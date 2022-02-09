package com.zensar.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.dto.OrderStatus;
import com.zensar.dto.OrderStatusDto;
import com.zensar.entity.ConsumeJSONEntity;
import com.zensar.entity.FulfillmentOrderEntity;
import com.zensar.repo.JSONDataMessagesRepo;
import com.zensar.repo.XMLDataMessagesRepo;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private JSONDataMessagesRepo jsonDataMessagesRepo;
	@Autowired
	private XMLDataMessagesRepo XMLDataMessagesRepo;

	@Override
	public boolean updateJSONOrderStatus(OrderStatusDto updateStatus) {

		ConsumeJSONEntity jsonEntity = jsonDataMessagesRepo.getById(updateStatus.getId());
		jsonEntity.setOrderStatus(OrderStatus.valueOf(updateStatus.getStatus().toUpperCase()));
		jsonDataMessagesRepo.save(jsonEntity);
		return true;
	}

	@Override
	public boolean updateXMLOrderStatus(OrderStatusDto updateStatus) {
		FulfillmentOrderEntity xmlEntity = XMLDataMessagesRepo.getById(updateStatus.getId());
		//OrderStatus mnth=OrderStatus.valueOf(updateStatus.getStatus().toUpperCase());
		xmlEntity.setOrderStatus(OrderStatus.valueOf(updateStatus.getStatus().toUpperCase()));
		XMLDataMessagesRepo.save(xmlEntity);
		return true;
	}

}
