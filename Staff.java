public class Staff extends Pegawai {

    private String unitKerja;
    private String jabatan;
    
    public Staff(){
        super();
        unitKerja = "";
        jabatan = "";
    }

    public Staff(String unitKerja, String jabatan, int NIP, String tahunMasuk, Pendidikan pendidikanTerakhir, String nama, String tempatLahir, String tahunLahir) {
        super(NIP, tahunMasuk, pendidikanTerakhir, nama, tempatLahir, tahunLahir);
        this.unitKerja = unitKerja;
        this.jabatan = jabatan;
    }

    public String getUnitKerja() {
        return unitKerja;
    }

    public void setUnitKerja(String unitKerja) {
        this.unitKerja = unitKerja;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
// isi method toString untuk menampilkan data Staff
    @Override
    public void toStrings() {
        System.out.println("");
    }
}
