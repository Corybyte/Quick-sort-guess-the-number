import java.util.Scanner;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100)+1;
        System.out.println(number);
        int count = 0;
        for (int i = 1, j = 100; ; i++) {

            if (j/2 == number){
                count++;
                System.out.println("binggong"+count);
                break;
            }

            if (j/2 > number){
                count++;
                for (int y=1;y<=j/2;y++){
                    count++;
                    if (y==number){
                        System.out.println("binggong"+y+"\r"+"count:"+count);
                        break;
                    }

                }
                break;
            }
            if (j/2 < number){
                for (int x=j/2+1;x<=j;x++){
                    count++;
                    if (x==number) {
                        count++;
                        System.out.println("binggong"+x+"\r"+"count:"+count);
                        break;
                    }
                 }
                break;
            }

        }
    }
}


