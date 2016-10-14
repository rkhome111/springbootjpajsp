package model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="ecart_google_fonts")
@GenericGenerator(name="g1",strategy="increment")
public class GoogleFont 
{
	@Id
	@GeneratedValue(generator="g1")
	Integer id;
	String title;
	boolean normal,bold,italic,bolditalic;
	Date    deletedAt;
	
	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="google_font_id")
//	@MapsId(value="google_font_id")
	@PrimaryKeyJoinColumn
	FontFile fontFile;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isNormal() {
		return normal;
	}
	public void setNormal(boolean normal) {
		this.normal = normal;
	}
	public boolean isBold() {
		return bold;
	}
	public void setBold(boolean bold) {
		this.bold = bold;
	}
	public boolean isItalic() {
		return italic;
	}
	public void setItalic(boolean italic) {
		this.italic = italic;
	}
	public boolean isBolditalic() {
		return bolditalic;
	}
	public void setBolditalic(boolean bolditalic) {
		this.bolditalic = bolditalic;
	}
	public Date getDeletedAt() {
		return deletedAt;
	}
	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}
	public FontFile getFontFile() {
		return fontFile;
	}
	public void setFontFile(FontFile fontFile) {
		this.fontFile = fontFile;
	}
	@Override
	public String toString() {
		return "GoogleFont [id=" + id + ", title=" + title + ", normal=" + normal + ", bold=" + bold + ", italic="
				+ italic + ", bolditalic=" + bolditalic + ", deletedAt=" + deletedAt + ", fontFile=" + fontFile + "]";
	}
	

	
	
	
}
