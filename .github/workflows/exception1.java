import java.util.*;
class myexception{

}
public class exception1{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println();
        int a;
        a=sc.nextInt();
        if(a<99){
         throw new ArithmeticException();
       }
       else{
        System.out.println("what are you doing briradther");
       }
       sc.close();
    }
}