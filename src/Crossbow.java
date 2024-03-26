public class Crossbow extends BaseHero{
    public Crossbow(String name){
        super(name);
    }
    @Override
    public String toString() {
        return String.format("Name: %s Type: %s", this.name, this.getClass().getSimpleName());
    }
}
