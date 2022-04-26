import java.util.*;

public class Main {
    public static void main(String[] args) {


        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "sravan");
        hm.put(2, "sravan");
        hm.put(1, "kumar");
        hm.put(4, "ravi");
        System.out.println(hm);


        //other approach generics way

        hm.putIfAbsent(5,"krishna");

        hm.replace(5,"krishna","ramu");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());

        }




    }
}