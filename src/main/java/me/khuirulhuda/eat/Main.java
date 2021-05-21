package me.khuirulhuda.eat;

import org.bukkit.plugin.java.JavaPlugin;
import java.net.*;
import org.bukkit.event.Listener;
import me.khuirulhuda.eat.bstats.Metrics;
import me.khuirulhuda.eat.listener.*;
import me.khuirulhuda.eat.events.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class Main extends JavaPlugin implements Listener {
  
  private static Main INSTANCE;
  
    @Override
    public void onEnable() {
        this.getCommand("eat").setExecutor(new EatCommand());
        Bukkit.getPluginManager().registerEvents(new FoodLevelChange(), this);
        int pluginId = 11254; //DONT TOUCH!
        Metrics metrics = new Metrics(this, pluginId);
        INSTANCE = this;
        this.getLogger().info("Eat Plugin by Khuirul-Huda Successfully Enabled");
    }
    public static Main getInstance() {
      return INSTANCE;
    }
    
    @Override
    public void onDisable() {
        this.getLogger().info("Eat Plugin RenderyCrafty Successfully Disabled");
    }
}