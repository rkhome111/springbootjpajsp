package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity(name="ecart_order_detail")
public class OrderDetail {
	
	@Id
	@GeneratedValue
	int id;
	
	int userId,quantity,colorId;
	String sessionId,size,colorCode;	
	float price;
	
	@OneToOne
	@JoinColumn(name="mainProductId")
	@LazyCollection(LazyCollectionOption.FALSE)
	MainProduct mainProduct;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getColorId() {
		return colorId;
	}
	public void setColorId(int colorId) {
		this.colorId = colorId;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColorCode() {
		return colorCode;
	}
	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", userId=" + userId + ", mainProductId=" + mainProduct + ", quantity="
				+ quantity + ", colorId=" + colorId + ", sessionId=" + sessionId + ", size=" + size + ", colorCode="
				+ colorCode + ", price=" + price + "]";
	}
	
	

}
