import java.util.Scanner;

public class Question{
    public static void main(String [] args){
        System.out.println("Enter Your Marks Out of 100:");
        Scanner S = new Scanner(System.in);
        System.out.print("Enter marks obtained in Maths: ");
        int m = S.nextInt();
        System.out.print("Enter marks obtained in chemistry: ");
        int c = S.nextInt();
        System.out.print("Enter marks obtained in Science: ");
        int s= S.nextInt();
        System.out.print("Enter marks obtained in Gujarati: ");
        int g= S.nextInt();
        System.out.print("Enter marks obtained in English: ");
        int e= S.nextInt();
    
     int sum;
     sum=m+c+s+g+e;
    float per;
    per = (sum*100/500);

    System.out.println("Overall percentage of above subject:"+per);

    }

}