import Es1.Customer;
import Es1.Order;
import Es1.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

             //SEZIONE TUTTI I PRODOTTI//
        Product Ps5=new Product("Playstation","console",600);
        Product ToyCar=new Product("Car","boys",60);
        Product ToyPlane=new Product("Plane","boys",50);
        Product Lego=new Product("Lego Vespa","boys",20);
        Product HarryBook=new Product("Harry Potter","books",101);
        Product WitcherBook=new Product("Witcher","books",10);
        Product LifeBook=new Product("Life","books",30);
        Product Diapers=new Product("Pampers","baby",26);
        //CREAZIONE DI UN MAGAZZINO DOVE CONTIENE TUTTI I PRODOTTI//
        // ELENCATI SOPRA TRAMITE UNA ARRAYLIST//

        List<Product> magazzino=new ArrayList<>(Arrays.asList(Ps5,ToyCar,ToyPlane,Lego,HarryBook,WitcherBook,LifeBook,Diapers));

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



    }
}
