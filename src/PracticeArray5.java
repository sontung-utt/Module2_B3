import java.util.Scanner;

public class PracticeArray5 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Tìm giá trị nhỏ nhất trong mảng");
        int size;
        int[] numbers;
        do{
            System.out.println("Nhập độ dài của mảng");
            size = inputNumber.nextInt();
            if(size <= 0){
                System.out.println("Độ dài của mảng phải lớn hơn 0");
            } else if(size > 10){
                System.out.println("Độ dài của mảng không được lớn hơn 10");
            }
        } while (size <= 0 || size > 10);
        numbers = new int[size];
        for(int i = 0; i < numbers.length; i++){
            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng: ");
            numbers[i] = inputNumber.nextInt();
        }
        System.out.println();
        System.out.print("Mảng vừa nhập là: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        int index = minValue(numbers);
        int min = minValue(numbers);
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);//numbers[index]
    }
    public static int minValue(int[] array){
        int index = 0;
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < array[index]){
                index = i;
                min = array[i];
            }
        }
        return min;
    }
}
