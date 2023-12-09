package Esercizi;

import Esercizi.Customer;
import Esercizi.Order;
import Esercizi.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

             //SEZIONE TUTTI I PRODOTTI//
        Product Ps5=new Product("Playstation","console",600);
        Product HarryBook=new Product("Harry Potter","books",101);
        Product WitcherBook=new Product("Witcher","books",10);
        Product LifeBook=new Product("Life","books",30);
        Product Diapers=new Product("Pampers","baby",26);
        Product ToyCar=new Product("Car","boys",60);
        Product ToyPlane=new Product("Plane","boys",50);
        Product Lego=new Product("Lego Vespa","boys",20);

        //CREAZIONE DI UN MAGAZZINO DOVE CONTIENE TUTTI I PRODOTTI//
        // ELENCATI SOPRA TRAMITE UNA ARRAYLIST//

        List<Product> magazzino=new ArrayList<>(Arrays.asList(Ps5,HarryBook,WitcherBook,LifeBook,Diapers,ToyCar,ToyPlane,Lego));

        //SEZIONE CUTOMERS(CLIENTI)//
        Customer Massimo=new Customer("Massimo Boldi",1);
        Customer Cristian=new Customer("Cristian De Sica",2);
        Customer Paolo=new Customer("Paolo Bonolis",3);
        Customer Luca=new Customer("Luca Laurenti",4);

        //SEZIONE ORDINI//
        Order MassimoOrder=new Order(Massimo);
        Order CristianOrder=new Order(Cristian);
        Order PaoloOrder=new Order(Paolo);
        Order LucaOrder=new Order(Luca);
        Order MassimoOrder2=new Order(Massimo);

        MassimoOrder.addProduct(magazzino.get(0));
        MassimoOrder.addProduct(magazzino.get(1));
        MassimoOrder.addProduct(magazzino.get(4));

        CristianOrder.addProduct(magazzino.get(2));
        CristianOrder.addProduct(magazzino.get(3));
        CristianOrder.addProduct(magazzino.get(0));

        PaoloOrder.addProduct(magazzino.get(1));
        PaoloOrder.addProduct(magazzino.get(4));

        LucaOrder.addProduct(magazzino.get(4));

        MassimoOrder2.addProduct(magazzino.get(0));

        List<Order> OrderList=new ArrayList<>(Arrays.asList(MassimoOrder,CristianOrder,PaoloOrder,LucaOrder,MassimoOrder2));

        System.out.println("------------------------ESERCIZIO 1-------------------------");
       List<Product> BookDesired= magazzino.stream().filter(product -> product.getCategory().equals("books") && product.getPrice()>100).toList();
       BookDesired.forEach(System.out::println);

        System.out.println("------------------------ESERCIZIO 2-------------------------");
        List<Order> BabiesOrder=OrderList.stream().filter(order ->
        order.getProducts().stream().anyMatch(product -> product.getCategory().equals("baby"))).toList();
        BabiesOrder.forEach(System.out::println);

        System.out.println("------------------------ESERCIZIO 3-------------------------");
        List<Product>DiscountedBoys=magazzino.stream().filter(product -> product.getCategory().equals("boys")).map(product ->
        {product.setPrice(product.getPrice()*0.90);
        return product;
        }).toList();
        DiscountedBoys.forEach(System.out::println);

        System.out.println("------------------------ESERCIZIO 4-------------------------");
        List<Order>Tier2Order=OrderList.stream().filter(order -> order.getCustomer().getTier()==2
                && order.getOrderDate().isAfter(LocalDate.parse("2023-12-08"))
                && order.getOrderDate().isBefore(LocalDate.parse("2023-12-10"))).toList();

        List<Product> Tier2Oproducts=new ArrayList<>();
        Tier2Order.forEach(order ->{Tier2Oproducts.addAll(order.getProducts());});
        Tier2Oproducts.forEach(System.out::println);
    }
}
