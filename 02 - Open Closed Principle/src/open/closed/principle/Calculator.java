
package open.closed.principle;

public class Calculator {
    
    public void calculate(IOperation operation){
        operation.doOperation();
    }
    
}
