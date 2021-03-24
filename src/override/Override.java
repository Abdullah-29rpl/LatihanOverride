/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package override;

import java.util.Scanner;

/**
 *
 * @author apple
 */
public class Override {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        //objek override
        Persegi TP = new Persegi();
        Persegi TPP = new PersegiPanjang();
        Persegi TS = new Segitiga();
        
        System.out.println("Hitung Bangun Datar");
        System.out.println("1.Persegi");
        System.out.println("2.Persegi Panjang");
        System.out.println("3.Segitiga");
        System.out.print("Pilih : ");
        int pilihan = input.nextInt();//input user
        
        switch (pilihan){//percabangan pemilihan bangun datar (class)
            case 1 : 
                System.out.println("Hitung Persegi");
                System.out.println("1.Luas");
                System.out.println("2.Keliling");
                System.out.print("Pilih : ");
                int pilihan1 = input.nextInt();//input user
                switch (pilihan1){//percabangan pemilihan void
                    case 1 :
                        TP.Luas();
                        break;
                    case 2 :
                        TP.Keliling();
                        break;
                }
                break;
            case 2 : 
                System.out.println("Hitung Persegi Panjang");
                System.out.println("1.Luas");
                System.out.println("2.Keliling");
                System.out.print("Pilih : ");
                int pilihan2 = input.nextInt();//input user
                switch (pilihan2){//percabangan pemilihan void
                    case 1 :
                        TPP.Luas();
                        break;
                    case 2 :
                        TPP.Keliling();
                        break;
                }
                break;
            case 3 : 
                System.out.println("Hitung Segitiga");
                System.out.println("1.Luas");
                System.out.println("2.Keliling");
                System.out.print("Pilih : ");
                int pilihan3 = input.nextInt();//input user
                switch (pilihan3){//percabangan pemilihan void
                    case 1 :
                        TS.Luas();
                        break;
                    case 2 :
                        TS.Keliling();
                        break;
                }
                break;
            default:
                System.out.println("Pilihan Tidak Tersedia");
                break;
            
        }
    }
    
}
