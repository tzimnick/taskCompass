public class partnerTask extends task {
    private String partnerName;

    public partnerTask(int taskID, String taskName, String userName, String taskDescription, String taskPriority, boolean taskStatus, String taskPartner) {
        super(taskID, taskName, userName, taskDescription, taskPriority, taskStatus);
        this.partnerName = taskPartner;
    }

    // Getter for partnerName
    public String getPartnerName() {
        return partnerName;
    }

    // Setter for partnerName
    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }
}
