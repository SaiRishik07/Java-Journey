 class Calc {
    public int add(int n1,int n2){
         return n1 + n2 ;
    }
    public int sub(int n1,int n2){
         return n1 - n2 ;
    }
}
 class AdvCalc extends Calc {
    public int Multiply(int n1,int n2){
        return n1*n2;
    }
    public int Divide(int n1,int n2){
        return n1/n2;
    }
}
 class VeryAdvCalc extends AdvCalc {
    public double Pow(int n1,int n2){
        return Math.pow(n1, n2);
    }
 }
public class Inheritance {
    public static void main(String[] args) {
        VeryAdvCalc obj1 = new VeryAdvCalc();
        int r1 = obj1.add(5, 6);
        int r2 = obj1.sub(5, 6);
        int r3 = obj1.Multiply(5, 6);
        int r4 = obj1.Divide(5, 6);
         int r5 = (int) obj1.Pow(5, 6);

     System.out.println(r1 +":"+ r2+":"+r3+":"+r4+":"+r5);
    }
}
