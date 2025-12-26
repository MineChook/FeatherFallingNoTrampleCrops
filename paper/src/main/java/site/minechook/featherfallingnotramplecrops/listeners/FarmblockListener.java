package site.minechook.featherfallingnotramplecrops.listeners;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class FarmblockListener implements Listener {

    @EventHandler
    public void onJump(PlayerInteractEvent event) {
        if (!event.getAction().equals(Action.PHYSICAL)) {
            return;
        }
        if (event.getClickedBlock() == null || !event.getClickedBlock().getType().equals(Material.FARMLAND)) {
            return;
        }
        if (event.getPlayer().getInventory().getBoots() == null) {
            return;
        }
        if (event.getPlayer().getInventory().getBoots().getEnchantmentLevel(Enchantment.FEATHER_FALLING) > 0) {
            event.setCancelled(true);
        }
    }
}
