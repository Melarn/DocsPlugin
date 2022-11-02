package me.melarn.docs.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class PlasmoVoice implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player player = (Player) sender;
        player.sendMessage("");
        player.sendMessage(ChatColor.BLUE + "О том как установить и пользоватся");
        player.sendMessage("docs.projectventure.tk/plaginy/golosovoi-chat");
        player.sendMessage("");
        player.sendMessage(ChatColor.BLUE + "Также вопросы можно задавать в дс:");
//                .color(TextColor.color(153, 170, 181)));
        player.sendMessage("discord.gg/2Zcs3wz97V");
        return true;
    }
}
