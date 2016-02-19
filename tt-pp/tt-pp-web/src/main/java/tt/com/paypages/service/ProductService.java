package tt.com.paypages.service;

import tt.com.paypages.entity.Product;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by bellag on 2/4/16.
 */
public class ProductService {

    EntityManagerFactory entityManagerFactory;


    public ProductService() {
        entityManagerFactory = Persistence.createEntityManagerFactory("imusic");

    }


    public List<Product> getAllProducts() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<Product> productList = entityManager.createQuery("from Product", Product.class).getResultList();
        entityManager.getTransaction().begin();

        entityManager.close();

        return productList;
    }

    public void createProduct() {
        Product product = new Product();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        product.setAvailable(1);
        product.setCategoryId(1);
        product.setDescription("test_description");
        product.setName("test_name");
        product.setSellerId(1);
        product.setTicketId(1);


        entityManager.getTransaction().begin();
        entityManager.persist(product);
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    /* Update Product */
    public void updateProduct(long id) {
        Product product;
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        product = entityManager.find(Product.class,id);
        product.setName("Test2");
        entityManager.getTransaction().commit();
        entityManager.close();
    }
        /* Remove Product */
    public void removeProduct(long id){
        Product product;
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        product = entityManager.find(Product.class,id);
        entityManager.remove(product);
        entityManager.getTransaction().commit();
        entityManager.close();

    }


    public static void main(String args[]) {
        ProductService service = new ProductService();
/*
        service.updateProduct(2);
       for(Product product:  service.getAllProducts())
       {
           System.out.println(product.getName());
       }*/
//        service.removeProduct(3);
    }


}
