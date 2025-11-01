import java.util.*;
public class hashexample {
    public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
        //write your answer here
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 1; i<=4; i++){
            String value = s.next();
            map.put(i, value);
        }
        int keyToRemove = s.nextInt();
        System.out.println("Mappings of HashMap are : "+map);
        map.remove(keyToRemove);
        System.out.println("Mappings after removal are : "+map);
    }
}