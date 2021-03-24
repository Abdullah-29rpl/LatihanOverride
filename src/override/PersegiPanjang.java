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
public class PersegiPanjang extends Persegi {
    int panjang,lebar;
    public void Luas(){
        System.out.println("Hitung Luas Persegi Panjang");
        System.out.print("Masukkan Panjang : ");
        panjang = this.input.nextInt();//input user
        System.out.print("Masukkan Lebar : ");
        lebar = this.input.nextInt();//input user
        
        this.hasil=panjang*lebar;//aritmatika
        System.out.print("Luas Persegi :"+ this.hasil);// hasil
    }
    
    public void Keliling(){
        System.out.println("Hitung Keliling Persegi Panjang");
        System.out.print("Masukkan Panjang : ");
        panjang = this.input.nextInt();//input user
        System.out.print("Masukkan Lebar : ");
        lebar = this.input.nextInt();//input user
        
        this.hasil=(panjang+lebar)*2;//aritmatika
        System.out.print("Luas Persegi :"+ this.hasil);// hasil
        
    }
}
