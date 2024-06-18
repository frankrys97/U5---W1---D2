package francescocristiano.U5_W1_D2.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Topping extends ItemMenu {

    public Topping(String name, double price, int calories) {
        super(name, price, calories);
    }

   /* @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }*/
}
