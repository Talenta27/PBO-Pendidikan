public class Petugas extends Staff {

    private String username;
    private String password;
    private String sessionUser;

    public Petugas(String username, String password, String sessionUser, String unitKerja, String jabatan, int NIP, String tahunMasuk, Pendidikan pendidikanTerakhir, String nama, String tempatLahir, String tahunLahir) {
        super(unitKerja, jabatan, NIP, tahunMasuk, pendidikanTerakhir, nama, tempatLahir, tahunLahir);
        this.username = username;
        this.password = password;
        this.sessionUser = sessionUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSessionUser() {
        return sessionUser;
    }

    public void setSessionUser(String sessionUser) {
        this.sessionUser = sessionUser;
    }

    //isi method to string untuk menampilkan petugas
    @Override
    public void toStrings() {
        System.out.println("");
    }
}
