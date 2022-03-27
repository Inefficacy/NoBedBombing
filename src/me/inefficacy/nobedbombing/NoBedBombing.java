package me.inefficacy.nobedbombing;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class NoBedBombing extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN+"NoBedBombing plugin has been enabled");
	}
	
	@Override
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN+"NoBedBombing plugin has been disabled");
	}
}
