public class Practitioner {
    private String firstName;
    private String lastName;
    private String gender;
    
    // no argument constructor
    public Practitioner()     {
        firstName = lastName = gender  = "unknown";
    }
    
    // full argument  constructor
    public Practitioner(String firstName, String lastName, String gender)     {
        this.firstName = firstName;
        this.lastName  = lastName;
        this.gender    = gender;
    }
    
    // getters
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getGender(){
        return gender;
    }
    
    // setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    
    // other methods
    public String toString(){
        return getName() + " " + gender;
    }
    
    public String getName(){
        return firstName + " " + lastName;
    }
}
