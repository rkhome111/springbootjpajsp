package model;


import java.security.MessageDigest;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="ecart_adminlogin")
public class AdminUser {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	

	
	@Transient
	String name;
	@Column(name="username")
	String userName;
	String password;
	
	@Column(name="emailId")
	String email;
	
	String userImage,hash,status;
	
	@Column(name="adminLevelId")
	Integer adminLevel;
	

	public Integer getAdminLevel() {
		return adminLevel;
	}
	public void setAdminLevel(Integer adminLevel) {
		this.adminLevel = adminLevel;
	}

	Date lastLogin,addDate,modDate;
	Integer addedBy,modBy;
	
	{
		lastLogin = new Date();
		addDate = new Date();
		modDate=new Date();
		addedBy = 1;
		modBy = 0;
		status = "1";
		hash="";
		userImage="";
		adminLevel = 3;

	}
	
	

	public String getUserImage() {
		return userImage;
	}
	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}
	public String getHash() {
		return hash;
	}
	public void setHash(String hash) {
		this.hash = hash;
	}
	

	public Date getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	public Date getAddDate() {
		return addDate;
	}
	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}
	public Date getModDate() {
		return modDate;
	}
	public void setModDate(Date modDate) {
		this.modDate = modDate;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", userName=" + userName + ", password=" + password + ", email="
				+ email + "]";
	}
	public AdminUser() {
		super();
	}
	public AdminUser(String name,String userName, String password, String email) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getEncryptedPassword()
	{
		return getHashCode(getHashCode());
	}
	
	public String getHashCode()
	{
	    MessageDigest md=null;
	    try{md = MessageDigest.getInstance("MD5");}catch(Exception e){}
	    if(md==null)
	    	return null;
	    
	    md.update((userName+password).getBytes());

	    byte byteData[] = md.digest();
	    StringBuffer sb = new StringBuffer();
	    for (int i = 0; i < byteData.length; i++)
	        sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
	    return sb.toString();
	}
	
	public String getHashCode(String hashCode)
	{
	    MessageDigest md=null;
	    try{md = MessageDigest.getInstance("MD5");}catch(Exception e){}
	    if(md==null)
	    	return null;
	    
	    md.update((hashCode+password).getBytes());

	    byte byteData[] = md.digest();
	    StringBuffer sb = new StringBuffer();
	    for (int i = 0; i < byteData.length; i++)
	        sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
	    return sb.toString();
	}
	
	
	
	
}
