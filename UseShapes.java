import java.util.ArrayList;
public class UseShapes {
public static void main(String[] args) {
    ArrayList<Shape> shapes = new ArrayList();
    
    //Shape shape = new Shape();
    Square s2 = new Square("S2", 7);
    Circle c2 = new Circle("C2", 4);
    Shape c3 = new Circle("C3", 6);
    //System.out.println(c3.getRadius());
    
    System.out.println(s2.area());
    System.out.println(c2.area());
    System.out.println(c3.area());
    
    shapes.add( new Square("S1", 5) );
    shapes.add( new Circle("C1", 5) );
    //shapes.add( new Shape("C1") );
    
    shapes.add(s2);
    shapes.add(c2);
    
    for (Shape s: shapes){ 
       System.out.println("area of " + s.toString() + " is " + s.area());
       //System.out.println("area of " + s.toString() + " is " + s.area() + s.getLength());
    }
    }
}
