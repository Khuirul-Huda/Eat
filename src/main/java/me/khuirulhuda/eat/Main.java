package me.khuirulhuda.eat;

import org.bukkit.plugin.java.JavaPlugin;
import java.awt.color;

/**
 * Hello world!
 *
 */
public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Plugin Enabled");
    }
    @Override
    public void onDisable() {
        getLogger().info("Plugin disabled");
    }
}