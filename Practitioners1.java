import java.util.ArrayList;
public class Practitioners1 {
   public static void main(String[] args){
      // List of practitioners
      ArrayList<Practitioner> practitioners = new ArrayList();
      
      // Create some practitioners
      Practitioner pr = new Practitioner("Sam","Smith","Virgo");
      Doctor       dr = new Doctor("Jill","Jones","Cancer","Dermatology");
      Pharmacist   ph = new Pharmacist("Eddy","Edwards","Aries","Drugco");
      
      // add them to the arraylist
      practitioners.add(pr);
      practitioners.add(dr);
      practitioners.add(ph);
      
      
      for (Practitioner p: practitioners) {
         // display name
         // getName() in Doctor overrides
         // getName() in Practitioner
         System.out.println(p.getName());
      }
      
      /* get specialty does not work because it is not overridden 
       * from the super class
       * get name does work because it is overridden
       * it uses the correct version of getName because java is
       * able to resolve the type of the object (not the type of the referring
       * variable) and use the method local to the object.
       */
      
      //practitioners.get(1).getSpecialty();
      System.out.println(practitioners.get(1).getName());
      /* *****
       * some experiments
       * with hierachic objects
       */
      Practitioner pDoc = new Doctor("Franz", "Klammer", "Pisces", "Orthopedics");
      Practitioner pPharm = new Pharmacist("Ayrton", "Senna", "Libra", "Rio");
      //Doctor dPrac = new Practitioner("Olga", "Korbet", "Taurus", "Cardiology");
      //Pharmacist pPrac = new Practitioner("Clara", "Hughs", "Gemini", "Balco");
      
      System.out.println(pDoc.getName());
      System.out.println(pPharm.getName());
      
      // now methods from the sub-clases
      //System.out.println(pDoc.getSpecialty());
      //System.out.println(pPharm.getLocation());
      
      // now with casting
      //System.out.println(((Doctor)pDoc).getSpecialty());
      Doctor tempDr = (Doctor)pDoc;
      
      System.out.println(((Pharmacist)pPharm).getLocation());      
      
   }
}
