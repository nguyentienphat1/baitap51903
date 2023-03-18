import java.awt.font.FontRenderContext;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        double tong=0;
        int gt=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n");
        n= scanner.nextInt();
        for (int i=1;i<=n;i++){
            gt=gt*i;
            double j=Math.pow(gt,i);
            tong=tong+j;
        }
        System.out.println("tong la:"+tong);
    }
}