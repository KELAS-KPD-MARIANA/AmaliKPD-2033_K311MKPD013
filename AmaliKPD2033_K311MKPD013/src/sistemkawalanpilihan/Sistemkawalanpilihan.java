/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemkawalanpilihan;
import java.util.Scanner;
public class Sistemkawalanpilihan {
    
    public static void main(String[] args) {
        String namapekerja;
        int bilharibekerja;
        
        Scanner input= new Scanner(System.in);
       System.out.println("Masukan nama :");
        namapekerja= input.nextLine();
       
     do{
            System.out.println("Masukkan bilangan hari bekerja: ");
            bilharibekerja=input.nextInt();
            
            if (bilharibekerja > 31){
                System.out.println("Bilangan hari tidak boleh melebihi 31 hari");
            }
        }while (bilharibekerja > 31);
                int gaji= bilharibekerja*160;
                       
               System.out.println("Rumusan gaji bulanan bagi "+namapekerja);
               System.out.println("Jumlah hari bekerja " +bilharibekerja);
               System.out.println("GAJI SEBULAN ADALAH " +gaji);
    }
       
    }
