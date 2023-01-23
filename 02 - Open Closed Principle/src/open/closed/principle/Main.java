
package open.closed.principle;

public class Main {

    public static void main(String[] args) {
        
        Calculator calculator = new Calculator();
        
        Addition addition = new Addition(20,10);
        calculator.calculate(addition);
        System.out.println("Addition : " + addition.result);
        System.out.println(addition.a + " + " + addition.b + " = " + addition.result);
        
        
        Subtraction subtraction = new Subtraction(20, 10);
        calculator.calculate(subtraction);
        System.out.println("\nSubtraction : " + subtraction.result);
        System.out.println(subtraction.a + " - " + subtraction.b + " = " + subtraction.result);
        
        
        Multipication multipication = new Multipication(20, 10);
        calculator.calculate(multipication);
        System.out.println("\nMultipication : " + multipication.result);
        System.out.println(multipication.a + " x " + multipication.b + " = " + multipication.result);
        
        
        Division division = new Division(20, 10);
        calculator.calculate(division);
        System.out.println("\nDivision : " + division.result);
        System.out.println(division.a + " / " + division.b + " = " + division.result);
    }
    
}
