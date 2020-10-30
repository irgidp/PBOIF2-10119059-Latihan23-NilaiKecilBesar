/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan nilai besar dan kecil
 */
package pboif2.pkg10119059.latihan23.nilaikecilbesar;
import java.util.Scanner;
public class PBOIF210119059Latihan23NilaiKecilBesar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai = new int[10];
        int n,max,min;
        String nama;
        
        System.out.println("===== Program Nilai Terbesar dan Terkecil Nilai Mahasiswa =====");
        System.out.print("Masukkan Nama Petugas : ");
        nama = input.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        n = input.nextInt();
        
        for(int i=1; i <=n; i++){
            System.out.print("Nilai Mahasiswa Ke-"+i+" = ");
            nilai[i] = input.nextInt();
        }
        System.out.println("");
        System.out.println("===== Hasil Nilai Mahasiswa =====");
        for(int i=1; i<=n; i++){
            System.out.println("Nilai Mahasiswa Ke="+i+" = "+nilai[i]);
        }
        max=nilai[1];
        min=nilai[1];
        for (int i=1;i<=n; i++){
            if(nilai[i]>max){
                max=nilai[i];
            }
            if(nilai[i]<min){
                min=nilai[i];
            }

        }
        System.out.println("");
        System.out.println("Nilai Terbesar adalah "+max);
        System.out.println("Nilai Terkecil adalah "+min);
        System.out.println("");
        System.out.println("Petugas : "+nama);
            
    }
    
}
