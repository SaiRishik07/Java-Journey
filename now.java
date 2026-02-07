import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class abhi {
    public static void main(String[] args) {

      List<Integer> nums =  Arrays.asList(6,7,8,9,4,5);
      Predicate<Integer> p = ( n) -> n%2==0;
      Function<Integer,Integer> fun = ( n) ->  n*2;
        

      
      Stream<Integer> sortedValues  = nums.stream()
                     .filter( p)
                     .sorted();
            sortedValues.forEach(n-> System.out.println(n));
        
      }
    
    }
