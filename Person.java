abstract class Person {

    private String nama;
    private String tempatLahir;
    private String tanggalLahir;

    //constructor
    public Person() {
        nama = "";
        tempatLahir = "";
        tanggalLahir = "";
    }

    public Person(String newNama, String newTempatLahir, String newTanggalLahir) {
        nama = newNama;
        tempatLahir = newTempatLahir;
        tanggalLahir = newTanggalLahir;
    }

    //setter getter
    public String getNama() {
        return nama;
    }

    public void setNama(String newNama) {
        nama = newNama;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String newTempatLahir) {
        tempatLahir = newTempatLahir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTahunLahir(String newTanggalLahir) {
        tanggalLahir = newTanggalLahir;
    }

    public abstract void toStrings();

}
