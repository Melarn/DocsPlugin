package me.melarn.docs.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class DocsCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player player)) {
            sender.sendMessage("You are not player");
            return true;
        } else
            player.sendMessage(ChatColor.BLUE + "Доступные команды - " + ChatColor.RESET + "docs.projectventure.tk/o-servere/o-komandakh");
        return true;
    }
}
