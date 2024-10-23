package lesson_3;
public class Dynasty {
    public String name;
    public int warriorAttack;
    public int archerAttack;
    public int cavalryAttack;
    public int warriorsCount;
    public int archersCount;
    public int cavalryCount;

    public Dynasty(String name, int warriorAttack, int archerAttack, int cavalryAttack, int warriorsCount) {
        this.name = name;
        this.warriorAttack = warriorAttack;
        this.archerAttack = archerAttack;
        this.cavalryAttack = cavalryAttack;
        this.warriorsCount = warriorsCount;
        this.archersCount = warriorsCount;
        this.cavalryCount = warriorsCount;
    }
    public int totalAttack() {
        return (warriorAttack * warriorsCount) +
                (archerAttack * archersCount) +
                (cavalryAttack * cavalryCount);
    }
    public static void main(String[] args) {
        Dynasty liDynasty = new Dynasty("Лі", 13, 24, 46, 860);
        int minCount = (int)(860 * 1.5);
        Dynasty minDynasty = new Dynasty("Мінь", 9, 35, 12, minCount);
        int liTotalAttack = liDynasty.totalAttack();
        int minTotalAttack = minDynasty.totalAttack();

        System.out.println("Лі: " + liTotalAttack);
        System.out.println("Мінь: " + minTotalAttack);
    }
}


