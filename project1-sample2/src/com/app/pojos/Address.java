package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name = "user_address")
public class Address 
{
	private Integer addressId,flatNo,pinCode;
	private String houseName,apartmentName,area,city,state,country,cellNo;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Address(Integer flatNo, Integer pinCode, String houseName, String apartmentName, String area, String city,
			String state, String country, String cellNo) {
		super();
		this.flatNo = flatNo;
		this.pinCode = pinCode;
		this.houseName = houseName;
		this.apartmentName = apartmentName;
		this.area = area;
		this.city = city;
		this.state = state;
		this.country = country;
		this.cellNo = cellNo;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	
	public Integer getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(Integer flatNo) {
		this.flatNo = flatNo;
	}

	public String getHouseName() {
		return houseName;
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	public String getApartmentName() {
		return apartmentName;
	}

	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCellNo() {
		return cellNo;
	}
	public void setCellNo(String cellNo) {
		this.cellNo = cellNo;
	}
	

	public Integer getPinCode() {
		return pinCode;
	}



	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}



	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", flatNo=" + flatNo + ", pinCode=" + pinCode + ", houseName="
				+ houseName + ", apartmentName=" + apartmentName + ", area=" + area + ", city=" + city + ", state="
				+ state + ", country=" + country + ", cellNo=" + cellNo + "]";
	}



	
	
	

}
