import java.util.Scanner;

public class PracticeArray2 {
    public static void main(String[] args) {
        System.out.println("Tìm giá trị trong mảng");
        Scanner inputNumber = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Nhập độ dài  của mảng: ");
            size = inputNumber.nextInt();
            if (size <= 0) {
                System.out.println("Phần tử trong mảng phải lớn hơn 0");
            } else if (size > 20) {
                System.out.println("Phần tử trong mảng không được lớn hơn 20");
            }
        } while (size <= 0 || size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng: ");
            array[i] = inputNumber.nextInt();
        }
        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Nhập số muốn tìm trong mảng: ");
        int num = inputNumber.nextInt();
        boolean isExist = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                System.out.println("Số " + num + " tồn tại trong mảng nằm ở vị trí thứ " + (i + 1) + " trong mảng!");
                isExist = true;
                break;
            } else {
                System.out.print("Không tìm thấy số " + num + " trong mảng. Mời nhập lại: ");
                num = inputNumber.nextInt();
            }

        }

    }
}
