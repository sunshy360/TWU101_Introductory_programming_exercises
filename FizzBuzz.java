/**
 * Created by sunshy on 17-8-5.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%3!=0 && i%5!=0){
                System.out.println(i);
            }
            else if(i%3==0 && i%5!=0){
                System.out.println("Fizz");
            }
            else if(i%3!=0 && i%5==0){
                System.out.println("Buzz");
            }
            else if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
        }
    }
}