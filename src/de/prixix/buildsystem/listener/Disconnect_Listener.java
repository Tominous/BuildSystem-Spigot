package de.prixix.buildsystem.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import de.prixix.buildsystem.Messages;

public class Disconnect_Listener implements Listener {
	
	@EventHandler
	public void onDisconnect(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		e.setQuitMessage(Messages.prefix + Messages.disconnectmessage.replace("[player]", p.getName()));
	}

}
