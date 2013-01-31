package br.com.camilolopes.rentcar.domain.bean;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CARS")
public class Car implements Serializable{
	
	private static final long serialVersionUID = -2896368465389020843L;
	@Id
	@GeneratedValue
	private Long id;
	private String manufacter; 
	private String description; 
	private BigDecimal marketValue;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getManufacter() {
		return manufacter;
	}
	public void setManufacter(String manufacter) {
		this.manufacter = manufacter;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getMarketValue() {
		return marketValue;
	}
	public void setMarketValue(BigDecimal marketValue) {
		this.marketValue = marketValue;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((manufacter == null) ? 0 : manufacter.hashCode());
		result = prime * result
				+ ((marketValue == null) ? 0 : marketValue.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Car)) {
			return false;
		}
		Car other = (Car) obj;
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (manufacter == null) {
			if (other.manufacter != null) {
				return false;
			}
		} else if (!manufacter.equals(other.manufacter)) {
			return false;
		}
		if (marketValue == null) {
			if (other.marketValue != null) {
				return false;
			}
		} else if (!marketValue.equals(other.marketValue)) {
			return false;
		}
		return true;
	}
	
}
