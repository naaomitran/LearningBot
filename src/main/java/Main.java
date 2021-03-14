import Events.CategoryCreate;
import Events.HelloEvent;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Main {
    public static void main(String[] args) throws Exception {

        JDA jda = JDABuilder.createDefault("ODIwMzM2NDE2NjIwODA2MTU0.YEzr0g.IJ7SKS5QxkJaOh1p8oajZtT8QjU").build();

        jda.addEventListener(new HelloEvent());

        jda.addEventListener(new CategoryCreate());
    }
}
