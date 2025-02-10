public class Circle extends Shape {
    
    private int radius;
    
    public Circle (String id, int radius) {
        super(id);      // call the super-class constructor
        this.radius = radius;
    }
    
    // getter
    public int getRadius(){
        return radius;
    }
    
    // setter
    public void setRadius(int r){
        radius = r;
    }
    
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    
    // where does toString() come from ?
}
