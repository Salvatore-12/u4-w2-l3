package Es1;

import java.util.List;
import java.util.Random;

public class Product extends Order {
       private String name;
       private String category;
       private Double price;
       private Long id;

       public Product(List<Product> product, Customer customer, String name, String category, Double price, Long id) {
              super(product, customer);
              this.name = name;
              this.category = category;
              this.price = price;
              Random cod = new Random();
              this.id = id;
       }

       public String getName() {
              return name;
       }

       public void setName(String name) {
              name = name;
       }

       public String getCategory() {
              return category;
       }

       public void setCategory(String category) {
              category = category;
       }

       public Double getPrice() {
              return price;
       }

       public void setPrice(Double price) {
              this.price = price;
       }

       public Long getId() {
              return id;
       }

       public void setId(Long id) {
              this.id = id;
       }

}
