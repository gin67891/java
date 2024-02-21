import java.util.Scanner;
import java.util.ArrayList;

public class BocBai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer key = 1;
        while (key != 0) {
            System.out.println("Nhap so bai muon boc (Nhap 0 de ket thuc): ");
            key = sc.nextInt();
            if (key > 0 && key < 53) {
                System.out.println("Bai sau khi sap xep: " + BoBai.XepBai(key));
            }else
                System.out.println("Nhap sai, moi nhap lai");
        }
        sc.close();
    }
}