import java.util.Scanner;

public class nextArray {
    public static void main(String[] args) {
        int x = 12;
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int input[] = new int[size];
        for (int i=0; i<size; i++){
            input[i] = sc.nextInt();
        }
        for(int i=0; i<size; i++){
            if(input[i]==x){
                System.out.println(i+1);
            }
        }
    }
}
