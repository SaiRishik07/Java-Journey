
class Computer{
    public void code();
}

class Laptop extends Computer{
    public void code(){
        System.out.println("code,compile,run");
    }
}
class Desktop extends Computer{
    public void code(){
        System.out.println("code,compile,run,faster");
    }
}
class Developer{
    public void devApp(Computer lap){
        lap.code();
    }
}
public class trial {
    public static void main(String[] args) {
      Computer lap = new Laptop();
      Computer desk = new Desktop();
        Developer sai = new Developer();
        sai.devApp(desk);
    }
    
}
