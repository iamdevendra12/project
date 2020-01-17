package com.app.pojos;

import java.util.Date;

import javax.persistence.*;


@Entity
public class Orders 
{
	private Integer orderId;

	private Date order_date;
	private Double totalAmount;
	private User userId;
	private ServiceProvider spId;
	
	
	
	
	public Orders(Date order_date, Double totalAmount) {
		super();
		this.order_date = order_date;
		this.totalAmount = totalAmount;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	
	
	@Temporal(TemporalType.DATE)
	@Column(name = "order_date")
	//dateandtimeformat
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	@ManyToOne
    @JoinColumn(name = "user_id")
	public User getUserId() {
		return userId;
	}
	public void setUserId(User userId) {
		this.userId = userId;
	}
	@ManyToOne
    @JoinColumn(name = "sp_id")
	public ServiceProvider getSpId() {
		return spId;
	}
	public void setSpId(ServiceProvider spId) {
		this.spId = spId;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", order_date=" + order_date + ", totalAmount=" + totalAmount + "]";
	}
	
	

}
