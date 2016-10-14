package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="ecart_google_fonts_file")
@GenericGenerator(name="g1",strategy="increment")
public class FontFile
{
	@Id
	@GeneratedValue(generator="g1")
	Integer id;
	
	@Column(name="file_normal")
	String fileNormal;
	@Column(name="file_bold")
	String fileBold;
	@Column(name="file_italic")
	String fileItalic;
	@Column(name="file_bolditalic")
	String fileBoldItalic;
	
	{
		fileNormal="";
		fileBold = "";
		fileItalic ="";
		fileBoldItalic = "";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFileNormal() {
		return fileNormal;
	}
	public void setFileNormal(String fileNormal) {
		this.fileNormal = fileNormal;
	}
	public String getFileBold() {
		return fileBold;
	}
	public void setFileBold(String fileBold) {
		this.fileBold = fileBold;
	}
	public String getFileItalic() {
		return fileItalic;
	}
	public void setFileItalic(String fileItalic) {
		this.fileItalic = fileItalic;
	}
	public String getFileBoldItalic() {
		return fileBoldItalic;
	}
	public void setFileBoldItalic(String fileBoldItalic) {
		this.fileBoldItalic = fileBoldItalic;
	}
	@Override
	public String toString() {
		return "FontFile [id=" + id + ", fileNormal=" + fileNormal + ", fileBold=" + fileBold + ", fileItalic="
				+ fileItalic + ", fileBoldItalic=" + fileBoldItalic + "]";
	}
	
	

}
