
package liskov.s.substitution.principle;

public class Car extends TransportationDeviceWithEngine{
    
    public int price = 7700000;
    
    public void setEngineType(String engineType){
        
        if(engineType.equalsIgnoreCase("petrol")){
            this.price = this.price + 500000;
            //System.out.println("Car total Price ; " + this.price);
        } else {
            this.price = this.price + 1000000;
            //System.out.println("Car total Price ; " + this.price);
        }
    }
}
