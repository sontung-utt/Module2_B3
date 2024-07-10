import java.util.Scanner;

public class PracticeArray3 {
    public static void main(String[] args) {
        System.out.println("Tìm giá trị lớn nhất trong mảng");
        Scanner inputNumber = new Scanner(System.in);
        int size;
        int[] numbers;
        do{
            System.out.println("Nhập độ dài mảng");
            size = inputNumber.nextInt();
            if(size <= 0){
                System.out.println("Độ dài của mảng phải lớn hơn 0");
            } else if (size > 20){
                System.out.println("Độ dài của mảng không được lớn hơn 20");
            }
        } while(size <= 0 || size > 20);
        numbers = new int[size];
        for(int i = 0; i < numbers.length; i++){
            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng: ");
            numbers[i] = inputNumber.nextInt();
        }
        System.out.println();
        System.out.print("Mảng vừa nhập có " + size + " phần tử là: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        int max = numbers[0];
        int index = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
                index = i;
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là " + max + " tại vị trí thứ " + (index + 1));
    }
}
