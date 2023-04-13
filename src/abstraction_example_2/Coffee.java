package abstraction_example_2;

public class Coffee {
    private CoffeeSelection selection;
    private double quantity;
  	
    public Coffee(CoffeeSelection selection, double quantity) {
        this.selection = selection;
        this. quantity = quantity;
    }
    public CoffeeSelection getSelection() {
		return selection;
	}

	public double getQuantity() {
		return quantity;
	}

}