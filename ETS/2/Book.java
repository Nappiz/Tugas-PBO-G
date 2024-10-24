/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private String namaPenerbit;
    private String kategoriBuku;

    /**
     * Constructor for objects
     * Menginisialisasi atribut dengan nilai yang diberikan
     */
    public Book(String judul, String penulis, int tahunTerbit, String namaPenerbit, String kategoriBuku)
    {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.namaPenerbit = namaPenerbit;
        this.kategoriBuku = kategoriBuku;
    }


    public void printDetails()
    {
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("Tahun Terbit: " + this.tahunTerbit);
        System.out.println("Nama Penerbit: " + this.namaPenerbit);
        System.out.println("Kategori Buku: " + this.kategoriBuku);
    }
    
    public int addNumbers(int x, int y)
    {
        return x + y;
    }
}
