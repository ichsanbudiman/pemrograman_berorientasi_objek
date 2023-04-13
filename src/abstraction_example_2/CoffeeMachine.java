package abstraction_example_2;
import java.util.Map;


public class CoffeeMachine {
    private Map<CoffeeSelection, CoffeeBean> beans;
	
    public CoffeeMachine(Map<CoffeeSelection, CoffeeBean> beans) { 
         this.beans = beans;
    }

    public Coffee brewCoffee(CoffeeSelection selection) throws CoffeeException {
		switch (selection) {
			case FILTER_COFFEE:
				return brewFilterCoffee(selection,beans.get(selection));
				
			case ESPRESSO:
				return brewEspresso(selection,beans.get(selection));
							
			default:
				throw new CoffeeException("CoffeeSelection ["+selection+"] not supported!");
		}
	}

	private Coffee brewEspresso(CoffeeSelection selection,CoffeeBean bean) {
		System.out.println("Making ..."+bean.getName());
        bean.setQuantity(bean.getQuantity()-10);
		// brew an espresso
		return new Coffee(selection, 1);
	}

	private Coffee brewFilterCoffee(CoffeeSelection selection,CoffeeBean bean) {
		System.out.println("Making ..."+bean.getName());
        bean.setQuantity(bean.getQuantity()-15);
		return new Coffee(selection,1);
	}
}
