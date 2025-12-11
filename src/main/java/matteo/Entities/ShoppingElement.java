package matteo.Entities;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter @Setter
public class ShoppingElement {
    private String productName;
    private String productPrice;
    private int productQuantity;
    private Map<String, Float> prices = new HashMap<>();
    private boolean taken;
}
