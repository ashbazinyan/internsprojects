package tt.com.paypages.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by bellag on 2/5/16.
 */

@Entity
@Table(name="category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private long attributeId;
    private String description;
    private int available;
    private Date creationDate;

    public Category(String name, long attributeId, String description, int available, Date creationDate) {
        this.name = name;
        this.attributeId = attributeId;
        this.description = description;
        this.available = available;
        this.creationDate = creationDate;
    }

    public Category() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(long attributeId) {
        this.attributeId = attributeId;
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

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
