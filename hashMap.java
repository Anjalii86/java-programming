import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> a=new HashMap<>();
        //insertion
        a.put("India", 1);
        a.put("Pakistan", 0);          
          a.put("nepal", 2);
          System.out.println(a);
          
        //search-> get
        if(a.containsKey("indonesia")){
            System.out.println("key is present");
        }else{
            System.out.println("key is not present");
        }
        System.out.println(a.get("china"));
        //remove
          a.remove("Pakistan");
          System.out.println(a);
          

          
          
    }
    
}
