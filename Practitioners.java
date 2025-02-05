import java.util.ArrayList;
public class Practitioners {
   public static void main(String[] args){
      // List of practitioners
      ArrayList<Practitioner> practitioners = new ArrayList();
      
      // Create some practitioners
      Practitioner pr = new Practitioner("Sam","Smith","Prac222");
      Doctor       dr = new Doctor("Jill","Jones","Doc111","Dermatology");
      Pharmacist   ph = new Pharmacist("Eddy","Edwards","Pha222","Drugco");
      
      /* these two lines won't work
       * beacause they don't follow the is A
       * relationship of this hierarchy
       */
      //Doctor d2 = new Pharmacist();
      //Doctor d2 = new Practitioner();
      
      /* add them to the list
       * no problem since doctors and pharmacists all have the "is a" relationship 
       * with Practitioner
       */
      practitioners.add(pr);
      practitioners.add(dr);
      practitioners.add(ph);
      
      // but practitioners don't have all of the methods and/or fields
      // of doctors or pharmacists
      Doctor doctor = (Doctor)practitioners.get(1);
      System.out.println(doctor.getSpecialty());
      //System.out.println(practitioners.get(1).getSpecialty());
      
      System.out.println(dr.getSpecialty());
      
      // iterate over the whole list
      for (Practitioner p: practitioners) {
         String type="practitioner";
         if (p instanceof Doctor) type="doctor";
         if (p instanceof Pharmacist) type="pharmacist";
         //System.out.println(type+" " + p.getFirstName());
         System.out.println(type+" " + p.getName());
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
