
package dependency.inversion.principle;

public class BackendDeveloper implements InterfaceDeveloper{

    public void writeJava(){
        System.out.println("Backend development : Java");
    }
    
    @Override
    public void develop() {
        this.writeJava();
    }
    
}
