public class Dosen extends Pegawai {

    private int NIDN;

    public Dosen() {
        super();
        NIDN = 0;
    }

    public Dosen(int NIDN, int newNIP, String newTahunMasuk, Pendidikan newPendidikanTerakhir, String newNama, String newTempatLahir, String newTahunLahir) {
        super(newNIP, newTahunMasuk, newPendidikanTerakhir, newNama, newTempatLahir, newTahunLahir);
        this.NIDN = NIDN;
    }


    public int getNIDN() {
        return NIDN;
    }

    public void setNIDN(int NIDN) {
        this.NIDN = NIDN;
    }

    //isi method toString untuk menampilkan dosen
    @Override
    public void toStrings() {
        System.out.println("");
    }
}
