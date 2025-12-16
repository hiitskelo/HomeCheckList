package matteo.Entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class ShoppingList {

    private List<ShoppingElement> list = new ArrayList<>();
    private LocalDate listDate;
    private Shop shop;
}
