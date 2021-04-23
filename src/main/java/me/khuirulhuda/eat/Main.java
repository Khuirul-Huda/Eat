package me.khuirulhuda.eat;

import org.bukkit.plugin.java.JavaPlugin;
import java.net.*;
import org.bukkit.event.Listener;
import me.khuirulhuda.eat.listener.*;



public class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        this.getCommand("eat").setExecutor(new EatCommand());
    }
    @Override
    public void onDisable() {
        //nothing to do
    }
}