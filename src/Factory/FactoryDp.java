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
public class FactoryDp {
    public static Student getStudent(String type){
        if(type.equalsIgnoreCase("it"))
            return new ItStudent();
        else if(type.equalsIgnoreCase("eng"))
            return new EngStudent();
        else if(type.equalsIgnoreCase("art"))
            return new ArtStudent();
        else
            return new ItStudent();
    }
    
}
