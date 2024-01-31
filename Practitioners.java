import java.util.ArrayList;
public class Practitioners {
   public static void main(String[] args){
      // List of practitioners
      ArrayList<Practitioner> practitioners = new ArrayList();
      
      // Create some practitioners
      Practitioner pr = new Practitioner("Sam","Smith","Virgo");
      Doctor       dr = new Doctor("Jill","Jones","Cancer","Dermatology");
      Pharmacist   ph = new Pharmacist("Eddy","Edwards","Draco","Drugco");
      
      /* add them to the list
       * no problem since doctors and pharmacists all have the "is a" relationship 
       * with Practitioner
       */
      practitioners.add(pr);
      practitioners.add(dr);
      practitioners.add(ph);
      
      // but practitioners don't have all of the methods and/or fields
      // of doctors or pharmacists
      // System.out.println(practitioners.get(2).getSpecialty());
      // System.out.println(dr.getSpecialty());
      
      // iterate over the whole list
      for (Practitioner p: practitioners) {
         String type="practitioner";
         if (p instanceof Doctor) type="doctor";
         if (p instanceof Pharmacist) type="pharmacist";
         System.out.println(type+" " + p.getFirstName());
      }
      
      /* Now watch this and see if you can make
       * sense out of what happens
       */
      System.out.println("\n***** Make some space *****");
      System.out.println("Doctors have a getSpecialty method so.");
      System.out.println("Doctor: " + dr.getFirstName() + " " + dr.getSpecialty());
      
      /* but wait what if we do this
       * seems like it should work too
      */ 
      System.out.println("Doctors have a getSpecialty method so.");
      System.out.print("Doctor: " + practitioners.get(1).getFirstName());
      //System.out.println(" " + practitioners.get(1).getSpecialty());
      
   }
}
