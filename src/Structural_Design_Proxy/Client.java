/**
 * Provide placeholder for another object to control access
 * -used when we want to provide controlled access of a functionality
 *
 * There are situations in which client does not or can not reference an object directly, but still want
 * interact with the object
 *
 * When to use:
 *
 * - Provide security. Remote proxies ensure a more secure application by install a local code proxy in the
 *   client machine and then access the server with help of remote code.
 *
 * Example:
 *
 * - ProxyInternet class has an instance of object that implements Internet interface and keeps a list of banned
 *   websites in array list.
 *
 * - ProxyInternet implements Internet interface and denies access to any webiste in the banned list by throwing exception.
 *
 */

package Structural_Design_Proxy;

public class Client {
    public static void main(String[] args){
        Internet internet = new ProxyInternet();

        try{
            internet.connectTo("safe.net");
            internet.connectTo("whatever.com");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
