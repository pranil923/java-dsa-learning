import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int digits[] = new int[size];

        for(int i = 0; i<size; i++){
            digits[i] = sc.nextInt();
        }
        for(int i =size-1; i>=0; i--){
            System.out.println(digits[i]);
        }


        // We will code the reverse array tracking logic here
        // System.out.println("Reverse Array Project Initialized!");
    }
}
