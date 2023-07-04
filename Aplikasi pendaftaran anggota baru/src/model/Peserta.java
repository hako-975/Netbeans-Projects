package model;

public class Peserta {
    private String nim;
    private String nama;
    private String alamat;
    private String telp;
    private String alasan;
    
    public Peserta(String nim, String nama, String alamat, String telp, String alasan) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.telp = telp;
        this.alasan = alasan;
    }
    
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getAlasan() {
        return alasan;
    }

    public void setAlasan(String alasan) {
        this.alasan = alasan;
    }
}
