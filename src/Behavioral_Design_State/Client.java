/**
 * allows an object to alter it behavior when its internal state chagnes
 * - object will appear to change its class
 * - object's behavior is the result of the function of its state
 *
 * We can remove dependencies on if/else or switch/case conditional logic to chagne internal state
 *
 * When to use:
 *
 * - when object's behavior depends on its state and it must change its behavior at runtime depending on state
 *
 * - when operations have large, multipart conditional statement that depends on object's state
 *
 * Drawback:
 *
 * - pattern does increase number of objects (one for each state)
 *
 * Example:
 *
 * - AlertStateContext object can set instance of MobileAlertState as its state.
 *
 * - The alert() method of the current MobileAlertState object inside AlertStateContext will be invoked when
 *   AlertStateContext's alert() method is called.
 */

package Behavioral_Design_State;

public class Client {
    public static void main(String[] args) {
        AlertStateContext stateContext = new AlertStateContext();

        stateContext.alert();
        stateContext.alert();

        stateContext.setState(new Silent());

        stateContext.alert();
        stateContext.alert();
        stateContext.alert();
    }
}
