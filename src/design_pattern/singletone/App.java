package design_pattern.singletone;

public class App {
    public static void main(String[] args) {
        Transaksi t1 = new Transaksi("001", 100000);
        t1.save();
       
        
        TransaksiDetail td1 = new TransaksiDetail("001", "Sabun");
        td1.save();
        TransaksiDetail td2 = new TransaksiDetail("001", "Pasta gigi");
        td2.save();
        TransaksiDetail td3 = new TransaksiDetail("001", "Shampoo");
        td3.save();
    

    }
}
