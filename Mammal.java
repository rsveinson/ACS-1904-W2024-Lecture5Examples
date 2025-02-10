import java.util.Scanner;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
 */

public  class  Mammal extends Animal{

    private boolean terrestrial ;

    public Mammal(){
        // implied call to super class no-arg
        terrestrial = true;
    }

    public Mammal(String n, boolean t){
        super(n);
        terrestrial = t;
    }

    public String eat(){
        return "nom nom nom";
        
        
    }

    // other methods here

}
