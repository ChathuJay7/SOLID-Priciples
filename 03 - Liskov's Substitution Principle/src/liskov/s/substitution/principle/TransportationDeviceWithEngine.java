
package liskov.s.substitution.principle;

public class TransportationDeviceWithEngine extends TransportationDevice{
    
    private String engineType;

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    
    
}
