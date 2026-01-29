enum Laptop{
    mac(2000),xps(2200),surface(1900),thinkpad(1800);
    
     private int price;
    private Laptop(int price) {
        this.price = price;
    }

   

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}

public class trial1 {
    public static void main(String[] args) {
     // Laptop lap = Laptop.mac;
      //System.out.println(lap+":"+lap.getPrice());
      for(Laptop lap :Laptop.values()){
        System.out.println(lap+":"+lap.getPrice());
      }


    }
    
}
