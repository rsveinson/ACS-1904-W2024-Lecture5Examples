public class Cake {
    // fields
    private String flavour;
    private double weight;

    // construtors
    public Cake(){
        flavour = "bland";
        weight = 0;
    }// end no-arg constructor

    public Cake(String flavour, double weight){
        this.flavour = flavour;
        this.weight = weight;
    }// end full arg

    // getters

    public String getFlavour() {
        return flavour;
    }// end flavour

    public double getWeight() {
        return weight;
    }// end weight

    // setters

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }// end set flavour

    public void setWeight(double weight) {
        this.weight = weight;
    }// end set weight

    @Override
    public String toString() {
        return "Cake{" +
                "flavour='" + flavour + '\'' +
                ", weight=" + weight +
                '}';
    }
}// end Cake
