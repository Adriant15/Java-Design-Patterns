/**
 *
 * Singleton Implementation (Bill Pugh Approach)
 *
 * Create a single and only a single instance of an object
 *
 * Benefits of this approach:
 *
 * - Avoid instantiation until/unless client calls the getInstance method
 * - Thread safe
 *
 * Example:
 *
 * - When call the get_captain method in MakeACaptain class, it will call the private inner class which will create an
 *   instance of MakeACaptain class. The instance of MakeACaptain class that is final.
 *
 */

package Creational_Design_Patterns_Singleton;

class MakeACaptain {

    //private constructor ensures no clients can actually create an instance of this object directly using new.
    private MakeACaptain() {}

    private static class SingletonHelper{
        //nested class is referenced after getCaptain() is called
        private static final MakeACaptain _captain = new MakeACaptain();
    }

    public static MakeACaptain get_captain() {
        return SingletonHelper._captain;
    }

    public static void main (String[] args){
        System.out.println("***Singleton Pattern Demo");
        System.out.println("Trying to make a captain for our team");

        MakeACaptain c1 = MakeACaptain.get_captain();

        System.out.println("Trying to make another captain for our team");

        MakeACaptain c2 = MakeACaptain.get_captain();

        //use "==" to compare references, not content
        if(c1 == c2)
            System.out.println("c1 and c2 are the same");
    }
}


