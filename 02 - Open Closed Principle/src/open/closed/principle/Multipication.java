
package open.closed.principle;

public class Multipication implements IOperation{

    public double a,b;
    public double result;
    
    public Multipication(double a, double b){
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void doOperation() {
        this.result = this.a * this.b;
    }
    
}
