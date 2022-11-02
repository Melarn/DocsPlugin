package me.melarn.docs.Commands;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.event.ClickEvent;
import net.kyori.adventure.text.format.TextColor;
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
//            player.sendMessage(Component.text("Доступные команды: ")
//                    .color(TextColor.color(153, 170, 181)));
//        player.sendMessage(Component.text("docs.projectventure.tk/o-servere/o-komandakh")
//                .color(TextColor.color(114, 137, 218))
//                .clickEvent(ClickEvent.openUrl("docs.projectventure.tk/o-servere/o-komandakh")));
//        player.sendMessage("");
//        player.sendMessage(Component.text("Также вопросы можно задавать в дс:")
//                .color(TextColor.color(153, 170, 181)));
//        player.sendMessage(Component.text("discord.gg/2Zcs3wz97V")
//                .color(TextColor.color(114, 137, 218))
//                .clickEvent(ClickEvent.openUrl("discord.gg/2Zcs3wz97V")));
        player.sendMessage("");
        player.sendMessage(ChatColor.BLUE + "Доступные команды: ");
        player.sendMessage("docs.projectventure.tk/o-servere/o-komandakh");
        player.sendMessage("");
        player.sendMessage(ChatColor.BLUE + "Также вопросы можно задавать в дс:");
//                .color(TextColor.color(153, 170, 181)));
        player.sendMessage("discord.gg/2Zcs3wz97V");
        return true;
    }
}
