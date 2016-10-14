package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="ecart_language")
public class Language 
{
	@Id
	@GeneratedValue
	@JsonIgnore
	Integer id;

	@JsonProperty(value="lang")
	String languageName;

	@JsonProperty(value="flag")
	String languageFlag;
	
	@JsonProperty(value="lang_short")
	String languageCode;
	
	@JsonIgnore
	String isDefault,status;
	
	@JsonIgnore
	Integer addedBy,modBy;
	
	@JsonIgnore
	Date createdAt,updatedAt,deletedAt;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLanguageName() {
		return languageName;
	}
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
	public String getLanguageCode() {
		return languageCode;
	}
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
	public String getLanguageFlag() {
		return languageFlag;
	}
	public void setLanguageFlag(String languageFlag) {
		this.languageFlag = languageFlag;
	}
	public String getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getAddedBy() {
		return addedBy;
	}
	public void setAddedBy(Integer addedBy) {
		this.addedBy = addedBy;
	}
	public Integer getModBy() {
		return modBy;
	}
	public void setModBy(Integer modBy) {
		this.modBy = modBy;
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
		return "Language [id=" + id + ", languageName=" + languageName + ", languageCode=" + languageCode
				+ ", languageFlag=" + languageFlag + ", isDefault=" + isDefault + ", status=" + status + ", addedBy="
				+ addedBy + ", modBy=" + modBy + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ ", deletedAt=" + deletedAt + "]";
	}
	
	
	{
	setAddedBy(1);
	setCreatedAt(new Date());
	setDeletedAt(new Date());
	setIsDefault("0");
	setModBy(0);
	setStatus("1");
	setUpdatedAt(new Date());
	}
	

}
