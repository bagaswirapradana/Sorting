package id.bagaswirapradana.i2p;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        System.out.print("Masukkan jumlah data : ");
        int jmlData = input.nextInt();

        List<Mahasiswa> listMahasiswa = new ArrayList<>();
        for (int i = 0; i < jmlData; i++) {
            System.out.println("Masukkan data ke-" + (i + 1) + " ");
            Scanner input2 = new Scanner(System.in);
            try {
                System.out.print("Masukkan NIM : ");
                String nim = input2.nextLine();

                System.out.print("Masukkan Nama : ");
                String nama = input2.nextLine();

                System.out.print("Masukkan IPK : ");
                double ipk = input2.nextDouble();

                listMahasiswa.add(new Mahasiswa(nim, nama, ipk));
            } catch (Exception e) {
                System.out.println("Inputan salah " + e.getMessage());
                input2.close();
            }
        }
        Comporator comporator = new Comporator();
        listMahasiswa.sort(comporator);
        input.close();
        System.out.println("\nHasil setelah di sorting : ");
        for (Mahasiswa mhs : listMahasiswa) {
            System.out.println(mhs.toString());
        }
    }
}
