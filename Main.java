/**
 * Created by sunshy on 17-8-5.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三角形高度：");
        int height = sc.nextInt();
        for(int i=1;i<=height;i++){
            for(int j=0;j<i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
