/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pbo1.pkg10118009.latihan43.gajipegawai;

/**
 *
 * @author LENOVO
 */
public class GajiPegawai {
    private String nama;
    private String alamat;
    private int uangTransport;
    private int uangTunjangan;
    private int gajiPokok;
    private int totalGaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangTransport() {
        return this.uangTransport;
    }

    public void setUangTransport(int uangTransport) {
        this.uangTransport = uangTransport;
    }

    public int getUangTunjangan() {
        return this.uangTunjangan;
    }

    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }

    public int getGajiPokok() {
        return this.gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getTotalGaji() {
        return this.gajiPokok;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }
    public int TotalGaji(int uangTunjangan, int uangTransport, int gajiPokok) {
        totalGaji = uangTunjangan+uangTransport+gajiPokok;
        return totalGaji;
            }
    
    public void tampilData(String nama, String alamat, int uangTunjangan, int uangTransport, int gajiPokok, int totalGaji){
         System.out.println("### Data Gaji Karyawan PT. KAKATU###");
         System.out.println("---------------------------");
         System.out.println("Nama Karyawan : "+nama);
         System.out.println("Alamat : "+alamat);
         System.out.println("Uang Transport : Rp. "+ uangTransport);
         System.out.println("Uang Tunjangan : Rp. "+ uangTunjangan);
         System.out.println("Gaji Pokok : Rp. "+gajiPokok);
         System.out.println("Total Gaji : Rp. "+totalGaji);
        
    }
   
}
