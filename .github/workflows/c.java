
class multi1 implements Runnable{
    multi1(String name){    
        System.out.println("hello, " + name); }
    public void run(){
            System.out.println("hello");  }}
class multi2 implements Runnable{
    multi2(String name){
        System.out.println("i am a students of class 11, " + name); }
    public void run(){    
            System.out.println("i am a students of class 11");   }}
public class c{ 
    public static void main(String args[]){
        Runnable bullet = new multi1("anup");
        Thread gun=new Thread(bullet,"anup");
        gun.start();
        System.out.println("the id of this methods" + gun.threadId());
        System.out.println("the id of this methods" + gun.getName());

        Runnable bullet2 =new multi2("bodybuilder");
        Thread gun2=new Thread(bullet2);
        gun2.start();
        System.out.println("the id of this methods" + gun2.threadId());
        System.out.println("the id of this methods" + gun2.getName());          } }