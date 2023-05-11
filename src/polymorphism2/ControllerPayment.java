package polymorphism2;

public class ControllerPayment extends Handler{

    @Override
    public void action(IPayment payment) {
        double subtotal = 100000;
        double ongkos = getOngkos("bdg");
        double potongan = getPotongan("kupon ceria");
        double total =  subtotal+ongkos+potongan;
        payment.bayar(total);
    }
    
    public double getPotongan(String kupon){
        return 1000;
    }

    public double getOngkos(String alamat){
        return 5000;
    }
}
