package francescocristiano.U5_W1_D2.entities;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Drink extends ItemMenu {
    private double size;
    private Double alcoholConcentration;


    public Drink(String name, double price, int calories, double size, Double alcoholConcentration) {
        super(name, price, calories);
        this.size = size;
        this.alcoholConcentration = alcoholConcentration;
    }

/*    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }*/
}
