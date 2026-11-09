class run1 implements Runnable{
    @Override
public void run() {
    int i=0;
    while(i<=100){
        System.out.println("anup pandit");
        i++;        }}}
class run2 implements  Runnable{
    @Override
public void run() {
    int i=0;
    while(i<=100){
        System.out.println("my name is khan");
        i++;        }
        } 
    }
public class run3{
    public static void main(String args[]){  
        Runnable bullet1=new run1();
        Thread t1=new Thread(bullet1);
        t1.start();
        Runnable bullet2=new run2();
        Thread t2=new Thread(bullet2);
        t2.start();         }}