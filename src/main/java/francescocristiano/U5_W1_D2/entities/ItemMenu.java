package francescocristiano.U5_W1_D2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Setter
@Getter
public abstract class ItemMenu {
    private String name;
    private double price;
    private int calories;
}
