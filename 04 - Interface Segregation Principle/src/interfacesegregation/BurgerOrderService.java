
package interfacesegregation;

public class BurgerOrderService implements BurgerInterface{

    @Override
    public void orderBurger(int quantity) {
        
        System.out.println("Recieved order of " + quantity + " burgers");
        
    }
    
}
