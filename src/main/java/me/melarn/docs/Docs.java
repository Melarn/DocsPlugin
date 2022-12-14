package me.melarn.docs;

//import me.melarn.docs.Commands.DonateCommand;

import me.melarn.docs.Commands.DocsCommand;
import me.melarn.docs.Commands.HelpCommand;
import me.melarn.docs.Commands.PlasmoVoice;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Docs extends JavaPlugin implements Listener {

    public static Plugin instance;


    @Override
    public void onEnable() {

        instance = this;

        getLogger().info("The plugin has started");
        getCommand("docs").setExecutor(new DocsCommand());
        getCommand("help").setExecutor(new HelpCommand());
        getCommand("voice").setExecutor(new PlasmoVoice());
    }
}