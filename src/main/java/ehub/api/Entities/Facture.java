package ehub.api.Entities;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;


public class Facture {
    @Id
    private String id;
    /** Logical foreign keys **/
    private String idOrder;
    private String idPaymentMode;
    /** -------------------- **/
    private String totalPrice;    
    
    public String getIdOrder() {
		return idOrder;
	}

	public String getIdPaymentMode() {
		return idPaymentMode;
	}

	public void setIdPaymentMode(String idPaymentMode) {
		this.idPaymentMode = idPaymentMode;
	}

	public void setIdOrder(String idOrder) {
		this.idOrder = idOrder;
	}	

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }
}
