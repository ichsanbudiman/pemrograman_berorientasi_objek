package design_pattern.factory_method;

public class App {
    public static void main(String[] args) {
        Pegawai p1 = new PegawaiFactory().createManager("Heru");
        Pegawai p5 = new PegawaiFactory().createStaff("Hanny");


    }
}
