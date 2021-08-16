import java.util.Arrays;

class Thread1 extends Thread{

    public static int a;
    public static int beg;
    @Override
    public void run() {

        for (int i = beg; i < a; i++) {
            ThreadExample.myArray[i] = i;
        }
    }
}
class Thread2 implements Runnable{

    public static int a;
    public static int beg;
    @Override
    public void run() {
        for (int i = beg; i < a; i++) {
            ThreadExample.myArray[i] = i;
        }
    }
}
class Thread3 implements Runnable{

    public static int a;
    public static int beg;
    @Override
    public void run() {
        for (int i = beg; i < a; i++) {
            ThreadExample.myArray[i] = i;
        }
    }
}
public class ThreadExample {
    public static int[] myArray = new int[20];

    public static void main(String[] args) throws InterruptedException {

        Thread1.a = 10;
        Thread1.beg = 0;

        Thread2.a = 15;
        Thread2.beg = 10;

        Thread3.a = 20;
        Thread3.beg = 15;

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        Thread t2Thread = new Thread(t2);
        Thread t3Thread = new Thread(t3);

        t1.start();
        //t1.join();

        t2Thread.start();
        t1.join();
        t2Thread.join();

        t3Thread.start();
        t3Thread.join();
        String i= 0+"";
        System.out.println(i);
        System.out.println(Arrays.toString(myArray));




    }
}


