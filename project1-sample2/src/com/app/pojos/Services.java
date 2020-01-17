package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Services 
{
	private Integer serviceId;
	private String serviceName;
	private List<ServiceProvider>sp=new ArrayList<>();
	
	public Services() {
		// TODO Auto-generated constructor stub
	}
	public Services(String serviceName) {
		super();
		this.serviceName = serviceName;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getServiceId() {
		return serviceId;
	}
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	@OneToMany(mappedBy = "service", cascade = CascadeType.ALL, orphanRemoval = true)
	public List<ServiceProvider> getSp() {
		return sp;
	}
	public void setSp(List<ServiceProvider> sp) {
		this.sp = sp;
	}
	@Override
	public String toString() {
		return "Services [serviceId=" + serviceId + ", serviceName=" + serviceName + "]";
	}
	

}
