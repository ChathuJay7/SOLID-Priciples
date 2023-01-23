
package interfacesegregation;

public class ComboOrderService implements ComboInterface{

    @Override
    public void orderCombo(int burger, int fries) {
        
        System.out.println("Recieved order of " + burger + " burgers and " + fries + " fries");
        
    }
    
}
