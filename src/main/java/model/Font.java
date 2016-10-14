package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="ecart_font")
@GenericGenerator(name="g1",strategy="increment")
public class Font {
	@Id
	@GeneratedValue(generator="g1")
	Integer id;
	
	String  fontName,fontImage,fontTtf,fontZ,fontCtg,fontPhp,status;
	
	
	Integer createdBy;
	Integer updatedBy;
	Date    createdAt;
	Date    updatedAt;
	Date    deletedAt;
	
	{	
		fontName="";
		fontImage="";
		fontTtf="";
		fontZ="";
		fontCtg="";
		fontPhp="";
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
	public String getFontName() {
		return fontName;
	}
	public void setFontName(String fontName) {
		this.fontName = fontName;
	}
	public String getFontImage() {
		return fontImage;
	}
	public void setFontImage(String fontImage) {
		this.fontImage = fontImage;
	}
	public String getFontTtf() {
		return fontTtf;
	}
	public void setFontTtf(String fontTtf) {
		this.fontTtf = fontTtf;
	}
	public String getFontZ() {
		return fontZ;
	}
	public void setFontZ(String fontZ) {
		this.fontZ = fontZ;
	}
	public String getFontCtg() {
		return fontCtg;
	}
	public void setFontCtg(String fontCtg) {
		this.fontCtg = fontCtg;
	}
	public String getFontPhp() {
		return fontPhp;
	}
	public void setFontPhp(String fontPhp) {
		this.fontPhp = fontPhp;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
		return "Font [id=" + id + ", fontName=" + fontName + ", fontImage=" + fontImage + ", fontTtf=" + fontTtf
				+ ", fontZ=" + fontZ + ", fontCtg=" + fontCtg + ", fontPhp=" + fontPhp + ", status=" + status
				+ ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt + ", deletedAt=" + deletedAt + "]";
	}
	
	

}
