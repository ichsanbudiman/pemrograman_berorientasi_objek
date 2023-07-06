package design_pattern.builder;

public class MahasiswaBuilder {
    private String nim;
    private String nama;
    private String jenisKelamin;
    private String kodeJurusan;
    private String fakultas;

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
    public MahasiswaBuilder setFakultas(String fakultas) {
        this.fakultas = fakultas;
        return this;
    }
    public MahasiswaBuilder setKodeJurusan(String kodeJurusan) {
        this.kodeJurusan = kodeJurusan;
        return this;
    }
    public MahasiswaBuilder setNama(String nama) {
        this.nama = nama;
        return this;
    }
    public MahasiswaBuilder setNim(String nim) {
        this.nim = nim;
        return this;
    }
    public MahasiswaBuilder setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
        return this;
    }

    public Mahasiswa build(){
        return new Mahasiswa(nim, nama, kodeJurusan, fakultas, jenisKelamin);
    }
}
