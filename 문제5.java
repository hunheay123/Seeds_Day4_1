package Day4;

import java.util.Scanner;

public class 문제5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuCount = 0;
        double total = 0.0;

        // 메뉴 개수 입력
        while (true) {
            System.out.print("주문한 메뉴 개수 입력 (1 이상): ");
            menuCount = scanner.nextInt();
            if (menuCount >= 1) break;
            System.out.println("유효하지 않은 입력입니다. 메뉴 개수는 1 이상이어야 합니다.");
        }

        // 각 메뉴 가격 입력
        System.out.println("메뉴 가격 입력 (각 메뉴당):");
        for (int i = 0; i < menuCount; i++) {
            System.out.print("메뉴 " + (i + 1) + " 가격: ");
            double price = scanner.nextDouble();
            if (price < 0) {
                System.out.println("잘못된 입력입니다.");
                scanner.close();
                return;
            }
            total += price;
        }

        // 결과 계산
        double tax = total * 0.1;
        double finalTotal = total + tax;

        // 결과 출력
        System.out.printf("총 합계: %.2f원%n", total);
        System.out.printf("부가세(10%%): %.2f원%n", tax);
        System.out.printf("최종 금액: %.2f원%n", finalTotal);
        scanner.close();
    }
}
