public class Main {
    public static void main(String[] args) {
        BaseHero monc1 = new Monc("John");
        BaseHero bandit1 = new Bandit("Dean");
        BaseHero crossbow1 = new Crossbow("Ivan");
        BaseHero sniper1 = new Sniper("Ben");
        BaseHero withcher1 = new Witcher("Tom");
        BaseHero farmer1 = new Farmer("Sam");

        System.out.println(monc1.toString());
        System.out.println(bandit1.toString());
        System.out.println(crossbow1.toString());
        System.out.println(sniper1.toString());
        System.out.println(withcher1.toString());
        System.out.println(farmer1.toString());
    }
}