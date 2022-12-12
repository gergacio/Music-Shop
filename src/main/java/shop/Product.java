package shop;

import behavior.IComparable;
import behavior.ISell;
import enums.Description;

public class Product implements ISell, IComparable {
    private Description description;
    private Double priceBuy;
    private Double priceSell;

    public Product(Description description, Double priceBuy, Double priceSell){
        this.description = description;
        this.priceBuy = priceBuy;
        this.priceSell = priceSell;
    }
    public Description getDescription(){
        return this.description;
    }
    public Double getPriceBuy(){
        return this.priceBuy;
    }
    public Double getPriceSell(){
        return this.priceSell;
    }
    @Override
    public Double calculateMarkup() {
        double markup = (this.getPriceSell() - this.getPriceBuy()) / this.priceBuy;
        //multiply by 100 turn in percentage if you want
        return markup;

    }


    @Override
    public int compareTo(Product product) {
       // this.empAge > e.empAge ? 1 : this.empAge < e.empAge ? -1 : 0;
        return this.description.equals(product.description) ? 1 : this.description.equals(product.description) ? -1 : 0;
    }

}
