package peacecraftmmmm.peacecraftm2;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public final class Peacecraftm2 extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("thomas's plugin is now turning on hello world");
        getServer().getPluginManager().registerEvents(this,this);
    }

    @Override
    public void onDisable() {
        System.out.println("thomas's plugin is now turning off goodbye");
    }
    @EventHandler
    public void joinMessage(PlayerJoinEvent event) {

        if (event.getPlayer().toString() == "Itsbobthebuilder") {
            getServer().getOnlinePlayers().forEach(player -> player.sendMessage(event.getPlayer().getName() + " our god, has joined the game."));
            // i will make this up here ^ colored with ansi escape codes soon
            Scoreboard scoreboard = bukkit.getScoreboardManager().getNewScoreboard();
            Objective objective = scoreboard.registerNewObjective("new","dummy",5);
            objective.setDisplaySlot(DisplaySlot.SIDEBAR);
            for (Player player : bukkit.getOnlinePlayers()) {
                player.setScoreBoard(scoreboard);
                Score score = objective.getScore(player.getName());
                score.setScore(1);
            }
        } else {
            getServer().getOnlinePlayers().forEach(player -> player.sendMessage(event.getPlayer().getName() + " has joined the game."));
        }
    }
}
