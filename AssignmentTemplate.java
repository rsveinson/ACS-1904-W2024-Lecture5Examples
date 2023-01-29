import java.util.Scanner;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
*/

public class AssignmentTemplate{
    public enum Suit{
        CLUBS("\u2663"), SPADES("\u2660"), HEARTS("\u2665"), DIAMONDS("\u2666");
        
        private String display;
        
        private Suit(String display){
            this.display = display;
        }
        
        public String getDisplay(){
            return display;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Suit suit;
        Suit[] suits = Suit.values();
        
        for(Suit s : suits)
            System.out.println(s + ", " + s.getDisplay());
            
        
        System.out.println("end of program ");
    }
}
