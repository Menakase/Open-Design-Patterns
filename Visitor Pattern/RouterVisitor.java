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
interface RouterVisitor {
    public void visit(DLInkRouter router);
    public void visit(TPLInkRouter router);
    public void visit(LinkSysRouter router);
}
