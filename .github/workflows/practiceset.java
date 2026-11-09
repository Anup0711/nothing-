import java.util.*;
class ev extends Exception{
  public String toString(){
    return"invalid input \n errors";
}}
public class practiceset{
public static void main (String args[])throws ev{
  Scanner sc=new Scanner (System.in);
  int a[]={10,12,23,43,45};
  int in,c;
  boolean b=true;
    while(b){
      System.out.println("enter a number");
      in=sc.nextInt();
    
      if(in>a.length)
        {
          try{
        c=a[in];
      System.out.println(c);
      throw new ev();
          }
      catch(Exception e){
        System.out.println(new ev());
      }
    }
    else {
      c=a[in];
      System.out.println(c);
      b=false;
}
  }}}
    
