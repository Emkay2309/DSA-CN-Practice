package JAVA.Practice;

public class CarUse extends Car {
    public static void main(String[] args) {
        CarUse v = new CarUse();
        v.colour = "white";
        v.set(1010) ;
        System.out.println(v.colour + " " + v.get());
    }
}
