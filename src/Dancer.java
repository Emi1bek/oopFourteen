public class Dancer extends Person {
    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public Dancer(String groupName) {
        this.groupName = groupName;
    }
    public void learn(){
        super.learn();
    }
    public void walk(){
        super.walk();
    }
    public void eating(){
        super.eating();
    }
    public void dancing(){
        System.out.println("Этот человек "+getName());
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
         return "Singer: " +getName()+ " groupName " + groupName +" designation: "+getDesignation();
    }
}
