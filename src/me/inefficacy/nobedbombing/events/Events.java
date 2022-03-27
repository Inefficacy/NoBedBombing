package me.inefficacy.nobedbombing.events;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

public class Events implements Listener {
	
	@EventHandler
	public static void onDamageEvent(EntityDamageEvent e) {
		if(e.getCause() == DamageCause.BLOCK_EXPLOSION) {
			e.setDamage(0);
		}
	}
	@EventHandler
	public static void onEntityDamageByEntity(EntityDamageByEntityEvent e) {
		Entity entity = e.getDamager();
		if (entity.getType() == EntityType.ENDER_CRYSTAL) {
			e.setDamage(0);
		}
	}
}
