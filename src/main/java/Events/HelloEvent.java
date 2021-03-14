package Events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class HelloEvent extends ListenerAdapter {

    //guild is discord server
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] msgSent = event.getMessage().getContentRaw().split(" ");
        String name = event.getMember().getUser().getName();

        for (int i=0; i<msgSent.length; i++) {
            if (msgSent[i].equalsIgnoreCase("oatmeal")) {
                event.getChannel().sendMessage("follow @creamricecooks for more bomb oat recipes").queue(); //add .queue for all events
            }
        }
        if (msgSent[4].equalsIgnoreCase("dentist")) {
            event.getChannel().sendMessage("happy that you're getting your teeth cleaned after all that " +
                    "coffee you consume on the daily").queue(); //add .queue for all events
        }

        if (msgSent[0].equalsIgnoreCase("hello")) {
            event.getChannel().sendMessage("hey bitch").queue(); //add .queue for all events
        }

        if (msgSent[0].equalsIgnoreCase("hi")) {
            if (!event.getMember().getUser().isBot()) {
                event.getChannel().sendMessage("hi " + name).queue(); //add .queue for all events
            }
        }

        if (msgSent[0].equalsIgnoreCase("how") && msgSent[1].equalsIgnoreCase("are") &&
                msgSent[2].equalsIgnoreCase("you") ) {
            event.getChannel().sendMessage("please stop talking to me").queue(); //add .queue for all events
        }

        if (msgSent[4].equalsIgnoreCase("dentist")) {
            event.getChannel().sendMessage("happy that you're getting your teeth cleaned after all that " +
                    "coffee you consume on the daily").queue(); //add .queue for all events
        }





    }
}
