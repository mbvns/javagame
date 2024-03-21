import java.util.ArrayList;

public abstract class BaseHero {
    protected int level, maxHp, hp, maxMana, mana, strength, agility, stamina, intellect, speed, attack;
    protected String name;
    protected State state;
    // Защита от создания персонажей с однинаковым именем
    private static int defaultIndex;
    private static ArrayList<String> names;
    static {
        defaultIndex = 0;
        names = new ArrayList<String>();
    }

    enum State {
        Alive, Dead
    }

    /**
     * Создание героя, уровень опыта 0
     *
     * @param maxHp     max здоровье, по умолчанию 20
     * @param hp        здоровье, по умолчанию 20
     * @param maxMana   max мана, по умолчанию 10
     * @param mana      мана, по умолчанию 10
     * @param strength  сила, по умолчанию 15
     * @param agility   ловкость, по умолчанию 9
     * @param intellect интеллект, по умолчанию 7
     * @param speed     скорость, по умолчанию 5
     * @param name      имя, по умолчанию "Hero"
     */
    public BaseHero(int maxHp, int hp, int maxMana, int mana, int strength, int agility, int intellect, int speed, String name) {
        this.level = 0;
        this.hp = hp;
        this.maxHp = maxHp;
        this.mana = mana;
        this.strength = strength;
        this.agility = agility;
        this.intellect = intellect;
        this.speed = speed;
        this.attack = attack;
        this.name = name;
        this.state = State.Alive;
    }

    public BaseHero(String name){
        this(20, 20, 10, 10, 15, 9, 7, 5, name);
    }

//    public BaseHero(String name ){
//        this();
//        if((name.isEmpty() || Character.isDigit(name.charAt(0)) || BaseHero.names.indexOf(name) != -1)){
//            this.name = String.format("Hero_%d", defaultIndex ++);
//        } else {
//            this.name = name;
//        }
//    }

    public void getDamage(int damage){
        if(this.hp - damage > 0){
            this.hp -= damage;
        } else {
            this.hp = 0;
            this.state = State.Dead;
        }
    }

    private boolean isAlive(){
        return this.state == State.Alive;
    }

    public void attack(BaseHero target){
        int damage = this.attack;
        target.getDamage(damage);
    }

    public void heal(BaseHero target, int heal){
        if(target.hp < target.maxHp){
            target.hp += heal;
        }
        if(target.hp > target.maxHp){
            target.hp = target.maxHp;
        }
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
