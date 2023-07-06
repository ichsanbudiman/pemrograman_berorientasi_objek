package design_pattern.prototype;

public class App {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("001", "joko", "705", "saintek");
        Mahasiswa m2 = new Mahasiswa("002", "andri", m1.getKodeJurusan(), "saintek");
        Mahasiswa m3 = new Mahasiswa("003", "fany", "705", "saintek");

        Mahasiswa m2 = m1.clone();
        m2.setNama("heru");
        m2.setNim("002");
    }
}
