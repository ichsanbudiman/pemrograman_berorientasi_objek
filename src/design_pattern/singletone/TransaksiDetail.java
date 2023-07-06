package design_pattern.singletone;

public class TransaksiDetail {
    private String idTransaksi;
    private String namaBarang;

    public TransaksiDetail(String idTransaksi, String namaBarang){
        this.idTransaksi = idTransaksi;
        this.namaBarang = namaBarang;
    }

    public void save(){
        ConnectionHandler.getConnection().sql("insert into trx_detail values("+idTransaksi+","+namaBarang+")");
    }


}   