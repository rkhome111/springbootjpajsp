package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
@Table(name="ecart_text_effect")
@GenericGenerator(name="g1",strategy="increment")
public class TextEffect 
{
	@Id
	@GeneratedValue(generator="g1")
	@JsonIgnore
	Integer id;
	
	@JsonProperty("effectType")
	String  textEffectName;
	
	@JsonProperty("thumb")
	String textEffectImage;
	@JsonIgnore
	String status;
	@JsonIgnore
	Integer createdBy;
	@JsonIgnore
	Integer updatedBy;
	@JsonIgnore
	Date    createdAt;
	@JsonIgnore
	Date    updatedAt;
	@JsonIgnore
	Date    deletedAt;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTextEffectName() {
		return textEffectName;
	}
	public void setTextEffectName(String textEffectName) {
		this.textEffectName = textEffectName;
	}
	public String getTextEffectImage() {
		return textEffectImage;
	}
	public void setTextEffectImage(String textEffectImage) {
		this.textEffectImage = textEffectImage;
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
		return "TextEffect [id=" + id + ", textEffectName=" + textEffectName + ", textEffectImage=" + textEffectImage
				+ ", status=" + status + ", createdBy=" + createdBy + "]";
	}
	
	
	
	

}
