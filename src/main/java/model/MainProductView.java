package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ecart_main_product_view")
public class MainProductView {
	
	@Id
	@GeneratedValue
	int id;
	String viewName,viewImage;


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "MainProductView [id=" + id + ", viewName=" + viewName + ", viewImage=" + viewImage + "]";
	}
	

	
	

}
