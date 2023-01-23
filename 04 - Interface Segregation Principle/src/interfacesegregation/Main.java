
package interfacesegregation;

public class Main {

    public static void main(String[] args) {
        
        BurgerOrderService burger = new BurgerOrderService();
        burger.orderBurger(4);
        
        FriesOrderService fries = new FriesOrderService();
        fries.orderFries(6);
        
        ComboOrderService combo = new ComboOrderService();
        combo.orderCombo(2,5);
    }
    
}
