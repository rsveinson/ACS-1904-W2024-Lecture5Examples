public class Practitioner {
    private String firstName;
    private String lastName;
    private String sign;
    
    // no argument constructor
    public Practitioner()     {
        firstName = lastName = sign  = "unknown";
    }
    
    // full argument  constructor
    public Practitioner(String firstName, String lastName, String sign)     {
        this.firstName = firstName;
        this.lastName  = lastName;
        this.sign    = sign;
    }
    
    // getters
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getSign(){
        return sign;
    }
    
    // setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void setGender(String sign){
        this.sign = sign;
    }
    
    // other methods
    public String toString(){
        return getName() + " " + sign;
    }
    
    public String getName(){
        return firstName + " " + lastName;
    }
}
