package design_pattern.prototype;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String kodeJurusan;
    private String fakultas;

    public Mahasiswa (String nim, String nama, String kodeJurusan,String fakultas){
        this.nim=nim;
        this.nama=nama;
        this.kodeJurusan=kodeJurusan;
        this.fakultas=fakultas;
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

    public Mahasiswa clone(){
        return new Mahasiswa(nim, nama, kodeJurusan, fakultas);
    }

}
