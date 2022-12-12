import enums.BarrelType;
import enums.BellType;
import enums.Description;
import instruments.parts.Barrel;
import instruments.parts.Bell;
import org.junit.Before;
import org.junit.Test;
import shop.Product;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Barrel barrel;
    Bell bell;
    @Before
    public void before(){
        shop = new Shop();
    }
    @Test
    public void hasStockCount(){
        assertEquals(0, shop.getStockSize());
    }
    @Test
    public void hasAddToStock(){
        barrel = new Barrel(Description.BARREL,50.0, 75.0, BarrelType.TAPERED);
        shop.addToStock(barrel);
        assertEquals(1, shop.getStockSize());
    }
    @Test
    public void hasRemoveFromStock(){
        barrel = new Barrel(Description.BARREL,50.0, 75.0, BarrelType.TAPERED);
        shop.addToStock(barrel);
        shop.removeFromStock(barrel);
        assertEquals(0, shop.getStockSize());
    }
    @Test
    public void hasProduct(){
        bell = new Bell(Description.BELL,50.0, 75.0,BellType.FLAT);
        barrel = new Barrel(Description.BARREL,50.0, 75.0, BarrelType.TAPERED);
        shop.addToStock(bell);
        shop.addToStock(barrel);
        shop.sort();
        Product product = shop.getProduct(barrel);
       // assertEquals(Description.BARREL, product.getDescription());
        assertEquals(bell, shop.getFirstProductInStock());
    }

}
