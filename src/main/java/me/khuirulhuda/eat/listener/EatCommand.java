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



public class EatCommand implements CommandExecutor {
  @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if ( sender instanceof Player ) {
          Player player = (Player) sender;
          Itemstack cookedChicken = new ItemStack(MATERIAL.COOKED_CHICKEN);
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
              if (isEmpty) {
                int playerFoodLevel = (int) playerInvolved.getPlayer().getFoodLevel();
                if ( playerFoodLevel < 20 ) {
                  player.getInventory().addItem(cookedChicken);
                } else {
                  sender.sendMessage("You're not hungry yet!");
                }
              } else {
                sender.sendMessage("Your Inventory is Full!");
              }
              
            } else {
              
              sender.sendMessage("You can't do that!");
              
            }
          } else {
            sender.sendMessage("You can't do that!!!");
          }
        }
    }
    return true;
}