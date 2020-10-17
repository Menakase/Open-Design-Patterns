/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorypattern;

/**
 *
 * @author NanoX
 */
public class AbstractFactoryPatternDemo {

    /**
     * @param args the command line arguments
     */
    
    private static CellPhone configureDevice(String manufacture){
        CellPhone phone = null;
        CellPhoneFactory factory;
        
        if(manufacture.equals("A")){
            factory = new Manufacturer_A();
            phone = new CellPhone(factory);
        }
        
        return phone;
    }
    
    private static void SetModelAndPrice(CellPhone phone,String modelName, double productPsrice){
        System.out.println(phone.getClass());
    }
    
    public static void main(String[] args) {
        
       CellPhone cellPhone = configureDevice("A");
        SetModelAndPrice(cellPhone, "d", 0);
    }
    
}
