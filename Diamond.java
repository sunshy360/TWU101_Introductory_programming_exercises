import java.util.Scanner;

/**
 * Created by sunshy on 17-8-5.
 */
public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入菱形类型（1：等腰三角形，2：菱形，3：带名字的菱形）：");
        int type = sc.nextInt();
        System.out.println("请输入菱形高度：");
        int height = sc.nextInt();
        if(type==1)
            isoscelesTriangle(height);
            else if(type==2)
                diamond(height);
                else if(type==3)
                    diamondWithName(height);

    }

    //打印等腰三角形
    public static void isoscelesTriangle(int height){
        String line = "";
        for(int i=1;i<=height;i++){
            for(int j=0;j<i*2-1;j++)
                line += "*";
            System.out.println(centerAndAddSpace(line,2*height-1));
            line = "";
        }
    }

    //打印菱形
    public static void diamond(int height){
        String line = "";
        for(int i=1;i<=height;i++){
            for(int j=0;j<i*2-1;j++)
                line += "*";
            System.out.println(centerAndAddSpace(line,2*height-1));
            line = "";
        }
        for(int i=height-1;i>0;i--){
            for(int j=0;j<i*2-1;j++)
                line += "*";
            System.out.println(centerAndAddSpace(line,2*height-1));
            line = "";
        }
    }

    //打印带名字的菱形
    public static void diamondWithName(int height){
        String line = "";
        for(int i=1;i<=height-1;i++){
            for(int j=0;j<i*2-1;j++)
                line += "*";
            System.out.println(centerAndAddSpace(line,2*height-1));
            line = "";
        }
        System.out.println("sunshy");
        for(int i=height-1;i>0;i--){
            for(int j=0;j<i*2-1;j++)
                line += "*";
            System.out.println(centerAndAddSpace(line,2*height-1));
            line = "";
        }

    }

    //字符串居中并补齐空格
    public static String centerAndAddSpace(String str, int len){
        int actLen = str.length();
        for(int i=0;i<(len-actLen)/2;i++){
            str = " " + str + " ";
        }
        return str;
    }
}
