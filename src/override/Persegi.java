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
public class Persegi {
    double hasil;
    Scanner input = new Scanner (System.in);
    public void Luas(){
        System.out.println("Hitung Luas Persegi");
        System.out.print("Masukkan Sisi : ");
        int sisi = this.input.nextInt();//input user
        
        this.hasil=sisi*sisi;//aritmatika
        System.out.print("Luas Persegi :"+ this.hasil);// hasil
    }
    
    public void Keliling(){
        System.out.println("Hitung Luas Persegi");
        System.out.print("Masukkan Sisi : ");
        int sisi = this.input.nextInt();//input user
        
        this.hasil=4*sisi;//aritmatika
        System.out.print("Luas Persegi :"+ this.hasil);// hasil
    }
}
