package me.khuirulhuda.eat.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.ChatColor;

public class FoodLevelChange implements Listener {
  @EventHandler
  public void onFoodChange(FoodLevelChangeEvent e) {
    Player p = (Player) e.getEntity();
    String playername = p.getName();
    if ( p instanceof Player ) {
      if ( p.getFoodLevel() < 10 ) {
        String msg = playername.concat(" i see you're hungry, please eat some food or type /eat for free food");
        p.sendMessage(ChatColor.GREEN + msg);
      }
    }
  }
  
}