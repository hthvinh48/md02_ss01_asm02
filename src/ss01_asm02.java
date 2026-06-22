import java.util.Scanner;

public class ss01_asm02 {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất (firstNumber): ");
        firstNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số thứ hai (secondNumber): ");
        secondNumber = Integer.parseInt(sc.nextLine());
        sc.close();

        int sum = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
        int remainder = firstNumber % secondNumber;

        System.out.println();
        System.out.println("--- Kết quả ---");
        System.out.println("firstNumber: " + firstNumber);
        System.out.println("secondNumber: " + secondNumber);
        System.out.println("Tổng: " + sum);
        System.out.println("Hiệu: " + subtraction);
        System.out.println("Tích: " + multiplication);
        System.out.println("Thương: " + division);
        System.out.println("Phần dư: " + remainder);
    }
}
