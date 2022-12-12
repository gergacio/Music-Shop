import enums.Description;
import org.junit.Before;
import org.junit.Test;
import shop.Product;

import static org.junit.Assert.assertEquals;

public class ProductTest {
    Product product;
    @Before
    public void before(){
        product = new Product(Description.BARREL, 50.00, 75.00);
    }
    @Test
    public void hasPriceBuy(){
        assertEquals(50.00, product.getPriceBuy(),0);
    }
    @Test
    public void hasPriceSell(){
        assertEquals(75.00, product.getPriceSell(),0);
    }
    @Test
    public void hasCalculateMarkup(){
        assertEquals(0.50,product.calculateMarkup(),0);
    }
}
