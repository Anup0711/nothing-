class thre extends Thread
{
public void run() 
{  
    int i=0;
      while(i<=500)
        {
       System.out.println("thank you ");
        i++;     
    }
}
}

class three extends Thread
{
public void run() 
{  
    int i=0;
      while(i<=500)
        {
       System.out.println("my thank you ");
        i++;     
        //  try {
        //     Thread.sleep(5000);
        //  }
        //  catch(InterruptedException e){
        //     e.printStackTrace();
        //  } 
    }
}
}

public class p{
    public static void main(String args[]){
        thre t1=new thre();
        three t2=new three();    
        t1.start();
        // try{
        //     t1.join();
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        t2.start();

    }
}