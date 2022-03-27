package me.inefficacy.nobedbombing.events;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

public class Events implements Listener {
	
	@EventHandler
	public static void onDamageEvent(EntityDamageEvent e) {
		if(e instanceof Player) {
			Entity entity = e.getEntity();
			if(e.getCause() == DamageCause.BLOCK_EXPLOSION) {
				e.setDamage(0);
			} else if (e.getCause() == DamageCause.ENTITY_EXPLOSION && entity.getType() == EntityType.ENDER_CRYSTAL) {
				e.setDamage(0);
			}
		}
	}
}
