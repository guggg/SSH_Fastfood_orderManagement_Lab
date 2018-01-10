package po;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    
    @Column(nullable = false)
    private String customerName;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private int price;
    
    @Column(nullable = false)
    private int amount;
    
    @Column(nullable = false)
    private int subtotal;

    @Column(nullable = false)
    private Date tDate = new Date();
    
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public Date gettDate() {
        return tDate;
    }

    public void settDate(Date tDate) {
        this.tDate = tDate;
    }

    @Override
    public String toString() {
        return "Orders{" + "id=" + id + ", customerName=" + customerName + ", name=" + name + ", price=" + price + ", amount=" + amount + ", subtotal=" + subtotal + ", tDate=" + tDate + '}';
    }

    
}
