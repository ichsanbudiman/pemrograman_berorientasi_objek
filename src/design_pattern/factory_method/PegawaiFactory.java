package design_pattern.factory_method;

public class PegawaiFactory {
    public Pegawai createManager(String nama){
        return new Pegawai(nama, "Manager", 15000000,20000000);
    }

    public Pegawai createStaff(String nama){
        return new Pegawai(nama, "Staff", 7000000,500000);
    }
}
