import java.util.Scanner;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
*/

public abstract class Animal{

    protected String name;
    
    public Animal(){
        name = "???";
    }
    
    public Animal(String n){
        name = n;
    }
    
    public abstract String eat();
    
    // other methods here
    
    
}
