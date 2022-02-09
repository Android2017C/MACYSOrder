package com.zensar.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OrderStatus")
public class OrderStatusEntity {
	@Id
	@GeneratedValue
	private int id;
	private String status;
	public OrderStatusEntity(int id, String status) {
		super();
		this.id = id;
		this.status = status;
	}
	public OrderStatusEntity(String status) {
		super();
		this.status = status;
	}
	public OrderStatusEntity() {
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
		OrderStatusEntity other = (OrderStatusEntity) obj;
		return id == other.id && Objects.equals(status, other.status);
	}
	
}
