import java.util.Scanner;

public class twoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("rows: ");
        int rows = sc.nextInt();
        System.out.print("columns: ");
        int columns = sc.nextInt();
        int Array[][] = new int[rows][columns];
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                Array[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(Array[i][j]);
            }System.out.println();
        }

        
    }
}
