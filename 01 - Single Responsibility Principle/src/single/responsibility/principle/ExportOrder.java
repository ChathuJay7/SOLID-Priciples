
package single.responsibility.principle;

public class ExportOrder {
    
    void exportOrderCSV(){
        System.out.println("Export the sales order in CSV format");
    }
    
    void exportOrderXML(){
        System.out.println("Export the sales order in XML format");
    }
    
}
