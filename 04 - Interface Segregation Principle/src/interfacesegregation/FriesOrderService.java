
package interfacesegregation;

public class FriesOrderService implements FriesInterface{

    @Override
    public void orderFries(int quantity) {
        
        System.out.println("Recieved order of " + quantity + " fries");
        
    }
    
}
