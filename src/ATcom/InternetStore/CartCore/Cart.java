package ATcom.InternetStore.CartCore;

import java.util.*;
import ATcom.InternetStore.DataBaseCore.*;


/**
 * Created by Tanya on 31.05.2016.
 */
public class Cart {
    protected Date creationDate;
    protected String cartID;
    protected List<Product> cartContents;
    //Считаю что лучше ввести поля которые несут информацию о цене продуктов и их количестве в этот класс(точное
    //количество лептопов и смартонов думаю пока не учитывать)
    protected double totalCartPrice;
    protected int totalNumberOrProducts;


    public Cart(){}

    public Cart(String cartID){
        this.cartID=cartID;
        cartContents=new ArrayList<>();
        creationDate=new Date();
        creationDate.getTime();

        totalCartPrice=0;
        totalNumberOrProducts=0;
    }

    public void addItem(Product e) {

//        int id=e.getId();
////        for (Product electronics:this.cartContents){
////            if (electronics.getId()==(id)){
////                //electronics.setQuantity(electronics.getQuantity()+e.getQuantity()); Богдан говорил что продукт не
////                //может содержать строку которая говорит о его количестве на складе(или типа того). Но нужно уточнить
////                //у него как можно реализовать алгоритм подсчета кол-ва продуктов
////                electronics.setPrice(electronics.getPrice()+e.getPrice());
////                return;
////            }
////        }

        totalCartPrice+=e.getPrice();
        totalNumberOrProducts++;
        this.cartContents.add(e);
    }

    public void removeItem(int productID) throws IllegalArgumentException {
        for (Product electronics : this.cartContents) {
            if (electronics.getId()==(productID)) {
//                electronics.setPrice(electronics.getPrice()/electronics.getQuantity());
//                electronics.setQuantity(electronics.getQuantity() - 1);
                //Находим элемент по ID уменьшаем общую цену на цену продукта и уменьшаем общее количество на "1"
                totalCartPrice-=electronics.getPrice();
                totalNumberOrProducts--;
                this.cartContents.remove(electronics);


            } else {
                //Считаю нецелесообразным выкидывать Exception при отсутствии элемента, так как он "садит систему",
                //думаю что в нашем случае лучше вывести на сообщение на консоль об отсутствии элемента, но тут есть
                //одна проблема. Проблема заключается в том что если мы будем хардкодить то в консоле просто выведется
                //сообщение и программа дальше продолжит работу. В качестве решения предлагаю приостановить поток
                //выполнения программы и на консоль вывести что то типа:
                //"Объект не найден!Что бы повторно попробовать удалить объект нажмите "1", что бы продолжить выполнение
                //программы нажмите "2" ".
                throw new IllegalArgumentException("Product with ID" + productID + "isn't found.");
            }
        }
    }


    public double getCartPrice(){
//        double price=0.0d;
//        Iterator<Electronics> iterator=cartContents.iterator();
//        while (iterator.hasNext()){
//            price+=iterator.next().getPrice();
//        }

        return totalCartPrice;
    }


    public String getCartDetails(){
        return cartContents.toString();
    }

    /*public void displayOrderInfo(){
        System.out.println("Order placed by:"+cart.cartID);
        System.out.println(cart.getCartPrice());
        final Iterator<Electronics> it= cart.cartContents.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/

    @Override
    public String toString() {
        return "Cart{" +
                "creationDate=" + creationDate +
                ", cartID='" + cartID + '\'' +
                ", cartContents=" + cartContents +
                ", totalCartPrice=" + totalCartPrice +
                ", totalNumberOrProducts=" + totalNumberOrProducts +
                '}';
    }
}