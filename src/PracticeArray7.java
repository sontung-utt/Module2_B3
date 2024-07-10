import java.util.Arrays;
import java.util.Scanner;

public class PracticeArray7 {
    public static void main(String[] args) {
        System.out.println("Gộp mảng");
        Scanner inputNumber = new Scanner(System.in);
        int size1, size2;
        int[] array1, array2;
        do{
            System.out.print("Nhập độ dài mảng thứ nhất: ");
            size1 = inputNumber.nextInt();
            if(size1 < 0 || size1 > 10){
                System.out.println("Độ dài mảng thứ nhất không phù hợp!");
            }
        } while(size1 < 0 || size1 > 10);
        do{
            System.out.print("Nhập độ dài mảng thứ nhất: ");
            size2 = inputNumber.nextInt();
            if(size2 < 0 || size2 > 10){
                System.out.println("Độ dài mảng thứ nhất không phù hợp!");
            }
        } while(size2 < 0 || size2 > 10);
        array1 = new int[size1];
        System.out.println("Nhập các phần tử mảng thứ nhất");
        for (int i = 0; i < size1; i++){
            System.out.print("Giá trị thứ " + (i + 1) + " mảng thứ nhất: ");
            array1[i] = inputNumber.nextInt();
        }
        array2 = new int[size2];
        System.out.println("Nhập các phần tử mảng thứ hai");
        for (int i = 0; i < size2; i++){
            System.out.print("Giá trị thứ " + (i + 1) + " mảng thứ hai: ");
            array2[i] = inputNumber.nextInt();
        }
        System.out.println("Mảng thứ nhất vừa nhập: ");
        for (int i = 0; i < size1; i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.println("Mảng thứ hai vừa nhập: ");
        for (int i = 0; i < size2; i++){
            System.out.print(array2[i] + " ");
        }
        int size3 = size1 + size2;
        int[] array3 = new int[size3];
        for (int i = 0; i < size1; i++){
            array3[i] = array1[i];
        }
        for (int i = 0; i < size2; i++){
            array3[size1 + i] = array2[i];
        }
        System.out.println();
        System.out.println("Mảng vừa gộp là: " + Arrays.toString(array3));
    }
}
