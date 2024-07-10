import java.util.Scanner;

public class PracticeArray4 {
    public static void main(String[] args) {
        System.out.println("Chuyển đổi nhiệt độ");
        Scanner inputNumber = new Scanner(System.in);
        int num;
        do {
            System.out.println("Nhập tùy chọn");
            System.out.println("1. Đổi nhiệt độ từ Celcius sang Fahrenheit");
            System.out.println("2. Đổi nhiệt độ từ Fahrenheit sang Celcius");
            System.out.println("0. Thoát chương trình");
            num = inputNumber.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Đổi nhiệt độ từ Celcius sang Fahrenheit");
                    System.out.println("Nhập nhiệt độ (Celcius)");
                    double temp = inputNumber.nextDouble();
                    System.out.println("Celcius sang Fahrenheit: " + celciusToFahrenheit(temp) + " (F)");
                    break;
                case 2:
                    System.out.println("Đổi nhiệt độ từ Fahrenheit sang Celcius");
                    System.out.println("Nhập nhiệt độ (Fahrenheit)");
                    temp = inputNumber.nextDouble();
                    System.out.println("Fahrenheit sang Celcius: " + fahrenheitToCelcius(temp) + " (C)");
                    break;
//                case 0:
//                    System.exit(0);
//                    break;
                default:
                    System.out.println("Không có lựa chọn phù hợp. Xin mời nhập lại");
                    break;
            }
        } while (num != 0);

    }

    public static double celciusToFahrenheit(double celcius) {
        double fahrenheit = celcius * (9.0 / 5) + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelcius(double fahrenheit) {
        double celcius = (fahrenheit - 32) * (5.0 / 9);
        return celcius;
    }
}
