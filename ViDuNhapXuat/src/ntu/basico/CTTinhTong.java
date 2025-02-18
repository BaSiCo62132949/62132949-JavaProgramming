package ntu.basico;

import java.util.Scanner;  

public class CTTinhTong {

    public static void main(String[] args) {
        System.out.println("CT TÍNH TỔNG\n");
        
        Scanner banPhim = new Scanner(System.in);
        
        System.out.print("Mời nhập a: ");
        double a = banPhim.nextDouble();
        
        System.out.print("Mời nhập b: ");
        double b = banPhim.nextDouble();

        double tong = a + b;
        
        System.out.println("Tổng là: " + tong);
        
        banPhim.close();
    }
}
