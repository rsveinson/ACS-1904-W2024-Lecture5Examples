public class BirthdayCake extends Cake{
    // fields
    private String shape;
    private String message;
    private int candles;

    // constructors

    public BirthdayCake() {
        this.shape = "amorphous blob";
        this.message = "Happy Birthday!";
        this.candles = 0;
    }// end no-arg

    public BirthdayCake(String flavour, double weight, String shape, String message, int candles) {
        super(flavour, weight);
        this.shape = shape;
        this.message = message;
        this.candles = candles;
    }// end full arg

    // constructor with an implicit call to the super class
    // no-arg constructor
    public BirthdayCake(String shape, String message, int candles) {
        this.shape = shape;
        this.message = message;
        this.candles = candles;
    }// end implicit super no-arg

    // getters

    public String getShape() {
        return shape;
    }

    public String getMessage() {
        return message;
    }

    public int getCandles() {
        return candles;
    }

    // setters

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }

    // toString

    @Override
    public String toString() {
        return "BirthdayCake{" +
                "shape='" + shape + '\'' +
                ", message='" + message + '\'' +
                ", candles=" + candles +
                '}';
    }
}// end birthday cake
