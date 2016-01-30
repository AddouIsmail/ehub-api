package ehub.api.Entities;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;


public class OrderLines {
    @Id
    private String id;
    /** Logical foreign keys **/
    private String idOrder;
    private String idProduct;
    /** -------------------- **/
    private int quantity;

    public String getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(String idOrder) {
        this.idOrder = idOrder;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString(){
        return "orderline";
    }
}
