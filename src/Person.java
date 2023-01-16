public class Person {
    private String name;
    private String designation;



    public void learn(){
        System.out.println(" этот человек учится! "+name);

    }
    public void walk(){
        System.out.println(" этот человек работает! "+name);

    }
    public void eating(){
        System.out.println(" этот человек есть! "+name);

    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public Person() {
    }

    public String toString(){
        return "name: " + name +" designation: "+designation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

}
