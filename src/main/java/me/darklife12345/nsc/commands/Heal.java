package me.darklife12345.nsc.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Heal implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player)) {
            switch (args.length) {
                case 0:
                    sender.sendMessage(colorize("&a&lNSC &b&o: &4You need to specify a player"));
                    break;
                case 1:
            }
        } else {

        }

        return false;
    }
    public @NotNull String colorize(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }
}
