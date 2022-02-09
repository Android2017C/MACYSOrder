package com.zensar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.zensar.dto.OrderStatusDto;
import com.zensar.service.OrderService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("Macys/Order")
public class MacysOrderController {

	@Autowired
	OrderService orderService;

	@PutMapping(value = "/update/Json", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	@ApiOperation(value = "updateJsonOrderStatus")
	public boolean createOrderStatus(@RequestBody OrderStatusDto orderStatusDto) {

		return orderService.updateJSONOrderStatus(orderStatusDto);
	}

	@PutMapping(value = "/update/Xml", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	@ApiOperation(value = "updateXMLOrderStatus")
	public boolean updateOrderStatusId(@RequestBody OrderStatusDto orderStatusDto) {

		return orderService.updateXMLOrderStatus(orderStatusDto);
	}

}
