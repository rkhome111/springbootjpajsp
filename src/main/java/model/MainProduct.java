package model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name="ecart_main_product")
public class MainProduct {
	@Id
	@GeneratedValue
	int id;
	
	int catId,subcatId,rawProductId,colorId,quantity;
	String sessionId,catText,subcatText,userType,size,internalReference,colorCode,userImageArr,canvasWidth,canvasHeight,gender;
	String pngFile,svgFile,pdfFile,status;
	String editModeArr,productArr,pngOutputArr,outputArr;
	
	@OneToMany
	@JoinColumn(name="mainProductId")
	@LazyCollection(LazyCollectionOption.FALSE)
	List<MainProductView> mainProductView;
	
	
	Date    createdAt;
	Date    updatedAt;
	Date    deletedAt;
	
	{
		mainProductView = new LinkedList<>();
		createdAt = new Date();
		updatedAt = new Date();
		deletedAt = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public int getSubcatId() {
		return subcatId;
	}

	public void setSubcatId(int subcatId) {
		this.subcatId = subcatId;
	}

	public int getRawProductId() {
		return rawProductId;
	}

	public void setRawProductId(int rawProductId) {
		this.rawProductId = rawProductId;
	}

	public int getColorId() {
		return colorId;
	}

	public void setColorId(int colorId) {
		this.colorId = colorId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getCatText() {
		return catText;
	}

	public void setCatText(String catText) {
		this.catText = catText;
	}

	public String getSubcatText() {
		return subcatText;
	}

	public void setSubcatText(String subcatText) {
		this.subcatText = subcatText;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getInternalReference() {
		return internalReference;
	}

	public void setInternalReference(String internalReference) {
		this.internalReference = internalReference;
	}

	public String getColorCode() {
		return colorCode;
	}

	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}

	public String getUserImageArr() {
		return userImageArr;
	}

	public void setUserImageArr(String userImageArr) {
		this.userImageArr = userImageArr;
	}

	public String getCanvasWidth() {
		return canvasWidth;
	}

	public void setCanvasWidth(String canvasWidth) {
		this.canvasWidth = canvasWidth;
	}

	public String getCanvasHeight() {
		return canvasHeight;
	}

	public void setCanvasHeight(String canvasHeight) {
		this.canvasHeight = canvasHeight;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPngFile() {
		return pngFile;
	}

	public void setPngFile(String pngFile) {
		this.pngFile = pngFile;
	}

	public String getSvgFile() {
		return svgFile;
	}

	public void setSvgFile(String svgFile) {
		this.svgFile = svgFile;
	}

	public String getPdfFile() {
		return pdfFile;
	}

	public void setPdfFile(String pdfFile) {
		this.pdfFile = pdfFile;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEditModeArr() {
		return editModeArr;
	}

	public void setEditModeArr(String editModeArr) {
		this.editModeArr = editModeArr;
	}

	public String getProductArr() {
		return productArr;
	}

	public void setProductArr(String productArr) {
		this.productArr = productArr;
	}

	public String getPngOutputArr() {
		return pngOutputArr;
	}

	public void setPngOutputArr(String pngOutputArr) {
		this.pngOutputArr = pngOutputArr;
	}

	public String getOutputArr() {
		return outputArr;
	}

	public void setOutputArr(String outputArr) {
		this.outputArr = outputArr;
	}

	public List<MainProductView> getMainProductView() {
		return mainProductView;
	}

	public void setMainProductView(List<MainProductView> mainProductView) {
		this.mainProductView = mainProductView;
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
		return "MainProduct [id=" + id + ", catId=" + catId + ", subcatId=" + subcatId + ", rawProductId="
				+ rawProductId + ", colorId=" + colorId + ", quantity=" + quantity + ", sessionId=" + sessionId
				+ ", userType=" + userType + ", size=" + size + ", internalReference=" + internalReference
				+ ", colorCode=" + colorCode + ", status=" + status + ", mainProductView=" + mainProductView + "]";
	}
	
}
