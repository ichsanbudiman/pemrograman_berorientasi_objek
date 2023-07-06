package design_pattern.singletone;

public class Transaksi {
   private String idTransaksi;
   private int total;

   public Transaksi(String idTransaksi, int total){
    this.idTransaksi = idTransaksi;
    this.total = total;
   }

   public void save(){
      ConnectionHandler.getConnection().sql("insert into transaksi values("+idTransaksi+","+total+");");
   }
}
