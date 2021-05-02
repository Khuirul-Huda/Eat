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
import org.bukkit.inventory.InventoryView;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.Action;
import org.bukkit.inventory.Inventory;



/**
 * i doesn't have a pc so there's many missing import because i'm not using real ide
 * */


public class EatCommand implements CommandExecutor {
  @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if ( sender instanceof Player ) {
          Player player = (Player) sender;
          ItemStack cookedChicken = new ItemStack(Material.COOKED_CHICKEN);
          cookedChicken.setAmount(5);
          
          
          
          if (!(player.getItemInHand().getType() == Material.COOKED_CHICKEN)) {
            if (!(player.getInventory().contains(Material.COOKED_CHICKEN))) {
              
              boolean isEmpty = true;
              for (ItemStack item : player.getInventory().getContents()) {
                if ( item != null) {
                  isEmpty = false;
                  break;
                }
              }
              
                int playerFoodLevel = (int) player.getFoodLevel();
                if ( playerFoodLevel < 40 ) {
                  
                  try {
                    player.getInventory().addItem(cookedChicken);
                    
                    Bukkit.broadcastMessage(player.getName(), "got free food from /eat");
                    
                  } catch(Exception e) {
                    Bukkit.getLogger().warning(e.toString());
                    sender.sendMessage("An Error Occured, Your Inventory is full?");
                  }
                  
                  
                } else {
                  sender.sendMessage("You're not hungry yet!");
                  Bukkit.getLogger().warning(player.getName(), "not hungry yet");
                }
              
              
            } else {
              
              sender.sendMessage("you already have cooked chicken in your inventory");
              Bukkit.getLogger().warning(player.getName(), "already have a cooked chicken");
            }
          } else {
            sender.sendMessage("See your hand!");
            Bukkit.getLogger().warning(player.getName(), "Already have a food (hand)");
          }
        }
        return true;
    }
    
}