
class myexception extends Exception{
   @Override 
   public String toString(){
  return "enter more than 0";
    }
    @Override 
   public String getMessage(){
  return "enter more than 0";
    }
}
class q{
    public static double area(double r)throws myexception{
        if(r < 1) {
            throw new myexception();
        }
        else
       { double c=(double)Math.PI*r*r;
        return c;}
    }
}
public class aa{ 
       public static void main(String args[]) throws myexception
    {
        try{
            double result = q.area(0);
        System.out.println(result);
        }
        catch(Exception e){
          System.out.println(e);
        }
    }
}
