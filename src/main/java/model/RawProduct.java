package model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.IndexColumn;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="ecart_rawproducts")
@GenericGenerator(name="g1",strategy="increment")
public class RawProduct 
{
	@Id
	@GeneratedValue(generator="g1")
	Integer id;
	
//	@XmlTransient
	@JsonIgnore
	Boolean draft;
	
	
	int catId;

	@JsonProperty(value="mycatjson")
	Integer subcatId;
	
	Integer styleId;
	
	String  name;
	String status;
	String productType;
	String sizeId;
	String price;
	String printWidth;
	String printHeight;
	
	
	@JsonIgnore
	Integer createdBy,updatedBy,quantity;
	@JsonIgnore
	Date createdAt,updatedAt,deletedAt;
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinColumn(name="rawProductsId")
	@IndexColumn(name="orderColor", nullable=true)
	List<RawProductColor> productColors;
	


	
	{
		price = "0";
		printHeight = "0";
		printWidth = "0";
		draft = false;
//		productColors = new LinkedList<>();
//		productColors.add(new RawProductColor());
		productType="Rectangular";
		status    = "1";
		updatedBy = 1;
		createdAt = new Date();
		updatedAt = new Date();
		deletedAt = new Date();
	}


	public Boolean getDraft() {
		return draft;
	}


	public void setDraft(Boolean draft) {
		this.draft = draft;
	}


	public Integer getStyleId() {
		return styleId;
	}


	public void setStyleId(Integer styleId) {
		this.styleId = styleId;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getProductType() {
		return productType;
	}


	public void setProductType(String productType) {
		this.productType = productType;
	}




	public String getSizeId() {
		return sizeId;
	}


	public void setSizeId(String sizeId) {
		this.sizeId = sizeId;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getPrintWidth() {
		return printWidth;
	}


	public void setPrintWidth(String printWidth) {
		this.printWidth = printWidth;
	}


	public String getPrintHeight() {
		return printHeight;
	}


	public void setPrintHeight(String printHeight) {
		this.printHeight = printHeight;
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


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
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


	public List<RawProductColor> getProductColors() {
		return productColors;
	}


	public void setProductColors(List<RawProductColor> productColors) {
		this.productColors = productColors;
	}


	@Override
	public String toString() {
		return "RawProduct [id=" + id + ", draft=" + draft + ", catId=" + catId + ", subcatId=" + subcatId
				+ ", styleId=" + styleId + ", name=" + name + ", status=" + status + ", productType=" + productType
				+ ", sizeId=" + sizeId + ", price=" + price + ", printWidth=" + printWidth + ", printHeight="
				+ printHeight + ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + ", quantity=" + quantity
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", deletedAt=" + deletedAt
				+ ", productColors=" + productColors + "]";
	}











	
	

}
