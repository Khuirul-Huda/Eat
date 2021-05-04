package me.khuirulhuda.eat.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.CommandExecutor;
import org.bukkit.inventory.ItemStack;
import java.lang.Exception;
import java.lang.String;
import org.bukkit.Server;
import java.util.logging.Logger;
import org.bukkit.inventory.InventoryView;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.Action;
import me.khuirulhuda.eat.Main;
import org.bukkit.inventory.Inventory;
/**
 * i doesn't have a pc so there's many missing import because i'm not using real ide
 * */

public class EatCommand implements CommandExecutor, Listener {
  
  @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if ( sender instanceof Player ) {
          Player player = (Player) sender;
          ItemStack cookedChicken = new ItemStack(Material.COOKED_CHICKEN);
          cookedChicken.setAmount(5);
          
          if (!(player.getItemInHand().getType() == Material.COOKED_CHICKEN)) {
            if (!(player.getInventory().contains(Material.COOKED_CHICKEN))) {
              
                int playerFoodLevel = (int) player.getFoodLevel();
                if ( playerFoodLevel < 10 ) {
                  
                  try {
                    player.getInventory().addItem(cookedChicken);
                    sender.sendMessage("Successfully added Cooked Chicken");
                    
                  } catch(Exception e) {
                    Main.getInstance().getLogger().warning(e.toString());
                    sender.sendMessage("An Error Occured, Your Inventory is full?");
                  }
                  
                  
                } else {
                  sender.sendMessage("You're not hungry yet!");
                  Main.getInstance().getLogger().warning("not hungry yet");
                }
              
              
            } else {
              
              sender.sendMessage("you already have cooked chicken in your inventory");
              
              Main.getInstance().getLogger().warning("already have a food");
            }
          } else {
            sender.sendMessage("See your hand!");
            Main.getInstance().getLogger().warning("Already have a food (hand)");
          }
        }
        return true;
    }
    
}