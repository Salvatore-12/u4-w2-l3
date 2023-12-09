package Es1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Order {

    private String status;
    private Long id;
    private  LocalDate orderDate;
    private  LocalDate deliveryDate;
    private List<Product> products;
    private Customer customer;

    public Order(Customer customer) {
        Random cod = new Random();
        this.id = cod.nextLong();
        this.customer = customer;
        this.status = "is loading";
        this.orderDate = LocalDate.now();
        this.deliveryDate = LocalDate.now().plusWeeks(1);
        this.products = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Order{" +
                "status='" + status + '\'' +
                ", id=" + id +
                ", orderDate=" + orderDate +
                ", deliveryDate=" + deliveryDate +
                ", products=" + products +
                ", customer=" + customer +
                '}';
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product e){
        products.add(e);
    };

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    }

