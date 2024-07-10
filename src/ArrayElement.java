import java.util.Arrays;
import java.util.Scanner;

public class ArrayElement {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        int size;
        int[] array;
        do{
            System.out.print("Nhập độ dài của mảng: ");
            size = inputNumber.nextInt();
            if(size <= 0){
                System.out.println("Độ dài của mảng phải lớn hơn 0");
            } else if (size > 10){
                System.out.println("Độ dài của mảng không được lớn hơn 10");
            }
        } while (size <= 0 || size > 10);
        array = new int[size];
        for(int i = 0; i < array.length; i++){
            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng: ");
            array[i] = inputNumber.nextInt();
        }
        System.out.println("Mảng vừa nhập là: " + Arrays.toString(array));
        int choose;
        do {
            System.out.println("Nhập lựa chọn");
            System.out.println("1. Thêm phần tử vào mảng");
            System.out.println("2. Xóa phần tử khỏi mảng");
            System.out.println("3. Chèn phần tử vào mảng");
            System.out.println("4. Sửa phần tử trong mảng");
            System.out.println("0. Thoát chương trình");
            choose = inputNumber.nextInt();
            switch(choose){
                case 1:
                    System.out.println("Thêm phần tử vào mảng");
                    System.out.print("Nhập phần tử mới của mảng: ");
                    int newElement = inputNumber.nextInt();
                    array = addElement(array, newElement);
                    System.out.println("Mảng sau khi thêm là: " + Arrays.toString(array));
                    break;
                case 2:
                    System.out.println("Xóa phần tử khỏi mảng");
                    System.out.print("Nhập vị trí muốn xóa của mảng (Từ 0 đến " + (array.length - 1) + "): ");
                    int indexRemoved = inputNumber.nextInt();
                    do {
                        if(indexRemoved >= array.length || indexRemoved < 0){
                            System.out.println("Vị trí muốn xóa không tồn tại. Mời nhập lại!");
                            indexRemoved = inputNumber.nextInt();
                        }
                    }while(indexRemoved >= array.length || indexRemoved < 0);
                    array = removeElement(array, indexRemoved);
                    System.out.println("Mảng sau khi xóa là: " + Arrays.toString(array))    ;
                    break;
                case 3:
                    System.out.println("Chèn phần tử vào mảng");
                    System.out.print("Nhập phần tử muốn chèn vào mảng: ");
                    newElement = inputNumber.nextInt();
                    System.out.print("Nhập vị trí muốn chèn (Từ 0 đến " + (array.length - 1) + "): ");
                    int indexInsert = inputNumber.nextInt();
                    do{
                        if(indexInsert >= array.length || indexInsert < 0){
                            System.out.println("Vị trí chèn không phù hợp. Mời nhập lại!");
                            indexInsert = inputNumber.nextInt();
                        }
                    } while(indexInsert >= array.length || indexInsert < 0);
                    array = insertElement(array, indexInsert, newElement);
                    System.out.println("Mảng sau khi chèn là: " + Arrays.toString(array));
                    break;
                case 4:
                    System.out.println("Sửa phần tử trong mảng");
                    System.out.print("Nhập vị trí muốn sửa trong mảng (Từ 0 đến " + (array.length - 1) + "): ");
                    int indexEdit = inputNumber.nextInt();
                    do{
                        if(indexEdit >= array.length || indexEdit < 0){
                            System.out.println("Vị trí sửa không phù hợp. Mời nhập lại!");
                            indexEdit = inputNumber.nextInt();
                        }
                    }while(indexEdit >= array.length || indexEdit < 0);
                    System.out.print("Nhập phần tử muốn sửa: ");
                    int editElement = inputNumber.nextInt();
                    array = editElement(array, indexEdit, editElement);
                    System.out.println("Mảng sau khi sửa là: " + Arrays.toString(array));
                    break;
                case 0:
                    //System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn phù hợp. Mời nhập lại!");
                    break;
            }
        } while(choose!=0);
    }
    public static int[] addElement(int[] array, int newElement){
        int[] newArray = new int[array.length + 1];
        for(int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        newArray[array.length] = newElement;
        return newArray;
    }

    public static int[] removeElement(int[] array, int index){
        int[] newArray = new int[array.length - 1];
        for(int i = 0, j = 0; i < array.length; i++){
            if(i != index){
                newArray[j++] = array[i];
            }
        }
        return newArray;
    }

    public static int[] insertElement(int[] array, int index, int newElement){
        int[] newArray = new int[array.length + 1];
        for(int i = 0, j = 0; i < newArray.length; i++){
            if(i == index){
                newArray[i] = newElement;
            } else {
                newArray[i] = array[j++];
            }
        }
        return newArray;
    }

    public static int[] editElement(int[] array, int index, int newElement){
        int[] newArray = new int[array.length];
        for(int i = 0; i < array.length; i++){
            if(i == index){
                newArray[i] = newElement;
            } else {
                newArray[i] = array[i];
            }
        }
        return newArray;
    }
}
