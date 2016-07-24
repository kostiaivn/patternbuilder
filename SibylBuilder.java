package PatternBuilder;

/**
 * Created by Танк on 28.05.2016.
 */
public class SibylBuilder {

    private String name;
    private int aggression;
    private int motivation;
    private int power;
    private int depression;

    public static class Builder {
        private String name;
        private int aggression;
        private int motivation;
        private int power;
        private int depression;

        public Builder(String name) {
            this.name = name;
        }

        public Builder aggression(int value) {
            this.aggression = value;
            return this;
        }

        public Builder motivation(int value) {
            this.motivation = value;
            return this;
        }

        public Builder power(int value) {
            this.power = value;
            return this;
        }

        public Builder depression(int value) {
            this.depression = value;
            return this;
        }

        public SibylBuilder build() {
            return new SibylBuilder(this);
        }
    }

    private SibylBuilder(Builder builder) {
        this.name = builder.name;
        this.aggression = builder.aggression;
        this.depression = builder.depression;
        this.motivation = builder.motivation;
        this.power = builder.power;
    }

    public void Print() {
        System.out.format("%s (%d/%d/%d/%d)", name, aggression, motivation, power, depression);
        System.out.println();
    }

    public int sibylAction() {
        int sibylAction = motivation + aggression;
        if (sibylAction > 15)
            return (sibylAction);
        else {
            return 0;
        }
    }

    public int sibylDanger() {
        int sibylDanger = power + depression;
        if (sibylDanger > 15)
            return sibylDanger;
        else {
            return 0;
        }
    }

    public void Dominator() {
        if (sibylDanger() + sibylAction() > 30)
            System.out.println("Fire!");
        else
            System.out.println("Disable.");
    }
}


