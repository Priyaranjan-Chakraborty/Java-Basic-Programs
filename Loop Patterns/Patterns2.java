import java.util.*;
public class Patterns2{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int number;
        System.out.print("Enter the number: ");
        number=input.nextInt();
        for(int i=number;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}