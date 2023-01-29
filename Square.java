public class Square extends Shape {
    private int length;
    
    public Square(String id, int length) {
        super(id);              // explicit call to super constructor
        this.length = length;
    }
    
    // getter
    public int getLength(){
        return length;
    }
    
    // setter
    public void setLength(int l){
        this.length = l;
    }
    
    /* when we extended Shape we promised to implement the area()
     * method so her it is
     */
    public double area() {
        return length * length;
    }
}
