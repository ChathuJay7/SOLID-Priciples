
package single.responsibility.principle;

public class Main {

    public static void main(String[] args) {
        
        SalesOrder salesOrder = new SalesOrder();
        salesOrder.salesOrder();
        
        System.out.println();
        
        SaveOrder saveOrder = new SaveOrder();
        saveOrder.saveOrder();
        
        System.out.println();
        
        ExportOrder exportOrder = new ExportOrder();
        exportOrder.exportOrderCSV();
        exportOrder.exportOrderXML();
        
    }
    
}
