package francescocristiano.U5_W1_D2.entities;


import francescocristiano.U5_W1_D2.enums.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Pizza extends ItemMenu {
    private List<Topping> toppings;
    private Size size;


    public Pizza(String name, double price, int calories, List<Topping> toppings, Size size) {
        super(name, price, calories);
        this.size = size;
        this.setName(customName(size, name));
        this.setPrice(customPrice(size, price));
        this.setCalories(customCalories(size, calories));
        this.toppings = baseToppings(toppings);
    }


    private String customName(Size size, String name) {
        if (size == Size.XL) {
            return name + " XL";
        }
        return name;
    }

    private double customPrice(Size size, double price) {
        if (size == Size.XL) {
            return price * 1.5;
        }
        return price;
    }

    private int customCalories(Size size, int calories) {
        if (size == Size.XL) {
            return (int) (calories * 1.5);
        }
        return calories;
    }


    private List<Topping> baseToppings(List<Topping> toppings) {
        Topping mozzarella = new Topping("Mozzarella", 0.99, 35);
        Topping tomato = new Topping("Tomato", 0.69, 22);
        List<Topping> baseToppings = new ArrayList<>();
        baseToppings.add(mozzarella);
        baseToppings.add(tomato);
        baseToppings.addAll(toppings);
        return baseToppings;
    }


/*    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", toppings=" + toppings.stream().map(Topping::getName).collect(Collectors.joining(", ")) +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }*/

    @Override
    public String toString() {
        return "Pizza{" +
                super.toString() +
                "toppings=" + toppings +
                ", size=" + size +
                '}';
    }
}
