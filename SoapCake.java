public class SoapCake extends Cake{
    // fields
    private String scent;

    // constructors

    public SoapCake() {
        this.scent = "Neutral";
    }

    public SoapCake(String flavour, double weight, String scent) {
        super(flavour, weight);
        this.scent = scent;
    }

    // getters and setters

    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }

    // other

    @Override
    public String toString() {
        return "SoapCake{" +
                "scent='" + scent + '\'' +
                '}';
    }
}// end soap
