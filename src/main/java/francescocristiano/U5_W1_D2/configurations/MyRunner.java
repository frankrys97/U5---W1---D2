package francescocristiano.U5_W1_D2.configurations;

import francescocristiano.U5_W1_D2.entities.Menu;
import francescocristiano.U5_W1_D2.entities.Order;
import francescocristiano.U5_W1_D2.entities.Table;
import francescocristiano.U5_W1_D2.enums.State;
import francescocristiano.U5_W1_D2.enums.StateOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
@PropertySource("application.properties")
public class MyRunner implements CommandLineRunner {

    @Autowired
    private Menu menu;

    @Value("${coverCost}")
    private double coverCost;


    @Override
    public void run(String... args) throws Exception {

        Table table1 = new Table(1, 4, State.FREE);

        Order order1 = new Order(1, table1, List.of(menu.getPizzas().get(new Random().nextInt(menu.getPizzas().size())), menu.getDrinks().get(new Random().nextInt(menu.getDrinks().size())), menu.getToppings().get(new Random().nextInt(menu.getToppings().size())), menu.getPizzas().get(new Random().nextInt(menu.getPizzas().size())), menu.getDrinks().get(new Random().nextInt(menu.getDrinks().size()))), StateOrder.IN_PROGRESS, 4, coverCost);


        System.out.println(order1);
    }
}
