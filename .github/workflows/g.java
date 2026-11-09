
class good extends Thread{
    public void run(){
    //    int i=0;
    //    while(i<200){
      System.out.println("good morning ");
    //     i++;
    //    }

    }
}
class welcome extends Thread{

    public void run(){
        // int i=0;
        // while(i<200){
            System.out.println("welcome buddy ");
        //     i++;
        //     try {
        //         Thread.sleep(10);
        //     }
        //     catch(InterruptedException e){
        //         e.printStackTrace();
        //     }
        // }
        
    }
}
class wow extends Thread{

    public void run(){
        // int i=0;
        // while(i<200){
            System.out.println("wOW buddy ");
        //     i++;
        //     try {
        //         Thread.sleep(10);
        //     }
        //     catch(InterruptedException e){
        //         e.printStackTrace();
        //     }
        // }
        
    }
}
class how extends Thread{

    public void run(){
        // int i=0;
        // while(i<200){
            System.out.println("HOW          buddy ");
        //     i++;
        //     try {
        //         Thread.sleep(10);
        //     }
        //     catch(InterruptedException e){
        //         e.printStackTrace();
        //     }
        // }
        
    }
}
public class g{
public static void main(String args[]){
    good go= new good ();
    go.start();
    go.setPriority(Thread.MAX_PRIORITY);
    System.out.println(go.getPriority());
    welcome WEL= new welcome();
    WEL.start();
    WEL.setPriority(Thread.NORM_PRIORITY);
    System.out.println(WEL.getPriority());
    wow wow= new wow ();
    wow.start();
    // wow.setPriority(Thread.MIN_PRIORITY);
    wow.setPriority(7);
    System.out.println(wow.getPriority());
    how how= new how ();
    how.start();
    how.setPriority(Thread.MIN_PRIORITY);
    System.out.println(how.getPriority());
    
}
}