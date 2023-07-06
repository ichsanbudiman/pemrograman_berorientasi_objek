package design_pattern.builder;

public class App {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("001", "Heru", "705", "saintek");
        Mahasiswa m2 = new Mahasiswa("002", "Heri", m1.getKodeJurusan(), m1.getFakultas());

        Mahasiswa m3 = new MahasiswaBuilder()
        .setNim("003")
        .setNama("Joko")
        .setKodeJurusan("705")
        .build();

        Mahasiswa m4 = new MahasiswaBuilder()
        .setNim("004")
        .setNama("Koko")
        .build();
    }
}
