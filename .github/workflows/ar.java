import java.util.*;
class ar{
    public static void main(String args[]){
        ArrayList<Integer> li=new ArrayList<Integer >();
        ArrayList<String> b=new ArrayList<>(1000000000);
        b.add("anup");
        b.add("pandit");
        b.add("pandit");
      
        li.add(1);
        li.add(98);
        
        // li.addAll(0,b);
        // li.remove(3);
        //  li.addLast(676);
        //  li.addFirst(776);
        //  li.clear();
        // li.set(1,32);
        for(int i=0;i<b.size();i++){
            System.out.print(b.get(i)+"  ,  ");
          }
            System.out.println("\n"+li.contains(10));
            System.out.println(li.contains(56));
            // System.out.println(li.indexOf(3));
            System.out.println(li.lastIndexOf(3));
    }}