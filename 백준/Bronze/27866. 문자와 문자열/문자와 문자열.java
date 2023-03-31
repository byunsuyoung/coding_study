import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String[] s = sc.next().split("");
       int b = sc.nextInt();
        
        System.out.println(s[b-1]);
    }
}