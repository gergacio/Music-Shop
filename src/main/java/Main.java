import enums.BellType;
import enums.Description;
import instruments.parts.Bell;
import shop.Shop;

public class Main {
    public static void main(String[] args){
        Shop shop = new Shop();
        Bell bell = new Bell(Description.BELL,50.0,75.0, BellType.FLAT);
        shop.addToStock(bell);
        System.out.println(bell.getBellType());
    }
}
