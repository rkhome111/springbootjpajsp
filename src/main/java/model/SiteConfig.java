package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="system_config")
public class SiteConfig 
{
	 @Id
	 @GeneratedValue
	 Integer id;
	
	 String siteName,siteEmail,contactUs,clientUrl,defaultSelectedText;
	 boolean textEffectControlShow;
	 Integer siteOnline;
	 
	 

	public Integer getSiteOnline() {
		return siteOnline;
	}
	public void setSiteOnline(Integer siteOnline) {
		this.siteOnline = siteOnline;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	public String getSiteEmail() {
		return siteEmail;
	}
	public void setSiteEmail(String siteEmail) {
		this.siteEmail = siteEmail;
	}
	public String getContactUs() {
		return contactUs;
	}
	public void setContactUs(String contactUs) {
		this.contactUs = contactUs;
	}
	public String getClientUrl() {
		return clientUrl;
	}
	public void setClientUrl(String clientUrl) {
		this.clientUrl = clientUrl;
	}
	public String getDefaultSelectedText() {
		return defaultSelectedText;
	}
	public void setDefaultSelectedText(String defaultSelectedText) {
		this.defaultSelectedText = defaultSelectedText;
	}
	public boolean isTextEffectControlShow() {
		return textEffectControlShow;
	}
	public void setTextEffectControlShow(boolean textEffectControlShow) {
		this.textEffectControlShow = textEffectControlShow;
	}
	@Override
	public String toString() {
		return "SiteConfig [id=" + id + ", siteName=" + siteName + ", siteEmail=" + siteEmail + ", contactUs="
				+ contactUs + ", clientUrl=" + clientUrl + ", defaultSelectedText=" + defaultSelectedText
				+ ", textEffectControlShow=" + textEffectControlShow + ", siteOnline=" + siteOnline + "]";
	}

	
	 
	 
	 
	

}
