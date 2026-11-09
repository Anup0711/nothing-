import java.util.*;
class multi1 implements Runnable{
    
    public void run(){
       int i=0;
        while(i<100){
            System.out.println("hello");
            i++;
        }

    }
}
class multi2 implements Runnable{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("i am a students of class 11");
            i++;
        }
    }
}
public class i{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);

        Runnable bullet = new multi1();
        Thread gun=new Thread(bullet);
        gun.start();

        Runnable bullet2 =new multi2();
        Thread gun2=new Thread(bullet2);
        gun2.start();

        sc.close();
    }
}