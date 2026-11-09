class ev extends Exception{
  public String toString(){
    return"invalid input \n errors";}}
public class finly{
        public static void main(String args[])throws ev{
    int a=10,b=0;   try{
        System.out.println(a/b);
        throw new ev();
}catch(Exception e){
        System.out.println(new ev());}}}