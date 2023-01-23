
package dependency.inversion.principle;

public class Developer {
    
    public void implementDeveloper(InterfaceDeveloper interfaceDeveloper){
        
        interfaceDeveloper.develop();
        
    }
    
}
