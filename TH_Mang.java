import java.util.Scanner;

public class TH_Mang {
    public static void main(String[] args) {
// khai báo các biến, nhập và kiểm tra kicks thước của mảng
        int size;
        int[] array;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size=scanner.nextInt();
            if (size>10){
                System.out.println("Độ dài của mảng k lớn hơn 10");

            }
        }while (size>10);
        //nhập các phần tử cho mảng
        array=new int[size];
        int i=0;
        while (i<array.length){
            System.out.println("enter element "+(i+1)+" : ");
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.print("Mảng arr có các phần tủ là : ");
        for (int j=0;j<array.length;j++){
            System.out.print(array[j]+"-");
        }
        // Đảo ngược các phần tủ trong mảng
        for (int j=0 ;j<array.length/2;j++){
            int temp=array[j];
            array[j]=array[size-1-j];
            array[size-1-j]=temp;
        }
        System.out.print("\n"+"Mảng arr Sau Khi đảo ngược là : ");
        for (int j=0;j<array.length;j++){
            System.out.print(array[j]+"-");
        }
    }
}
