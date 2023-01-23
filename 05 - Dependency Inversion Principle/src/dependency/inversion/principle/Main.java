
package dependency.inversion.principle;

public class Main {

    public static void main(String[] args) {
        
        InterfaceDeveloper frontendDeveloper = new FrontendDeveloper();
        InterfaceDeveloper backendDeveloper = new BackendDeveloper();
        
        Developer developer = new Developer();
        
        developer.implementDeveloper(frontendDeveloper);
        developer.implementDeveloper(backendDeveloper);
        
    }
    
}
