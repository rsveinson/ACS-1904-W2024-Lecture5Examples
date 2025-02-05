public class WeddingCake extends Cake{
    // fields
    private int tiers;

    // constructors

    public WeddingCake() {
        this.tiers = 1;
    }

    public WeddingCake(String flavour, double weight, int tiers) {
        super(flavour, weight);
        this.tiers = tiers;
    }

    // getters and setters

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

    // other


    @Override
    public String toString() {
        return "WeddingCake{" +
                "tiers=" + tiers +
                '}';
    }
}// end WeddingCake
