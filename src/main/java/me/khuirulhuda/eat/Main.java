package me.khuirulhuda.eat;

import org.bukkit.plugin.java.JavaPlugin;
import java.net.*;
import org.bukkit.event.Listener;
import me.khuirulhuda.eat.org.bstats.*;
import me.khuirulhuda.eat.listener.*;



public class Main extends JavaPlugin implements Listener {
  
  private static Main INSTANCE;
  
    @Override
    public void onEnable() {
        this.getCommand("eat").setExecutor(new EatCommand());
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