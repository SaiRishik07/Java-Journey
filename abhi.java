import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class abhi {
    public static void main(String[] args) {

      List<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(3);
        nums.add(6);
       
        Collections.sort(nums);
       for(Integer n : nums){
        int num = (Integer)n;
        System.out.println(num);

       }

    Set<Integer> numms = new HashSet<Integer>();
        numms.add(6);
        numms.add(7);
       numms.add(8);
       numms.add(9);
        numms.add(3);
        numms.add(6);
       for(Integer n : numms){
       
        System.out.println(n);

       }
    Map <String,Integer> students = new HashMap<>();
    students.put("Sai", 90);
    students.put("adi", 50);
    students.put("ravi", 60);
    students.put("isagi", 60);
    students.put("Sai", 95);

    System.out.println(students);

    

    }
}