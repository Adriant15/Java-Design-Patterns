/**
 * One-to-many dependency between objects. When one object changes state, all of its dependents are notified and
 * updated automatically.
 *
 * Many observer(objects) which are observing a particular subject(object).
 * - Observers register themselves to a subject and are automatically notified when subject chagnes
 * - When they lose interest in subject, they simply unregister from subject
 *
 * Loosely coupled design between objects
 * - more flexibility with change requirements
 *
 * When to use:
 *
 * - When a change to 1 object require changing others and you don't know how many objects need to be changed.
 *
 * - When multiple objects are dependent on state of one object
 *
 * - When an object should be able to notify other objects without making assumptions about who those objects are
 *
 * Example:
 *
 * - Observer objects gets data from subject and perform specific operations on data.
 *
 * - Subjects contains the data. Observers can be added or removed. Subject can trigger all observer to be notified of
 *   change in data.
 *
 * - Observers are created in client subjects add them in its list of observers.
 */

package Behavioral_Design_Observer;

public class Client {
    public static void main(String[] args) {
        // create objects for testing
        AverageScoreDisplay averageScoreDisplay =  new AverageScoreDisplay();
        CurrentScoreDisplay currentScoreDisplay =  new CurrentScoreDisplay();

        // pass the displays to cricket data
        CricketData cricketData = new CricketData();

        // register display elements
        cricketData.registerObserver(averageScoreDisplay);
        cricketData.registerObserver(currentScoreDisplay);

        // in real app you would have some logic to call this function when data changes
        cricketData.dataChanged();

        //remove an observer
        cricketData.unregisterObserver(averageScoreDisplay);

        // now only currentScoreDisplay gets the  notification
        cricketData.dataChanged();
    }
}
