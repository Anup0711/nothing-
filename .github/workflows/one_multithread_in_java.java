import java.util.*;
class thre extends Thread{
    
public void run() {
    // int i=0;
    // while(i<=100){
        System.out.println("anup pandit");
    //     i++;
      
    // }
}
// public void run(int a) {
//     int i=0;
//     while(i<=100){
//         System.out.println("anup                                 pandit");
//         i++;
      
//     }
// }
}
class thee extends Thread{
    @Override
public void run() {
    // int i=0;
    // while(i<=100){
        System.out.println("my name is khan");
    //     i++;
    // }    
}

// public void run(int a) {
//     int i=0;
//     // while(i<=100){
//         System.out.println("my name is                                                      khan");
//     //     i++;
//     // }    
// }
}
public class one_multithread_in_java{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);

        thre t1=new thre();
        t1.start();
        
        thee t2=new thee();
        t2.start();
        System.out.println("the id of this methods"+t2.threadId());

        // t1.run(2);
        // t2.run(2);

        sc.close();
    }
}