import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FulfillmentId {
    int data=50;


    public static void main(String args[]){

    String s1=new String("Abhishek");
    String s2=new String("Abhishek");
    String s3=new String("Kumar");
    if(s1==s2){
        System.out.print("Both are equal");
    }
    else{
        System.out.println("Both are different");
        System.out.println(s1);
        System.out.println(s2);
        HashMap<String,String> has=new HashMap<String, String>();
        has.put(s1,"23");
        has.put(s2,"23");
        for(Map.Entry m:has.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println(s1+s3);
    }


    }
}
