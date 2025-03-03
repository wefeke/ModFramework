package wefeke.cooleServerMods.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import wefeke.cooleServerMods.CooleServerMods;


public class HungerToggleCommand implements CommandExecutor {

    private final CooleServerMods plugin;

    public HungerToggleCommand(CooleServerMods plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player player) {

            //Set if player is hungry or not on main class
            if (plugin.isPlayerHungry(player)){
                plugin.addPlayerNotHungry(player);
                player.sendMessage("Du hast keinen Hunger mehr!");
            }
            else {
                plugin.removePlayerNotHungry(player);
                player.sendMessage("Du hast wieder Hunger!");
            }
        }

        return true;
    }
}
