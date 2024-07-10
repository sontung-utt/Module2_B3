import java.util.Scanner;

public class PracticeArray6 {
    public static void main(String[] args) {
        System.out.println("Phần tử lớn nhất trong mảng 2 chiều");
        int sizeCols;
        int sizeRows;
        Scanner inputNumber = new Scanner(System.in);
        int[][] numbers;
        do{
            System.out.print("Nhập số hàng cho mảng: ");
            sizeRows = inputNumber.nextInt();
            if(sizeRows <=0 ){
                System.out.println("Số hàng của mảng 2 chiều phải lớn hơn 0");
            } else if (sizeRows > 10) {
                System.out.println("Số hàng của mảng 2 chiều không được lớn hơn 10");
            }
        } while (sizeRows <= 0 || sizeRows > 10);
        do{
            System.out.print("Nhập số cột cho mảng: ");
            sizeCols = inputNumber.nextInt();
            if(sizeCols <=0 ){
                System.out.println("Số cột của mảng 2 chiều phải lớn hơn 0");
            } else if (sizeCols > 10) {
                System.out.println("Số cột của mảng 2 chiều không được lớn hơn 10");
            }
        } while (sizeCols <= 0 || sizeCols > 10);

        numbers = new int[sizeRows][sizeCols];
        System.out.println("Nhập các phần tử trong mảng 2 chiều");
        for(int i = 0; i < sizeRows; i++){
            for(int j = 0; j < sizeCols; j++){
                System.out.print("Phần tử tại hàng " + (i + 1) + " cột " + (j + 1) + ": ");
                numbers[i][j] = inputNumber.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập là");
        for(int i = 0; i < sizeRows; i++){
            for(int j = 0; j < sizeCols; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        int max = numbers[0][0];
        int indexRows = 0;
        int indexCols = 0;
        for(int i = 0; i < sizeRows; i++){
            for(int j = 0; j < sizeCols; j++){
                if(numbers[i][j] > max){
                    max = numbers[i][j];
                    indexRows = i;
                    indexCols = j;
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng 2 chiều là " + max + " tại hàng " + (indexRows + 1) + " cột " + (indexCols + 1));
        int num;
        do{
            System.out.print("Nhập cột muốn tính tổng (cột - 1): ");
            num = inputNumber.nextInt();
            if(num < 0 || num >= sizeCols){
                System.out.println("Phải nhập số từ 0 đến " + (sizeCols - 1));
            }
        } while (num < 0 || num >= sizeCols);
        int sum = 0;
        for(int i = 0; i < sizeRows; i++){
            sum += numbers[i][num];
        }
        System.out.println("Tổng của cột " + (num + 1) + " là: " + sum);
        if(sizeCols == sizeRows){
            int sumC = 0;
            int sumP = 0;
            for(int i = 0; i < sizeRows; i++){
                    sumC += numbers[i][i];
                    sumP += numbers[i][sizeRows - 1 -i];
            }
            System.out.println("Tổng đường chéo chính là: " + sumC);
            System.out.println("Tổng đường chéo phụ là: " + sumP);
        } else {
            System.out.println("Không tính được đường chéo chính và phụ vì không phải mảng vuông");
        }
    }
}
