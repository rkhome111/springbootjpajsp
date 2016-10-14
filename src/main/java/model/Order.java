package model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
@Entity
@Table(name="ecart_order")
public class Order {
	
	@Id
	@GeneratedValue
	int id;
	
	int orderStatus;
	String sessionId,ipAddress;
	float orderTotal;
	Date createdAt,deletedAt;
	
	@OneToOne
	@JoinColumn(name="userId")
	User user;
	
	
	
	@OneToMany()
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinColumn(name="order_id")
	List<OrderDetail> orderDetail;
	
	{orderDetail = new LinkedList<>();}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public float getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(float orderTotal) {
		this.orderTotal = orderTotal;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getDeletedAt() {
		return deletedAt;
	}

	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}

	public List<OrderDetail> getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(List<OrderDetail> orderDetail) {
		this.orderDetail = orderDetail;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", userId=" + user.getId() + ", orderStatus=" + orderStatus + ", sessionId=" + sessionId
				+ ", ipAddress=" + ipAddress + ", orderTotal=" + orderTotal + ", createdAt=" + createdAt
				+ ", deletedAt=" + deletedAt + ", orderDetail=" + orderDetail + "]";
	}
	

}
