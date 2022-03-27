package me.inefficacy.nobedbombing.commands;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Command implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("nobedbombing")) {
			sender.sendMessage("Developer - Inefficacy#4299");
			sender.sendMessage("https://github.com/Inefficacy/NoBedBombing");
			return true;
		}
		return false;
	}
}
