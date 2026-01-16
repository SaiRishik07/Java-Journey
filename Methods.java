class Calculater
{
    public int add(int n1,int n2){
        return n1 + n2 ;
    }
    public int add (int n1, int n2, int n3){
        return n1 + n2 + n3 ;
    }
    public double add (double n1 , int n2){
        return n1 + n2 ;
    }
}  

public class Methods {
    public static void main(String[] args) {
    Calculater  obj = new Calculater();
   int r1 = obj.add( 3,4,5);
   System.out.println(r1);
    }
}