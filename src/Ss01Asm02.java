import java.util.Scanner;

public class Ss01Asm02 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                try {
                    System.out.print("Nhập số thứ nhất (firstNumber): ");
                    int firstNumber = Integer.parseInt(input.nextLine());
                    System.out.print("Nhập số thứ hai (secondNumber): ");
                    int secondNumber = Integer.parseInt(input.nextLine());

                    if (secondNumber == 0) {
                        System.out.println("Không thể thực hiện phép chia vì giá trị thứ 2 bằng 0!");
                        continue;
                    }

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

                    break;

                } catch (NumberFormatException e) {
                    System.out.println("Lỗi: Giá trị nhập vào phải là số!");
                }
            }
        }
    }
}
