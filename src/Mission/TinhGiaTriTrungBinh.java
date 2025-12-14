package Mission;

import java.util.Scanner;

public class TinhGiaTriTrungBinh {
    public static void main(String[] args) {
        final int SO_LUONG = 5;
        Scanner scan = new Scanner(System.in);

        System.out.println("Vui lòng nhập 5 số nguyên");

        int sum = 0;
        for (int i = 0; i < SO_LUONG; i++){
            int n = scan.nextInt();
            sum += n;
        }

        float average = (float) sum / SO_LUONG;

        System.out.println("Gía trị trung bình là:" + average);
    }
}
