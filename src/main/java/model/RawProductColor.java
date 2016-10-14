package model;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.IndexColumn;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name="ecart_rawproducts_color")
@GenericGenerator(name="g1",strategy="increment")
public class RawProductColor
{
	@Id
	@GeneratedValue(generator="g1")
	Integer id;
	
	Integer colorId,orderColor;
	String internalReferences;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="rawProductsColorId")
	@LazyCollection(LazyCollectionOption.FALSE)
	@IndexColumn(name="orderImage", nullable=true)
	List<RawProductView> rawProductView;
	
	{
		orderColor = 0;
		rawProductView = new LinkedList<>();
		rawProductView.add(new RawProductView());
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getColorId() {
		return colorId;
	}
	public void setColorId(Integer colorId) {
		this.colorId = colorId;
	}
	public Integer getOrderColor() {
		return orderColor;
	}
	public void setOrderColor(Integer orderColor) {
		this.orderColor = orderColor;
	}
	public String getInternalReferences() {
		return internalReferences;
	}
	public void setInternalReferences(String internalReferences) {
		this.internalReferences = internalReferences;
	}
	public List<RawProductView> getRawProductView() {
		return rawProductView;
	}
	public void setRawProductView(List<RawProductView> rawProductView) {
		this.rawProductView = rawProductView;
	}
	@Override
	public String toString() {
		return "\nRawProductColor [id=" + id + ", colorId=" + colorId + ", orderColor=" + orderColor
				+ ", internalReferences=" + internalReferences + ", rawProductView=" + rawProductView + "]\n";
	}
	@Override
	public int hashCode() {
		return id*100;
	}
	@Override
	public boolean equals(Object obj) {
		RawProductColor other = (RawProductColor)obj;
		return this.getColorId().equals(other.getColorId());
	}

	
	

	
}
