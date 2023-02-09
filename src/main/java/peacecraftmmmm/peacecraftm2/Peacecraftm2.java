package peacecraftmmmm.peacecraftm2;

import org.bukkit.plugin.java.JavaPlugin;

public final class Peacecraftm2 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("my plugin has been enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("my plugin has been disabled!");
    }
}
