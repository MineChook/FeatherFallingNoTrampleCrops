package site.minechook.featherfallingnotramplecrops;

import org.bukkit.plugin.java.JavaPlugin;
import site.minechook.featherfallingnotramplecrops.listeners.FarmblockListener;

public class FeatherFallingNoTrampleCrops extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new FarmblockListener(), this);
    }
}