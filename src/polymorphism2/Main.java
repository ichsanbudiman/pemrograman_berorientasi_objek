package polymorphism2;

public class Main {
    public static void main(String[] args) {
        ControllerPayment cp = new ControllerPayment();

        if(cp.canHandle(Transaction.PAYMENT)){
            PaymentTrf trf = new PaymentTrf();
            PaymentOPO opo = new PaymentOPO();
            cp.action(opo);
        }
    }
}
