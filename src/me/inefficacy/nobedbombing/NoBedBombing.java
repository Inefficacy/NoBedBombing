package me.inefficacy.nobedbombing;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import me.inefficacy.nobedbombing.commands.Command;
import me.inefficacy.nobedbombing.events.Events;

/*
 * Original plugin made by Inefficacy
 */

public class NoBedBombing extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new Events(), this);
		getCommand("nobedbombing").setExecutor(new Command());
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN+"NoBedBombing plugin has been enabled");
	}
	
	@Override
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN+"NoBedBombing plugin has been disabled");
	}
}
