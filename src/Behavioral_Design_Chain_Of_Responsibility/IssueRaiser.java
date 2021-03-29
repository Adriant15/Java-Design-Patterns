package Behavioral_Design_Chain_Of_Responsibility;

public class IssueRaiser {
    public ReceiverInterface setFirstReceiver;

    public IssueRaiser(ReceiverInterface FirstReceiver){
        this.setFirstReceiver = FirstReceiver;
    }

    public void raiseMessage(Message msg){
        if(setFirstReceiver != null)
            setFirstReceiver.processMessage(msg);
    }
}
