class Mobile {
    String company;
    int cost;
    static String name;
    public void show(){
        System.out.println(company+ ":"+ cost +":"+name);
    }
    public static void show1(Mobile obj)
    {
        System.out.println(obj.company+":"+obj.cost+":"+name);
    }
   
    
    static {
        System.out.println("in the static");
    }
    public Mobile(){
        System.out.println("in the constructer");
    }
}
public class learn {
    public static void main(String[] args) {
       Mobile obj1 = new Mobile();
       obj1.company = "apple";
       obj1.cost = 17000;
       Mobile.name = "smartphone";
       Mobile obj2 = new Mobile();
       obj2.company = "samsung";
       obj2.cost = 13000;
       Mobile.name = "smartphone";

        Mobile.name = "Phone";
       obj1.show();
       obj2.show(); 
       Mobile.show1(obj1);
    } 
    
}
