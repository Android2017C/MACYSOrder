package com.zensar.dto;

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("OrderStatusDto Model")
public class OrderStatusDto {
	
	@ApiModelProperty("Unique identifier of the OrderStatusDto")
	private int id;
	@ApiModelProperty("status of the OrderStatusDto")
	private String status;
	public OrderStatusDto(int id, String status) {
		super();
		this.id = id;
		this.status = status;
	}
	public OrderStatusDto(String status) {
		super();
		this.status = status;
	}
	public OrderStatusDto() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, status);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderStatusDto other = (OrderStatusDto) obj;
		return id == other.id && Objects.equals(status, other.status);
	}
	
	
	
	

}
