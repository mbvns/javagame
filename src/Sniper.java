public class Sniper extends BaseHero{
    public Sniper(String name){
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Name: %s Type: %s", this.name, this.getClass().getSimpleName());
    }
}
