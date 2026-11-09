import java.util.*;
class easy_error{
    public static void main(){
        Scanner sc=new Scanner (System.in);
       System.out.println("enter a number ");
       boolean aa=true;
       int i[]=new int[5];
       i[0]=10;
       i[1]=17;
       i[2]=15;
       i[3]=140;
       i[4]=104;
       while(aa){
        try{
            int a =sc.nextInt();
            System.out.println(i[a]);
        }
        catch(Exception e){
            System.out.print("how dare you to input this ");
            System.out.println(e);
            aa=false;
        } }
sc.close();
    }
}