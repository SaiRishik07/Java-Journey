
abstract class Abc
{
   public abstract void show();
}

public class inner {
    public static void main(String[] args) {
        Abc obj = new Abc() { public void show() {
       System.out.println("in show B");
    }
    };
        obj.show();
    }
}
