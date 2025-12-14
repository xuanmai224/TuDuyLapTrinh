package Mission;

import java.util.Scanner;

public class ChuyenDoiUsdSangVnd {
    public static void main(String[] args) {
        final float TI_GIA = 23500;
        Scanner scan = new Scanner(System.in);

        System.out.print("Vui lòng nhập số tiền USD: ");
        float usd = scan.nextInt();
        float vnd = usd * TI_GIA;

        System.out.println("Số tền VND là: " + vnd + "đ");
    }
}
