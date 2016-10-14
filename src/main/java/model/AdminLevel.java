package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ecart_adminlevel")
public class AdminLevel 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	String name,status;
	
	
	
	public AdminLevel() {
		super();
	}
	public AdminLevel(String name, String status) {
		super();
		this.name = name;
		this.status = status;
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
	
	
	
	

}
