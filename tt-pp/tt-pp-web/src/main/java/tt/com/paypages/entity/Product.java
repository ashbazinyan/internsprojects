package tt.com.paypages.entity;

import javax.persistence.*;

/**
 * Created by bellag on 2/4/16.
 */
@Entity
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private long categoryId;
    private String description;
    private int available;
    private int sold;
    private long sellerId;
    private long ticketId;

    public Product(String name, long categoryId, String description, int available, int sold, long sellerId, long ticketId) {
        this.name = name;
        this.categoryId = categoryId;
        this.description = description;
        this.available = available;
        this.sold = sold;
        this.sellerId = sellerId;/*
        service.updateProduct(2);
       for(Product product:  service.getAllProducts())
       {
           System.out.println(product.getName());
       }*/
        this.ticketId = ticketId;
    }

    public Product() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public long getSellerId() {
        return sellerId;
    }

    public void setSellerId(long sellerId) {
        this.sellerId = sellerId;
    }

    public long getTicketId() {
        return ticketId;
    }

    public void setTicketId(long ticketId) {
        this.ticketId = ticketId;
    }


}
