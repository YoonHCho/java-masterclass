public class Bedroom {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.lamp = lamp;
        this.bed = bed;
        this.ceiling = ceiling;
        this.wall4 = wall4;
        this.wall3 = wall3;
        this.wall2 = wall2;
        this.wall1 = wall1;
        this.name = name;
    }

    public Lamp getLamp() {
        return this.lamp;
    }

    public void makeBed() {
        System.out.println("Bedroom -> Making bed | ");
        this.bed.make();
    }
}
