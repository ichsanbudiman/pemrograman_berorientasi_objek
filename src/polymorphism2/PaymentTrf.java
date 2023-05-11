package polymorphism2;

public class PaymentTrf implements IPayment{

    @Override
    public void bayar(Double total) {
        System.out.println("Bayar dengan metode TRF sebesar :"+total);
    }
    
}
