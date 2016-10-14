package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="cliparts")
@GenericGenerator(name="g1",strategy="increment")
public class Clipart 
{
	@Id
	@GeneratedValue(generator="g1")
	Integer id;
	
	String  clipartName;
	Integer catId,subcatId;
	String  status,colorable,clipartsImage,svgImage;
	float price;
	
	
	Integer createdBy;
	Integer updatedBy;
	Date    createdAt;
	Date    updatedAt;
	Date    deletedAt;
	
	{
		colorable="No";
		clipartsImage="";
		svgImage="";
		
		
		status    = "1";
		updatedBy = 1;
		createdAt = new Date();
		updatedAt = new Date();
		deletedAt = new Date();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getClipartName() {
		return clipartName;
	}

	public void setClipartName(String clipartName) {
		this.clipartName = clipartName;
	}

	public Integer getCatId() {
		return catId;
	}

	public void setCatId(Integer catId) {
		this.catId = catId;
	}

	public Integer getSubcatId() {
		return subcatId;
	}

	public void setSubcatId(Integer subcatId) {
		this.subcatId = subcatId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getColorable() {
		return colorable;
	}

	public void setColorable(String colorable) {
		this.colorable = colorable;
	}

	public String getClipartsImage() {
		return clipartsImage;
	}

	public void setClipartsImage(String clipartsImage) {
		this.clipartsImage = clipartsImage;
	}

	public String getSvgImage() {
		return svgImage;
	}

	public void setSvgImage(String svgImage) {
		this.svgImage = svgImage;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Date getDeletedAt() {
		return deletedAt;
	}

	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}

	@Override
	public String toString() {
		return "Clipart [id=" + id + ", clipartName=" + clipartName + ", catId=" + catId + ", subcatId=" + subcatId
				+ ", status=" + status + ", colorable=" + colorable + ", clipartsImage=" + clipartsImage + ", svgImage="
				+ svgImage + ", price=" + price + ", createdBy=" + createdBy + ", updatedBy=" + updatedBy
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", deletedAt=" + deletedAt + "]";
	}
	

	

}
