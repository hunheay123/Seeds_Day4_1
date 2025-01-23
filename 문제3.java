package Day4;

import java.util.Scanner;

public class 문제3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int age = 0;
        String email = "";
        String password = "";

        // 이름 입력
        while (true) {
            System.out.print("이름 입력: ");
            name = scanner.nextLine();
            if (!name.isBlank() && !name.contains(" ")) break;
            System.out.println("유효하지 않은 입력입니다. 이름은 공백이 없어야 합니다.");
        }

        // 나이 입력
        while (true) {
            System.out.print("나이 입력: ");
            try {
                age = Integer.parseInt(scanner.nextLine());
                if (age >= 0 && age <= 150) break;
            } catch (NumberFormatException e) {
                // 예외 처리
            }
            System.out.println("유효하지 않은 입력입니다. 나이는 0 이상 150 이하의 정수여야 합니다.");
        }

        // 이메일 입력
        while (true) {
            System.out.print("이메일 입력: ");
            email = scanner.nextLine();
            if (email.contains("@")) break;
            System.out.println("유효하지 않은 입력입니다. 이메일에는 '@'가 포함되어야 합니다.");
        }

        // 비밀번호 입력
        while (true) {
            System.out.print("비밀번호 입력: ");
            password = scanner.nextLine();
            if (password.length() >= 8) break;
            System.out.println("유효하지 않은 입력입니다. 비밀번호는 8자 이상이어야 합니다.");
        }

        // 결과 출력
        System.out.println("\n[회원 정보]");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("이메일: " + email);
        System.out.println("비밀번호: ********");
        scanner.close();
    }
}
