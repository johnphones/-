import java.util.Scanner;

public class callatz {
    public static void main(String[] args){
        System.out.println("hello world!");
        int a;
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(a = 0; num != 1; a++){
            if(num % 2 == 0){
                num = num / 2;
            }else{
                num = (3 * num + 1) / 2;
            }
        }
        System.out.println(a);
    }
}
