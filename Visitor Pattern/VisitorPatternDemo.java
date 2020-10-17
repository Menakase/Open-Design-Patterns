/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitorpattern;

/**
 *
 * @author NanoX
 */
public class VisitorPatternDemo {

    /**
     * @param args the command line arguments
     */
    
    private static DLInkRouter dLinkRouter;
    private static TPLInkRouter tpLInkRouter;
    private static LinkSysRouter linkSysRouter;
    
    private static ConfigureForWindows configureForWindows;
    private static ConfigureForLinux configureForLinux;
    
    public static void init(){
        dLinkRouter = new DLInkRouter();
        tpLInkRouter = new TPLInkRouter();
        linkSysRouter = new LinkSysRouter();
        
        configureForWindows = new ConfigureForWindows();
        configureForLinux = new ConfigureForLinux();
    }
    
    public static void main(String[] args) {
        
       init();
       
       //DLInkRouter
       dLinkRouter.accept(configureForLinux);
       dLinkRouter.accept(configureForWindows);
       
       //TPLInkRouter
       tpLInkRouter.accept(configureForLinux);
       tpLInkRouter.accept(configureForWindows);
       
       //LinkSysRouter
       linkSysRouter.accept(configureForLinux);
       linkSysRouter.accept(configureForWindows);
    }
    
}
