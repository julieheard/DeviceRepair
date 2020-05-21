package devicerepair;
//Abstract class: a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
abstract class Device {

    protected String IdentificationCode;
    protected String MakeAndModel;
    protected String Owner;
    protected String ProblemDescription;
    protected String RepairNotes;

    public Device(String IdentificationCode, String MakeAndModel, String Owner, String ProblemDescription, String RepairNotes) {
        this.IdentificationCode = IdentificationCode;
        this.MakeAndModel = MakeAndModel;
        this.Owner = Owner;
        this.ProblemDescription = ProblemDescription;
        this.RepairNotes = RepairNotes;
    }

    //abstract method
    //    - Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
    //    - A public abstract method will be accessible in the other packages where as the protected abstract method can not be
    abstract int getPriorityRank();
    
    public String getIdentificationCode() {
        return IdentificationCode;
    }

    public String getMakeAndModel() {
        return MakeAndModel;
    }

    public String getOwner() {
        return Owner;
    }

    public String getProblemDescription() {
        return ProblemDescription;
    }

    public String getRepairNotes() {
        return RepairNotes;
    }

    public void setIdentificationCode(String IdentificationCode) {
        this.IdentificationCode = IdentificationCode;
    }

    public void setMakeAndModel(String MakeAndModel) {
        this.MakeAndModel = MakeAndModel;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public void setProblemDescription(String ProblemDescription) {
        this.ProblemDescription = ProblemDescription;
    }

    public void setRepairNotes(String RepairNotes) {
        this.RepairNotes = RepairNotes;
    }
    
    
    
    
}
