/**
 * Abstract superclass
 */
public abstract class Shape {
    protected String id;
    
    // a constructor even though we don't instantiate it
    public Shape(String id){
        this.id = id;
    }
    
    // abstract method must be implemented in sub-classes
    public abstract double area();
    
    // getter
    public String getId(){
        return id;
    }
    
    // setter
    public void setId(String id){
        this.id = id;
    }
    
    // could also include concrete methods
    public String toString(){
        return id;
    }
}
