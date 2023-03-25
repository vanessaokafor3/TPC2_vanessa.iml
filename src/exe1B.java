import java.util.Scanner;

public class exe2 {
    public static void main(String[] args){
        Scanner lerInput = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = lerInput.nextInt();
        int m=10;
        int i=1;
        while (m*i < n){
            int res= i*10;
            System.out.print(res+" ");
            i++;

        }

    }
}
