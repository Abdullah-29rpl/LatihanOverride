/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package override;

/**
 *
 * @author apple
 */
public class Segitiga extends Persegi {
    double alas,tinggi;
    public void Luas(){
        System.out.println("Hitung Luas Segitiga");
        System.out.print("Masukkan Alas : ");
         alas = this.input.nextInt();//input user
        System.out.print("Masukkan Tinggi : ");
         tinggi = this.input.nextInt();//input user
        
        this.hasil=0.5*alas*tinggi;//aritmatika
        System.out.print("Luas Persegi :"+ this.hasil);// hasil
    }
    
    public void Keliling(){
        System.out.println("Hitung Keliling Segitiga");
        System.out.println("Masukkan Sisi 1 : ");
        int sisi1 = this.input.nextInt();//input user
        System.out.println("Masukkan Sisi 2 : ");
        int sisi2 = this.input.nextInt();//input user
        System.out.println("Masukkan Sisi 3 : ");
        int sisi3 = this.input.nextInt();//input user
        
        this.hasil=sisi1+sisi2+sisi3;//aritmatika
        System.out.print("Luas Persegi :"+ this.hasil);// hasil
    }
}
