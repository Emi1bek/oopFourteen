public class Singer extends Person{
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public Singer(String bandName) {
        this.bandName = bandName;
    }

    public Singer() {
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
    public void singer(){
        System.out.println("Этот человек "+getName()+" поет!");
    }
    public void playKomuz(){
        System.out.println("По имени  "+getName()+" играет на комузе! ");
    }

    @Override
    public String toString() {
        return "Singer: " +getName()+ " bandName " + bandName +" designation: "+getDesignation();
    }
}
