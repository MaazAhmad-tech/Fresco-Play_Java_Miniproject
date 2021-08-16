//import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        //Scanner sc = new Scanner(System.in);
        String input1 = "67 4,34 2,54 5,100 2|1,100,5|0,100,5";
        Student s1 = new Aided();
        System.out.println(s1.result(input1));
        String input2 = "100 5,100 5,100 5,76 3|0,100,5";
        Student s2 = new SelfFinance();
        System.out.println(s2.result(input2));
    }

}
