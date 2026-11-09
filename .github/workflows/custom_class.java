import java.util.*;
class myexception extends Exception{
   @Override 
   public String toString(){
  return "enter less than 99";
    }
    @Override 
   public String getMessage(){
  return "i am to string ()";
    }
}
public class custom_class{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
       
        int a;
        System.out.println("enter a number lesser than 99");
        a=sc.nextInt();
         sc.close();
        if(a>99){
            try{
                throw new ArithmeticException();
                // throw new Exception();
            }
            catch(Exception e){
              System.out.println(e.getMessage());
               System.out.println(e.toString()); //<---------- and ---------|
               System.out.println(e);//default exception   both is same<----|
               e.printStackTrace();
            }
        }
        System.out.println("hello"+a);
    }
}