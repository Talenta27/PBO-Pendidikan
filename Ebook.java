public class Ebook {

    String ISBN;
    private String judul;
    private String pengarang;

    public Ebook() {
        this.ISBN = "";
        this.judul = "";
        this.pengarang = "";
    }

    public Ebook(String ISBN, String judul, String pengarang) {
        this.ISBN = ISBN;
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
    
    //isi method to string untuk menampilkan list ebooknya
    public void toStrings() {
        System.out.println("");
    }
}
