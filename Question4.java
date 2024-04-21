//CONVERTING KILOMETRES IN MILES;
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args){
        System.out.print("Enter Kilometers: ");
        Scanner S = new Scanner(System.in);
        Double kilometer = S.nextDouble();
        Double miles;
        miles = kilometer*0.621;
        System.out.print("Convertion of Kilometers in Miles are: "+ miles);

    }
    
}
