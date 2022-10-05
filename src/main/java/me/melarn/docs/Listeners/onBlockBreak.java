package me.melarn.docs.Listeners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.data.Ageable;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class onBlockBreak implements Listener {

    @EventHandler
    public void breakEvent(BlockBreakEvent event) {
        Block block = event.getBlock();
        Player player = event.getPlayer();

        Material cropBlockType = null;

        if (block.getType() == Material.WHEAT) {
            cropBlockType = Material.WHEAT;
        }

        if (cropBlockType != null && isFullyGrown(block)){
//            Material seedType =
        }
    }

    public Material getSeedMaterial(Material cropBlockType){
        if (cropBlockType == Material.WHEAT){
            return Material.WHEAT_SEEDS;
        }
        return null;
    }

    public boolean isFullyGrown(Block block) {
        Ageable ageable = (Ageable) block.getBlockData();
        int maximumAge = ageable.getMaximumAge();

        return ageable.getAge() == maximumAge;
    }
}
