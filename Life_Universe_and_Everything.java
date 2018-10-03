import java.util.Scanner;

public class lifeUni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int num=0;
        while(true){
            num = scanner.nextInt();
          if (num ==42)
              break;
            System.out.println(num);
        }
     }
}