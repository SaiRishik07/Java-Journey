abstract class car{
    public abstract void drive();
    public abstract void ac();
    public void playMusic(){
        System.out.println("playinnggg");
    }
}
abstract class bmw extends car{
     public void drive(){
        System.out.println("driving");
     }
}
class Updatedbmw extends bmw{
    public void ac(){
        System.out.println("coolllll");
    }
}

public class demos {
    public static void main(String[] args) {
        car obj = new Updatedbmw();
    }
}
