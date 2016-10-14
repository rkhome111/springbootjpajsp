package model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name="ecart_style")
@GenericGenerator(name="g1",strategy="increment")
public class Style 
{
	@Id
	@GeneratedValue(generator="g1")
	Integer id;
	
	String  styleName;
	String  status;
	@OneToMany(cascade={CascadeType.PERSIST,CascadeType.MERGE})
	@LazyCollection(LazyCollectionOption.FALSE)
	 @JoinTable(name="ecart_style_view",joinColumns = @JoinColumn( name="style_id"),
	            inverseJoinColumns = @JoinColumn( name="view_id"))
	List<View> views;
	
	Integer createdBy;
	Integer updatedBy;
	Date    createdAt;
	Date    updatedAt;
	Date    deletedAt;
	
	{
		views = new LinkedList<>();
		status    = "1";
		updatedBy = 0;
		createdAt = new Date();
		updatedAt = new Date();
		deletedAt = new Date();
	}
	 


	


	public List<View> getViews() {
		return views;
	}







	public void setViews(List<View> views) {
		this.views = views;
	}

	






	@Override
	public String toString() {
		return "Style [id=" + id + ", styleName=" + styleName + ", status=" + status + ", views=" + views
				+ ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt + ", deletedAt=" + deletedAt + "]";
	}







	public String getStyleName() {
		return styleName;
	}







	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}







	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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

	
	

}
