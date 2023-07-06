package design_pattern.builder;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String jenisKelamin;
    private String kodeJurusan;
    private String fakultas;


    public Mahasiswa (String nim, String nama, String kodeJurusan,String fakultas,String jenisKelamin){
        this.nim=nim;
        this.nama=nama;
        this.kodeJurusan=kodeJurusan;
        this.fakultas=fakultas;
        this.jenisKelamin = jenisKelamin;
    }

    public String getFakultas() {
        return fakultas;
    }
    public String getKodeJurusan() {
        return kodeJurusan;
    }
    public String getNama() {
        return nama;
    }
    public String getNim() {
        return nim;
    }
public String getJenisKelamin() {
    return jenisKelamin;
}
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    public void setKodeJurusan(String kodeJurusan) {
        this.kodeJurusan = kodeJurusan;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
}
