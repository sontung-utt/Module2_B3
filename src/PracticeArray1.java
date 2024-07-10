import java.util.Scanner;

public class PracticeArray1 {
    public static void main(String[] args) {
        System.out.println("Đảo ngược mảng - Reverse Array");
        int sizeArray;
        int[] array;
        Scanner inputNumber = new Scanner(System.in);
        do{
            System.out.println("Nhập kích thước của mảng");
            sizeArray = inputNumber.nextInt();
            if(sizeArray < 0){
                System.out.println("Đô dài của mảng phải lớn hơn 0");
            } else if (sizeArray > 20){
                System.out.println("Đô dài của mảng không được lớn hơn 20");
            }
        } while (sizeArray <= 0 || sizeArray > 20);
        array = new int[sizeArray];
        int num = 0;
        while (num < array.length){
            System.out.print("Nhập phân tử thứ " + (num + 1) + " của mảng: ");
            array[num] = inputNumber.nextInt();
            num++;
        }
        System.out.println("Các phần tử trong mảng");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println();
        System.out.println("Mảng đảo ngược");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

    }
}
