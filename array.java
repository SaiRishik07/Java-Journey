public class array {
    public static void main (String [] a){
        int numbers [] = {45 , 22, 89, 16, 90, 33};
        int smallest = numbers [0];
         int largest = numbers [0];
        for (int i=1 ; i < numbers.length ; i++)
        {
            if (numbers [i] < smallest ){
                smallest = numbers [i];
            }
            if (numbers [i] > largest ){
                largest = numbers [i];
            }

        }
        System.out.println("smallest: "+smallest);

        System.out.println("largest : "+largest);
    }
}