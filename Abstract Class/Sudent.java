import java.text.DecimalFormat;
import java.util.Arrays;

abstract class Student {

    //Write your code. Use this class as abstract class.
    public static double calculateGP(int marks){

        DecimalFormat df = new DecimalFormat("#.#");
        double res = 0;
        if(marks>=75 && marks<= 100)
        {
            double diff = marks - 75;
            int r=0;
            if(diff >= 2.36)
            {
                r = (int)(diff/2.36);
            }
            double inc = 0.1* r;
            /*double value = 0.04;
            double inc = (diff*value);
            String str = String.format("%.1f",inc);*/
            res = 9+inc;
        }
        else if(marks>=60 && marks<=74){

            int diff = marks - 60;
            int r=0;
            if(diff >= 1.5)
            {
                r = (int)(diff/1.5);
            }
            double inc = 0.1* r;
            /*double value = 0.9/14;
            double inc = (diff*value);
            String str = String.format("%.1f",inc);*/
            res = 8+inc;
        }
        else if(marks>=50 && marks<= 59){
            int diff = marks - 50;
            double value = 0.1;
            res = 7+(diff*value);
        }
        else if(marks>=40 && marks<=49)
        {
            int diff = marks - 40;
            double value = 0.1;
            res = 6+(diff*value);
        }
        else
        {
            res = 0;
        }
        df.format(res);
        return res;
    }
    public abstract String result(String MarksOfStudent);

}

class Aided extends Student{

    public String result(String allMarks){

        String res="";
        double numerator = 0;
        double CreditPointsMax = 0, CGPA = 0;
        //double totalMarks = 0;
        //"67 4,34 2,54 5,100 2|1,100,5|0,100,5";
        String Aidedmarks[] = allMarks.split("[|]");
        /*System.out.println(Arrays.toString(Aidedmarks));
        System.out.println(Aidedmarks.length);*/
        String SubjectMarks[] = Aidedmarks[0].split("[,]");
        for(int i=0; i<SubjectMarks.length; i++){
            String individualMarks[] = SubjectMarks[i].split("[ ]");
            CreditPointsMax += 5;
            //totalMarks += Integer.parseInt(individualMarks[0]);
            numerator += Student.calculateGP(Integer.parseInt(individualMarks[0]))*Integer.parseInt(individualMarks[1]);
            System.out.println(numerator+" ");
        }
        //"67 4,34 2,54 5,100 2|1,100,5|0,100,5";
        for(int i=1; i<Aidedmarks.length; i++){
            String[] restMarks = Aidedmarks[i].split("[,]");
            if(restMarks[0].equals("1")){
                //totalMarks += Integer.parseInt(restMarks[1]);
                CreditPointsMax += 5;
                numerator += Student.calculateGP(Integer.parseInt(restMarks[1]))*Integer.parseInt(restMarks[2]);
                System.out.println(numerator+" ");
            }
        }
        CGPA = numerator/CreditPointsMax;
        res = String.format("%.2f",CGPA);
        return res;

    }
}
class SelfFinance extends Student{


    public String result(String MarksOfStudent){

        String res="";
        double numerator = 0;
        double CreditPointsMax = 0, CGPA = 0;
        //double totalMarks = 0;
        //"100 5,100 5,100 5,76 3|0,100,5";
        String Aidedmarks[] = MarksOfStudent.split("[|]");
        String SubjectMarks[] = Aidedmarks[0].split("[,]");
        for(int i=0; i<SubjectMarks.length; i++){
            String individualMarks[] = SubjectMarks[i].split("[ ]");
            CreditPointsMax += 5;
            //totalMarks += Integer.parseInt(individualMarks[0]);
            numerator += Student.calculateGP(Integer.parseInt(individualMarks[0]))*Integer.parseInt(individualMarks[1]);
            //System.out.println(numerator+" ");
        }
        //"100 5,100 5,100 5,76 3|0,100,5";
        String[] restMarks = Aidedmarks[1].split("[,]");
        if(restMarks[0].equals("1")){
            //totalMarks += Integer.parseInt(restMarks[1]);
            CreditPointsMax += 5;
            numerator += Student.calculateGP(Integer.parseInt(restMarks[1]))*Integer.parseInt(restMarks[2]);
            //System.out.println(numerator+" ");
        }
        CGPA = numerator/CreditPointsMax;
        res = String.format("%.2f",CGPA);
        return res;
    }
}
//100 5,100 5,100 5|1,100,5|0,100,5
