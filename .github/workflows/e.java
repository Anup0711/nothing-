import java.util.*;
class e{
    public static void main(){
        Scanner sc=new Scanner (System.in);
       System.out.println("enter a number ");
        try{
            int a =sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a/b);
        }
        catch(java.util.InputMismatchException e){System
            .out.print("please don't enter other than number it throw java.util.InputMismatchException\t\t------> ");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.print("dont do this  \t\t------> ");
            System.out.println(e);
        } 
sc.close();
    }
}