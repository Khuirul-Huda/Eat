package me.khuirulhuda.eat;

import org.bukkit.plugin.java.JavaPlugin;
import java.net.*;
import org.bukkit.event.Listener;

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