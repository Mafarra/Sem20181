/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author aashgar
 */
public class AbstractFactoryApp {
    public static void main(String[] args) {
        Course aCourse = Course.getCourse();
        aCourse.setDeree(new BscDegree());
        aCourse.viewCourse("Software Design",
                "This course provides the students ...");
        aCourse.setDeree(new MscDegree());
        aCourse.viewCourse("Software Design",
                "This course provides the students ...");
    }
}
