
class run1 implements Runnable{
    @Override

   public void run() {
    int i=0;
    while(i<=100){
        System.out.println("anup pandit");
        i++;
      
    }
}
public void run(int a) {
    int i=0;
    while(i<=100){
        System.out.println("anup                                 pandit");
        i++;
      
    }
}
}

class run2 implements Runnable{
    @Override
public void run() {
    int i=0;
    while(i<=100){
        System.out.println("i am a students of class 11");
        i++;
      
    }
}
public void run(int a) {
    int i=0;
    while(i<=100){
        System.out.println("i am a                              students of class 11");
        i++;
      
    }
}
}
public class two_multithread_in_java_with_runabble{
    public static void main(String args[]){
        
        run1 t11=new run1();
        t11.run(2);
        Runnable bullet1=new run1();
        Thread t1=new Thread(bullet1);
        t1.start();
        
       
         run2  t22=new run2();
        t22.run(2);
        Runnable bullet2=new run2();
        Thread t2=new Thread(bullet2);
        t2.start();
       

    }
}