package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class User 
{
	private Integer userId;
	private String userName,email,password;
	private UserRole role;
	private Address address;
	private List<Orders> orders = new ArrayList<>();
	private ServiceProvider serviceProvider;

	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String userName, String email, String password, UserRole role, Address address) {
		super();
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.role = role;
		this.address = address;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Column( unique = true)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(length = 20, nullable = false)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Enumerated(EnumType.STRING)
	@Column(name = "user_role", length = 20)
	public UserRole getRole() {
		return role;
	}
	public void setRole(UserRole role) {
		this.role = role;
	}
	@OneToOne(cascade = CascadeType.ALL,orphanRemoval = true)
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@OneToMany(mappedBy = "userId", cascade = CascadeType.ALL, orphanRemoval = true)
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	@OneToOne(mappedBy = "user",cascade = CascadeType.ALL,orphanRemoval = true)
	public ServiceProvider getServiceProvider() {
		return serviceProvider;
	}
	public void setServiceProvider(ServiceProvider serviceProvider) {
		this.serviceProvider = serviceProvider;
	}
	//helper method to get orders
	public void addOrders(Orders o)
	{
		orders.add(o);
		o.setUserId(this);
	}
	public void removeOrders(Orders o)
	{
		orders.remove(o);
		o.setUserId(null);
	}
	public void addSp(ServiceProvider sp)
	{
		this.serviceProvider=sp;
		
		sp.setUser(this);
	}
	public void removesp(ServiceProvider sp)
	{
        this.serviceProvider=sp;
		
		sp.setUser(null);
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + ", password=" + password
				+ ", role=" + role + ", address=" + address + "]";
	}
	
	
	
}
