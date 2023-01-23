
package dependency.inversion.principle;

public class FrontendDeveloper implements InterfaceDeveloper{

    public void writeReact(){
        System.out.println("Frontend development : Reactjs");
    }
    
    @Override
    public void develop() {
        this.writeReact();
    }
    
}
