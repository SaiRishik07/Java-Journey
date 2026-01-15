class Calculater {
    int a ;
    public int add(int n1,int n2){
       int r = n1 + n2;
       return r ; 
    }
}

public class Demo {
    
    public static void main(String[] args) {
        int num1=5;
        int num2=6;
        
        Calculater clac = new Calculater();
         int result = clac.add(num1, num2);
        System.out.println(result);

    }
}
