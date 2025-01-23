package Day4;

import java.util.Scanner;

public class 문제2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열 입력: ");
        String input = scanner.nextLine();

        // 대소문자 구분 없이 비교를 위해 소문자로 변환
        String normalized = input.toLowerCase();

        // 팰린드롬 확인
        boolean isPalindrome = normalized.equals(new StringBuilder(normalized).reverse().toString());

        if (isPalindrome) {
            System.out.println("입력한 문자열은 팰린드롬입니다.");
        } else {
            System.out.println("입력한 문자열은 팰린드롬이 아닙니다.");
        }
        scanner.close();
    }
}
