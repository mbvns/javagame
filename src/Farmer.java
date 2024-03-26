public class Farmer extends BaseHero{
    public Farmer(String name) {
        super(name);
    }

    //    public Farmer(String name){
//        super();
//    }
    @Override
    public String toString() {
        return String.format("Name: %s Type: %s", this.name, this.getClass().getSimpleName());
    }
}
