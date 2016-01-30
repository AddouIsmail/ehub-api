package ehub.api.Entities;

import java.util.Date;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

@Entity
public class Order {
	@Id
    private String id;
	/** Logical foreign keys **/
    private String idClient;
    /** -------------------- **/
    private Date orderDate;
    private Double orderAmount;
    private int orderDeadline;
    private String orderState;
    private String shipLocation;
    private double shippingPrice;    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public int getOrderDeadline() {
        return orderDeadline;
    }

    public void setOrderDeadline(int orderDeadline) {
        this.orderDeadline = orderDeadline;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public String getShipLocation() {
        return shipLocation;
    }

    public void setShipLocation(String shipLocation) {
        this.shipLocation = shipLocation;
    }

    public double getShippingPrice() {
        return shippingPrice;
    }

    public void setShippingPrice(double shippingPrice) {
        this.shippingPrice = shippingPrice;
    }

	public String getIdClient() {
		return idClient;
	}

	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}    
}
