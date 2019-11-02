/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pbo1.pkg10118009.latihan43.gajipegawai;

import java.util.Scanner;

/**
 * Nama : Tassyakur Pasya
 * Kelas : IF-01 
 * NIM : 10118009
 * Deskripsi Program : Gaji Pegawai
 * @author LENOVO
 */
public class IF01PBO110118009Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GajiPegawai gaji = new GajiPegawai();
        Scanner input =new Scanner(System.in);
        
        System.out.print("Nama Karyawan : ");
        gaji.setNama(input.nextLine());
        System.out.print("Alamat : ");
        gaji.setAlamat(input.nextLine());
        
        gaji.setUangTransport(250000);
        gaji.setUangTunjangan(300000);
        gaji.setGajiPokok(4500000);
        
        gaji.tampilData(gaji.getNama(), gaji.getAlamat(), gaji.getUangTunjangan(), gaji.getUangTransport(), gaji.getGajiPokok(), gaji.getTotalGaji());
        
    }
    
}
