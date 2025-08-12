public class exercise  {
    public static void main(String [] args) {
        int score = 75 ;
        char grade = 'B' ;
       
       
        if(score>=90){
           grade = 'A';
        }
        else if(score>=75 && score<= 89){
           grade = 'B';
        }
        else if(score>=60 && score<75){
           grade = 'C';
        }
        else {
           grade = 'D';
        }

        if (score >= 50){
            System.out.println("passed");
        }
        else{
            System.out.println("failed");
        }
        System.out.println("Grade = "+grade);
    }
}
   