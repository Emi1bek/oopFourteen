public class Programmer extends Person{
    public String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public Programmer(String companyName) {
        this.companyName = companyName;
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
    public void coding(){
        System.out.println("Этот человек codit"+getName());
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Singer: " +getName()+ ", companyName: " + companyName +" designation: "+getDesignation();
    }
}
