package me.melarn.docs;

//import me.melarn.docs.Commands.DonateCommand;
import me.melarn.docs.Commands.HelpCommand;
import me.melarn.docs.Listeners.onBlockBreak;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Docs extends JavaPlugin implements Listener {

    public static Plugin instance;


    @Override
    public void onEnable() {

        instance = this;

        getServer().getPluginManager().registerEvents(new onBlockBreak(), this);
        getLogger().info("The plugin has started");
        getCommand("help").setExecutor(new HelpCommand());
//        getCommand("donate").setExecutor(new DonateCommand());


    }

    public static Plugin getInstance() {
        return instance;
    }
}