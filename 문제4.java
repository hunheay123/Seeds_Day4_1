package Day4;

import java.util.Scanner;

public class 문제4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = 0, height = 0;
        char fillChar = ' ';

        // 가로, 세로 입력
        while (true) {
            System.out.print("가로 길이 입력 (1 이상): ");
            width = scanner.nextInt();
            System.out.print("세로 길이 입력 (1 이상): ");
            height = scanner.nextInt();
            if (width >= 1 && height >= 1) break;
            System.out.println("유효하지 않은 입력입니다. 가로와 세로는 1 이상이어야 합니다.");
        }

        // 문자 입력
        System.out.print("출력할 문자 입력: ");
        fillChar = scanner.next().charAt(0);

        // 사각형 출력
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(fillChar);
            }
            System.out.println();
        }
        scanner.close();
    }
}
