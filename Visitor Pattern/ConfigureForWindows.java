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
class ConfigureForWindows implements RouterVisitor{

    @Override
    public void visit(DLInkRouter router) {
        System.out.println("DLInkRouter router has been configured on Windows");
    }

    @Override
    public void visit(TPLInkRouter router) {
        System.out.println("TPLInkRouter router has been configured on Windows");
    }

    @Override
    public void visit(LinkSysRouter router) {
        System.out.println("LInkSysRouter router has been configured on Windows");
    }
    
}
