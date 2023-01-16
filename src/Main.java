public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Jone Weik", "bachelor","Peaksoft");
        Dancer dancer =new Dancer("Jack","specialist","pop2");
        Singer singer = new Singer("Mirbek","master","-");


        programmer.eating();
        programmer.walk();
        programmer.learn();
        programmer.coding();
        System.out.print(programmer);


        dancer.eating();
        dancer.walk();
        dancer.learn();
        dancer.dancing();
        System.out.println(dancer);

        singer.eating();
        singer.walk();
        singer.learn();
        singer.playKomuz();
        singer.singer();
        System.out.println(singer);

    }
}