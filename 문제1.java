package Day4;


import java.util.Scanner;

public class 문제1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            // 변환 방향 선택
            System.out.print("변환할 방향 선택 (1: 섭씨→화씨, 2: 화씨→섭씨): ");
            choice = scanner.nextInt();

            if (choice == 1 || choice == 2) {
                break; // 올바른 입력이면 반복 종료
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }

        // 온도 입력
        System.out.print("온도를 입력하세요: ");
        double temperature = scanner.nextDouble();

        // 변환 및 결과 출력
        if (choice == 1) {
            // 섭씨 -> 화씨 변환
            double fahrenheit = temperature * 9 / 5 + 32;
            System.out.printf("변환 결과: %.2f°F\n", fahrenheit);
        } else {
            // 화씨 -> 섭씨 변환
            double celsius = (temperature - 32) * 5 / 9;
            System.out.printf("변환 결과: %.2f°C\n", celsius);
        }

        scanner.close();
    }
}
