package shop;

import behavior.ISell;

import java.util.*;
import java.util.stream.Collectors;

public class Shop{
    List<ISell> stock;
    public Shop(){
        this.stock = new ArrayList<>();
    };
    public void addToStock(ISell product){
        this.stock.add(product);
    }
    public Product getProduct(Product product){
       if(this.stock.contains(product)){
           return product;
       }
       return null;
    }
    public void removeFromStock(ISell product){
        this.stock.remove(product);
    }
    public int getStockSize() {
        return this.stock.size();
    }

    public ISell getFirstProductInStock(){
        return this.stock.get(0);
    }
    public void sort(){
       this.stock.stream().map(o -> (Product)(o)).sorted((a,b) -> b.compareTo(a)).collect(Collectors.toList());
    }

}
