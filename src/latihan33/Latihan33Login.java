/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan33;

import java.util.Scanner;

/**
 *
 * @author lutfi
 * NAMA  : LUTFI RAMADHAN
 * NIM   : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Latihan33Login {

    /**
     * @param args the command line arguments
     */
    
    private static String usName, passWord;
    
    public static void main(String[] args) {
        // TODO code application logic here
        User u = new User();
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Username = ");
        usName = sc.next();
        System.out.print("Masukkan Password = ");
        passWord = sc.next();
        System.out.println();
        u.PengecekkanLogin(usName, passWord);
    }
    
}
