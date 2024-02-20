import java.util.Scanner;
import java.util.ArrayList;

public class BocBai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer key = 1;
        while (key != 0) {
            System.out.println("Nhap phim bat ky (Nhap 0 de ket thuc): ");
            key = sc.nextInt();

            System.out.println("Nhap so bai muon boc: ");
            int soNhap = sc.nextInt();

            System.out.println("Bai sau khi sap xep: " + BoBai.XepBai(soNhap));
        }
        sc.close();
    }
}