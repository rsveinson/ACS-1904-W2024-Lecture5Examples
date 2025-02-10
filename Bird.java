import java.util.Scanner;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
 */

public  class  Bird extends Animal{

    private boolean flies ;

    public Bird(){
        // implied call to super class no-arg
        flies = true;
    }

    public Bird(String n, boolean t){
        super(n);
        flies = t;
    }

    public String eat(){
        return "peck peck peck";
        
        
    }

    // other methods here

}
