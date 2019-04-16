package de.prixix.buildsystem.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import de.prixix.buildsystem.Messages;

public class Join_Listener implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		
		Player p = e.getPlayer();
		
		e.setJoinMessage(Messages.prefix + Messages.joinmessage.replace("[player]", p.getName()));
		
		for(int i = 0; i<=300; i++) {
			p.sendMessage(" ");
		}
		
	}

}
