package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="service_provider")
public class ServiceProvider 
{
	private Integer serviceProviderId;
	
	private Double Amount;
	private String status;
	private User user;
	private List<Orders>order=new ArrayList<>();
	private Services service;
	public ServiceProvider() {
		// TODO Auto-generated constructor stub
	}
	public ServiceProvider(Double amount, String status) {
		super();
		Amount = amount;
		this.status = status;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getServiceProviderId() {
		return serviceProviderId;
	}
	public void setServiceProviderId(Integer serviceProviderId) {
		this.serviceProviderId = serviceProviderId;
	}
	
	
	public Double getAmount() {
		return Amount;
	}
	public void setAmount(Double amount) {
		Amount = amount;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@OneToOne
	 @JoinColumn(name = "user_id")
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@OneToMany(mappedBy = "spId", cascade = CascadeType.ALL, orphanRemoval = true)
	public List<Orders> getOrder() {
		return order;
	}
	public void setOrder(List<Orders> order) {
		this.order = order;
	}
	@ManyToOne
    @JoinColumn(name = "service_id")
	public Services getService() {
		return service;
	}
	public void setService(Services service) {
		this.service = service;
	}
	public void addOrders(Orders o)
	{
		order.add(o);
		o.setSpId(this);
	}
	public void removeOrders(Orders o)
	{
		order.remove(o);
		o.setSpId(null);
	}
	@Override
	public String toString() {
		return "ServiceProvider [serviceProviderId=" + serviceProviderId + ", Amount=" + Amount + ", status=" + status
				+ "]";
	}
	
	
	
	

}
