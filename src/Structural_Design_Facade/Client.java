/**
 * Provides unified interface to a set of interfaces in the system
 * - defines higher-level interface and hide complexities of sub-system interfaces
 * - does not provide additional functionality
 *
 * Facade and sub-system interfaces are complete decoupled
 *
 * When to use:
 *
 * - When number of interfaces grow and system gets complex
 *
 * - Use facade to define entry point to each sub-system level
 *
 * Facade vs. Adapter vs. Decorator:
 *
 * - When you need to use an existing class and its interface is not the one you need, use
 *   an adapter. Changes an interface into one client expects.
 *
 * - When you need to simplify and unify large interface or complex set of interfaces, use
 *   a facade. Decouple clients from complex sub-system.
 *
 * - Adapter wraps object to change its interface
 * - Decorator wraps an object to add new behaviors and responsibilities
 * - Facade warps a set of objects to simplify, no new behaviors or responsibilities
 *
 * Example:
 *
 * - Without the facade (HotelKeeper), an instance of specific hotel object needs to created before a menu class can be
 *   called.
 *
 * - With the facade, the client can get all the menu and the hotel objects are hidden before the facade, simplifying the
 *   process.
 *
 */

package Structural_Design_Facade;

public class Client {
    public static void main(String[] args){
        HotelKeeper keeper = new HotelKeeper();

        VegMenu v = keeper.getVegMenu();
        NonVegMenu nv = keeper.getNonVegMenu();
        Both b = keeper.getVegNonMenu();


    }
}
