
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan judul buku: ");
        String judul = scanner.nextLine();

        System.out.print("Masukkan penulis buku: ");
        String penulis = scanner.nextLine();

        System.out.print("Masukkan tahun terbit: ");
        int tahunTerbit = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Masukkan nama penerbit: ");
        String namaPenerbit = scanner.nextLine();

        System.out.print("Masukkan kategori buku: ");
        String kategoriBuku = scanner.nextLine();

        Book buku1 = new Book(judul, penulis, tahunTerbit, namaPenerbit, kategoriBuku);

        buku1.printDetails();

        scanner.close();
    }
}
