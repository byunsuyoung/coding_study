import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int b[] = new int[N + 1];
        int nb[] = new int[N + 1];	

        for (int s = 1; s <= N; s++) {
            b[s] = s;
            nb[s] = s;
        }

        for (int x = 0; x < M; x++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            int ii = i;	

            for (int g = 0; g < j - i + 1; g++) {
                if (k + g <= j) {
                    nb[g + i] = b[k + g];	
                } else {
                    nb[g + i] = b[ii++];
                }
            }

            for (int y = 1; y <= N; y++) {		
                b[y] = nb[y];
            }
        }

        for (int z = 1; z <= N; z++) 
            System.out.print(nb[z] + " ");
    }
}