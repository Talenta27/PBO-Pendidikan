public class Mahasiswa extends Person {

    private int NIM;
    private int angkatan;

    //constructor
    public Mahasiswa() {
        super();
        NIM = 0;
        angkatan = 0;
    }

    public Mahasiswa(String newNama, String newTempatLahir, String newTahunLahir, int newNIM, int newAngkatan) {
        super(newNama, newTempatLahir, newTahunLahir);
        NIM = newNIM;
        angkatan = newAngkatan;
    }

    //setter getter
    public int getNIM() {
        return NIM;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    @Override
    public void toStrings() {
        System.out.println("\nNama : " + getNama()
                + "\nTempat Lahir : " + getTempatLahir()
                + "\n Tanggal Lahir : " + getTanggalLahir()
                + "\n NIM : " + getNIM()
                + "\nAngakatan: " + getAngkatan());
    }

}
