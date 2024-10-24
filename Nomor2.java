import java.util.Scanner;

public class Nomor2{
    public static void main(String[] args){
        Scanner io = new Scanner(System.in);
        double kodeBungalow : malam : biayaPelayanan = 1 : 50000 : 0.3, 2 : 40000 : 0.2, 3 : 30000 : 0.1;
        int biayaMenginap, lamaMenginap, malam;
        double totalPendapatan,
        while (true) { 
            System.out.println("Masukkan kode bungalow (1,2,3) :");
            kodeBungalow = io.nextInt();
            System.out.println("Lama menginap :");
            malam = io.nextInt();
            switch (kodeBungalow) {
                case 1:
                    malam = 50000;
                    break;
                case 2:
                    malam = 40000;
                    break;
                case 3:
                    malam = 30000;
                    break;
                default:
                    System.out.println("Kode Bungalow tidak valid.");
                    break;
            }
                
            }
            System.out.print("Input lagi [Y/N]? ");
                pilihan = io.nextLine();
                if (pilihan.equalsIgnoreCase("N")) {
                    break;
        }
        double biayaMenginap = lamaMenginap * malam
        double biayaPelayanan = malam * pelayanan
        double totalPendapatan = biayaMenginap + biayaPelayanan

        System.out.println("totalPendapatan :" + Total Pendapatan);
        io.close();
}
}
