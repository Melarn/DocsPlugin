//package me.melarn.docs.Commands;
//
//import com.destroystokyo.paper.Title;
//import org.bukkit.ChatColor;
//import org.bukkit.Location;
//import org.bukkit.Sound;
//import org.bukkit.WeatherType;
//import org.bukkit.command.Command;
//import org.bukkit.command.CommandExecutor;
//import org.bukkit.command.CommandSender;
//import org.bukkit.entity.Player;
//import org.bukkit.potion.PotionEffect;
//import org.bukkit.potion.PotionEffectType;
//import org.jetbrains.annotations.NotNull;
//
//public class DonateCommand implements CommandExecutor {
//    @Override
//    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
//        if (!(sender instanceof Player player)){
//            sender.sendMessage("Did wtf");
//            return true;
//        }else
//            player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 40, 3), true);
//            player.sendTitle(new Title(player.getDisplayName() + ChatColor.RED + " you are dead"));
//            player.playSound(player, Sound.ITEM_GOAT_HORN_SOUND_1, 50, -50);
//            player.setPlayerWeather(WeatherType.CLEAR);
//            player.teleport(new Location(player.getWorld(), 429, 140, 75));
//            return true;
//    }
//}
