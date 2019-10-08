/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author NOC2
 */
public class NilaiTerbesarDanTerkecil {
    public static Scanner input = new Scanner(System.in);
    public static void mencarinilai(int i, String nama){
        int n, h = 0,l ;
        int[] nilaiArr = new int[1000];
        for (int j=1 ; j<=i ; j++){
            System.out.print("Masukan nilai mahasiswa ke-" + j + " = ");
            n = input.nextInt();
            nilaiArr[j] = n;
        }
        System.out.println("");
        System.out.println("====== Hasil nilai mahasiswa ======");
        for (int x=1 ; x<=i ; x++){
            System.out.println("Nilai mahasiswa ke-" + x + " = " + nilaiArr[x]);
        }
        for (int z=1 ; z<=i ; z++){
            if (nilaiArr[z] > h)
                h = nilaiArr[z];
        }
        l = nilaiArr[1];
        for (int m=1 ; m<=i ; m++){
            if (nilaiArr[m] < l)
                l = nilaiArr[m];
        }
        System.out.println("");
        System.out.println("Nilai terbesar adalah " + h);
        System.out.println("Nilai terkecil adalah " + l);
        System.out.println("");
        System.out.println("Nama Petugas : " + nama);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        String nama;
        
        System.out.println("===== Program Nilai Terbesar dan Terkecil Nilai Mahasiswa =====");
        System.out.print("Masukan Nama Petugas : ");
        nama = input.nextLine();
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        n = input.nextInt();
        mencarinilai(n,nama);
        
    }
    
}
