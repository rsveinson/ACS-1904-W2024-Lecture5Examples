import java.util.Scanner;
import java.util.ArrayList;

/** 
 * ACS-1904 Assignment X Question Y
 * @author 
*/

public class AnimalKingdom{

    
    public static void main(String[] args) {
        ArrayList<Animal> animals= new ArrayList();
        
        animals.add(new Mammal("fluffy", true));
        animals.add(new Mammal("Swimmy", false));
        animals.add(new Bird("Dori", true));
        
        for(Animal a : animals){
            System.out.println(a.eat());
        }
        
        System.out.println("end of program ");
    }
}
