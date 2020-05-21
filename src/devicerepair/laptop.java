
package devicerepair;

import java.util.ArrayList;

public class laptop extends Device implements recyclable, chargableRepair{
    
    private int priority;
    ArrayList<String> components;

    public laptop(int priority, String IdentificationCode, String MakeAndModel, String Owner, String ProblemDescription, String RepairNotes) {
        super(IdentificationCode, MakeAndModel, Owner, ProblemDescription, RepairNotes);
        this.priority = priority;
    }

    @Override
    int getPriorityRank() {
        return priority;
    }

    @Override
    public ArrayList<String> isRecyclable() {
        return components;
    }

    @Override
    public boolean isChargable() {
        return true;
    }

    
     
     
}
