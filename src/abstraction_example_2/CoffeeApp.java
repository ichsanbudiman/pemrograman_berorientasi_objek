package abstraction_example_2;

import java.util.HashMap;
import java.util.Map;

public class CoffeeApp {
    public static void main(String[] args) {
        // create a Map of available coffee beans
        Map<CoffeeSelection, CoffeeBean> beans = new HashMap<CoffeeSelection, CoffeeBean>();
        beans.put(CoffeeSelection.ESPRESSO, 
            new CoffeeBean("My favorite espresso bean", 1000));
        beans.put(CoffeeSelection.FILTER_COFFEE, 
            new CoffeeBean("My favorite filter coffee bean", 1000));

        // get a new CoffeeMachine object
        CoffeeMachine machine = new CoffeeMachine(beans);

        // brew a fresh coffee
        try {
	    Coffee espresso = machine.brewCoffee(CoffeeSelection.FILTER_COFFEE);
        System.out.println(espresso.getSelection());
        System.out.println(espresso.getQuantity());
	} catch(CoffeeException  e) {
	    e.printStackTrace();
        }
    } // end main
}
