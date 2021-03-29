/**
 * Uses sharing to support large number of fine-grained objects efficiently
 *
 * Primarily used to reduce number of objects created
 * - less memory use and higher performance
 *
 * Tries to reuse existing similar kind of objects by storing them
 * - one instance of class can be used to provide many "virtual instances"
 * - creates a new object when no matching object is found
 *
 * Flyweight objects are shared and immutable
 *
 * Intrinsic vs extrinsic state:
 *
 * - intrinsic state/properties - can be stored in flyweights object and shareable
 * - extrinsic state/properties - depends on flyweight's context and not shareable, client objects
 *   define state and pass extrinsic state to flyweight.
 *
 * When to use:
 *
 * - When application uses large number of objects, storage cost is high
 *
 * - When many groups of objects may be replaced when extrinsic state is removed
 *
 * - When application does not depend on object identity
 *
 * Example:
 *
 * - PlayerFactory creates and hold common objects hash table of and returns specific player type from hash table given
 *   String input.
 *
 * - Each "virtual instance" object is has its own specific intrinsic attributes given.
 *
 */

package Structural_Design_Flyweight;

import java.util.Random;

public class Client {

    private static String[] playerType = {"Terrorist", "CounterTerrorist"};

    private static String[] weapons = {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};

    public static String getRandPlayerType(){
        Random r = new Random();
        int randInt = r.nextInt(playerType.length);
        return playerType[randInt];
    }

    public static String getRandWeapon(){
        Random r = new Random();
        int randInt = r.nextInt(weapons.length);
        return weapons[randInt];
    }

    public static void main(String[] args){
        for(int i = 0 ; i < 10 ; ++i){
            Player p = PlayerFactory.getPlayer(getRandPlayerType());
            p.assignWeapon(getRandWeapon());
            p.mission();
        }
    }
}
