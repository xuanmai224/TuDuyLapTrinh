package Mission;

import java.util.Scanner;

public class XacDinhViTriM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập tâm đường tròn
        System.out.print("Nhập tọa độ tâm C(xC, yC)? ");
        double xC = sc.nextDouble();
        double yC = sc.nextDouble();

        // Nhập bán kính
        System.out.print("Nhập bán kính R? ");
        double R = sc.nextDouble();

        // Nhập tọa độ điểm M
        System.out.print("Nhập tọa độ M (xM, yM)? ");
        double xM = sc.nextDouble();
        double yM = sc.nextDouble();

        // Tính khoảng cách CM
        double distance = Math.sqrt(
                Math.pow(xM - xC, 2) + Math.pow(yM - yC, 2)
        );

        double epsilon = 1e-6;

        // So sánh
        if (distance < R - epsilon) {
            System.out.println("M nằm trong C()");
        } else if (Math.abs(distance - R) <= epsilon) {
            System.out.println("M nằm trên C()");
        } else {
            System.out.println("M nằm ngoài C()");
        }
    }
}
