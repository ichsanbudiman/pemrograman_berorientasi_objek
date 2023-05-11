package polymorphism2;

public class PaymentShopee implements IPayment {

    @Override
    public void bayar(Double total) {
        System.out.println("Bayar dengan metode shopee pay sebesar :"+total);
    }
    
}
