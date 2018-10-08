/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author aashgar
 */
public class FactoryApp {
    public static void main(String[] args) {
        Student it1 = FactoryDp.getStudent("IT");
        it1.view();
        Student it2 = FactoryDp.getStudent("IT");
        it2.view();
        Student eng = FactoryDp.getStudent("eng");
        eng.view();
        Student art = FactoryDp.getStudent("Art");
        art.view();
    }
}
