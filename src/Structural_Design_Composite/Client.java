/**
 * Composes objects into tree structures to represent part-whole hierarchies
 * - lets clients treat individual objects and compositions of objects uniformly
 *
 * An object designed as a composite of one-or-more similar objects that all exhibits similar functionality
 * - group of objects that is treated same way as a single instance of same type of object
 *
 * Easier to add new kinds of components
 *
 * When to use:
 *
 * - When we have too many objects with common functionality we create a composite object. A class that contains its
 *   own group of objects
 *
 * - When clients need to ignore difference between compositions of objects and individual objects
 *
 * Example:
 *
 * - Build a hierarchy tree starting with technology dean as the root, chairs are the first layer of nodes and
 *   professors as the leaf nodes.
 *
 * - Although the technology dean is higher than the chairs, they have similar functionalities.
 *
 * - Usage of the technology dean class is the same as that of chairs.
 *
 */

package Structural_Design_Composite;

import java.util.List;

public class Client {
    public static void main(String[] args){
        Supervisor techDean = new Supervisor("Dr. Mike", "Dean of Technology");
        Supervisor chairMath = new Supervisor("Dr. John", "Chair of Math");
        Supervisor chairCS = new Supervisor("Dr. Ian","Chair of Computer Science" );

        Professor mathProf1 = new Professor("Math Professor1", "Adjunct", 302);
        Professor mathProf2 = new Professor("Math Professor2", "Associate", 303);

        Professor cseProf1 = new Professor("CSE Professor1", "Adjunct", 507);
        Professor cseProf2 = new Professor("CSE Professor2", "Professor", 507);
        Professor cseProf3 = new Professor("CSE Professor3", "Professor", 507);

        techDean.add(chairCS);
        techDean.add(chairMath);

        chairMath.add(mathProf1);
        chairMath.add(mathProf2);

        chairCS.add(cseProf1);
        chairCS.add(cseProf2);
        chairCS.add(cseProf3);

        System.out.println("*****COMPOSITE PATTERN DEMO*****");
        System.out.println("\nThe College has the following structure\n");

        System.out.println(techDean.getDetails());

        List<Faculty> chairs = techDean.getMyFacultyList();
        for(Faculty chair : chairs)
            System.out.println("\t" + chair.getDetails());  //put one tab

        List<Faculty> mathProfessors = chairMath.getMyFacultyList();
        for(Faculty professor : mathProfessors)
            System.out.println("\t\t" + professor.getDetails());  //put one tab

        List<Faculty> csProfessors = chairCS.getMyFacultyList();
        for(Faculty professor : csProfessors)
            System.out.println("\t\t" + professor.getDetails());  //put one tab

        chairCS.remove(cseProf2);

        System.out.println("\nAfter CS Professor2 left, CS Department is now: \n");

        csProfessors = chairCS.getMyFacultyList();
        for(Faculty professor : csProfessors)
            System.out.println(professor.getDetails());  //put one tab

    }
}
