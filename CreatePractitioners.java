/**
 * Demonstration class to create practitioners
 */
public class CreatePractitioners
{
    public static void main(String[] args){
        Practitioner john = new Practitioner();
        Practitioner tom  = new Practitioner("Tom","Smith","male");
        
        // implicit call to the Practitioner object's toString() method
        System.out.println("Practitioners:\n" + john + "\n" + tom);
    }
}
