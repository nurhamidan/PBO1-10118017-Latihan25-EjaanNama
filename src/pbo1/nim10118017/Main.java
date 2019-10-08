package pbo1.nim10118017;

import java.util.Scanner;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Mengeja nama depan yang dimasukkan user.
 * 
 */
public class Main {
    //Konstanta
    public static final String FOOTER = "\n(Developed by : Agung Nurhamidan)";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String namaDepan;
        Scanner scanner = new Scanner(System.in);
        
        //Memasukkan nama.
        System.out.print("Masukkan nama depan anda untuk dieja : ");
        namaDepan = scanner.next();
        
        //Menampilkan nama
        System.out.println("\nEjaan untuk \"" + namaDepan + "\" adalah :");
        for (int i = 0; i < namaDepan.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + " : " + namaDepan.charAt(i));
        }
        
        System.out.println(FOOTER);
    }
    
}
