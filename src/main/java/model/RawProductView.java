package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="ecart_rawproducts_view")
@GenericGenerator(name="g1",strategy="increment")
public class RawProductView 
{
	@Id
	@GeneratedValue(generator="g1")
	Integer id;
	Boolean isDefault;
	Integer orderImage;
	String viewName,viewImage;
	Double wareaX,wareaY,wareaW,wareaH;
	
	{
		isDefault = false;
		wareaX=100.0;
		wareaY=100.0;
		wareaW=150.0;
		wareaH=150.0;
		
	}
	
	
	
	public Boolean getIsDefault() {
		return isDefault;
	}



	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Integer getOrderImage() {
		return orderImage;
	}



	public void setOrderImage(Integer orderImage) {
		this.orderImage = orderImage;
	}



	public String getViewName() {
		return viewName;
	}



	public void setViewName(String viewName) {
		this.viewName = viewName;
	}



	public String getViewImage() {
		return viewImage;
	}



	public void setViewImage(String viewImage) {
		this.viewImage = viewImage;
	}



	public Double getWareaX() {
		return wareaX;
	}



	public void setWareaX(Double wareaX) {
		this.wareaX = wareaX;
	}



	public Double getWareaY() {
		return wareaY;
	}



	public void setWareaY(Double wareaY) {
		this.wareaY = wareaY;
	}



	public Double getWareaW() {
		return wareaW;
	}



	public void setWareaW(Double wareaW) {
		this.wareaW = wareaW;
	}



	public Double getWareaH() {
		return wareaH;
	}



	public void setWareaH(Double wareaH) {
		this.wareaH = wareaH;
	}



//	@Override
//	public String toString() {
//		return "RawProductView [id=" + id + ", isDefault=" + isDefault + ", orderImage=" + orderImage + "]";
//	}






	@Override
	public String toString() {
		return "\nRawProductView [id=" + id + ", orderImage=" + orderImage + ", viewName=" + viewName + ", viewImage="
				+ viewImage + ", wareaX=" + wareaX + ", wareaY=" + wareaY + ", wareaW=" + wareaW + ", wareaH=" + wareaH
				+ "]\n";
	}



	
	

}
