import java.util.Scanner;

public class Nomor1{
    public static void main(String[] args){
        
        double penjualanSalesman = 0;
        double komisi;
        double komisiYangDidapatkan;
        double totalPenjualanSalesman;


        Scanner input = new Scanner(System.in);
            System.out.println("Masukkan penjualan salesman :");
            penjualanSalesman = input.nextInt();

            if (penjualanSalesman == 500000){
            } komisi = penjualanSalesman * 0.1;
                if (penjualanSalesman > 500000){
                } komisi = penjualanSalesman * 0.5;
            

            totalPenjualanSalesman = 8 * penjualanSalesman;
            komisiYangDidapatkan = 0.16 * komisi;
            

            System.out.println("Total Penjualan Salesman :" + totalPenjualanSalesman);
            System.out.println("Komisi Yang Didapatkan :" + komisiYangDidapatkan);
      
    }
}
