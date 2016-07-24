package PatternBuilder;

public class ChastenerBuilder {
    public static void main(String[] args) {
        SibylBuilder.Builder builder = new SibylBuilder.Builder("Meddius");
        builder.aggression(5);
        builder.depression(6);
        builder.motivation(0);
        builder.power(2);
        SibylBuilder personOne = builder.build();
        personOne.Print();
        personOne.Dominator();

        SibylBuilder personTwo = new SibylBuilder.Builder("Mhedozh").aggression(4).depression(3).motivation(2).power(5).build();
        personTwo.Print();
        personTwo.Dominator();
    }

}
