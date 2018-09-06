/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumModul5;

/**
 *
 * @author SMK TELKOM
 */
public class Praktek1 {
    public static void main(String[] args) {
        
        int a  =20; 
        int b=4;
        try{
            int x  = a*b;
            System.out.println("Hasilnya: " + x); 
            int[] angka = {1, 2, 3, 4, 5,}; 
            angka[6] = 72; 
        }catch (Exception e) {
            System.out.println("Salah");
            System.out.println(e); 
        }finally    {
            System.out.println("Sudah terselesaikan");
            
        }
        System.out.println("Selesai");

        }
}
