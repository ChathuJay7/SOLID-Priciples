
package open.closed.principle;

public class Division implements IOperation{

    public double a,b;
    public double result;
    
    public Division(double a, double b){
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void doOperation() {
        this.result = this.a / this.b;
    }
    
}
