public class Pegawai extends Person {

    private int NIP;
    private String tahunMasuk;
    private Pendidikan pendidikanTerakhir;

    public Pegawai() {
        super();
        NIP = 0;
        tahunMasuk = "";
    }

    public Pegawai(int NIP, String tahunMasuk, Pendidikan pendidikanTerakhir, String newNama, String newTempatLahir, String newTanggalLahir) {
        super(newNama, newTempatLahir, newTanggalLahir);
        this.NIP = NIP;
        this.tahunMasuk = tahunMasuk;
        this.pendidikanTerakhir = pendidikanTerakhir;
    }

    public int getNIP() {
        return NIP;
    }

    public void setNIP(int newNIP) {
        NIP = newNIP;
    }

    public String getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(String newTahunMasuk) {
        tahunMasuk = newTahunMasuk;
    }

    public Pendidikan getPendidikanTerakhir() {
        return pendidikanTerakhir;
    }

    public void setPendidikanTerakhir(Pendidikan pendidikanTerakhir) {
        this.pendidikanTerakhir = pendidikanTerakhir;
    }

    //isi method to string untuk menampilkan data pegawai
    @Override
    public void toStrings() {
        System.out.println("");
    }

}
