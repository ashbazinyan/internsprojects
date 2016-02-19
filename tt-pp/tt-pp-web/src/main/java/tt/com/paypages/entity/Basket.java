package tt.com.paypages.entity;

import javax.persistence.*;

/**
 * Created by bellag on 2/5/16.
 */
@Entity
@Table(name = "basket")
public class Basket {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int status;


    public Basket() {
    }

    public Basket(int status) {
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Basket{" +
                "id=" + id +
                ", status=" + status +
                '}';
    }
}
