import java.util.*;
public class twoDArrayTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int rows = sc.nextInt();
        System.out.println("enter columns");
        int columns = sc.nextInt();
        int array[][] = new int[rows][columns];
        for (int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                array[i][j]= sc.nextInt();
            }
        }
        for (int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(array[i][j] + " ");
            }System.out.println();
        }
        System.out.println("enter your number: ");
        int yourNum = sc.nextInt();
        for (int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if (array[i][j] == yourNum){
                    System.out.println("rows= "+ (i+1)+ " columns= "+(j+1));
                }
            }
        }
    }
}
