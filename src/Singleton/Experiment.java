/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author aashgar
 */
public class Experiment {
    private static Experiment anExperimet=null;
    private int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
    private Experiment() {}
    public static Experiment getExperiment(){
        if(anExperimet == null)
            anExperimet = new Experiment();
    return anExperimet;
    }
    
}
