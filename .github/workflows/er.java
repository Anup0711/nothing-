import java.util.*;
class er{
    public static void main(){
        Scanner sc=new Scanner (System.in);
       System.out.println("enter a number ");
       int c=0;
        try{
            int a =sc.nextInt();
            int b=sc.nextInt();
            
            try{
                System.out.println(a/b);     
        }
        catch(Exception e){
            System.out.print("don't do \t\t------> ");
            System.out.println(e);
            c=10; //  to check this run or not 
        }    
        }
           catch(java.util.InputMismatchException e){
            System.out.print("please don't enter\t\t------> ");
            System.out.println(e);
        }
        
        System.out.println(c);
        sc.close();

    }
}