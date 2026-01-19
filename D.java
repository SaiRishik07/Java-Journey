class A {
    public int add(int a, int b){
    return a+b;    
    }
}

class B extends A {
    public int add(int a, int b){
        return a+b + 3;
    }
}

public class D {
    public static void main(String[] args){
        B obj = new B();
        int res = obj.add(4,5);
        System.out.println(res);
    }
}
