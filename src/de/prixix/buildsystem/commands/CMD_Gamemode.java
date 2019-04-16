package de.prixix.buildsystem.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.prixix.buildsystem.Messages;

public class CMD_Gamemode implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			Player p = ((Player) sender).getPlayer();
			if(args.length == 1) {
				if(args[0].equalsIgnoreCase("1") || args[0].equalsIgnoreCase("creative")) {
					if(p.hasPermission("buildsystem.creative")) {
						if(p.getGameMode() != GameMode.CREATIVE) {
					p.setGameMode(GameMode.CREATIVE);
					p.sendMessage(Messages.prefix + Messages.creative);
					
				} else {
					p.sendMessage(Messages.prefix + Messages.alreadyingamemode);
				}
				} else {
					p.sendMessage(Messages.NoPermission);
				}
				} else if(args[0].equalsIgnoreCase("0") || args[0].equalsIgnoreCase("survival")) {
					if(p.hasPermission("buildsystem.survival")) {
						if(p.getGameMode() != GameMode.SURVIVAL) {
					p.setGameMode(GameMode.SURVIVAL);
					p.sendMessage(Messages.prefix + Messages.survival);
					
				} else {
					p.sendMessage(Messages.prefix + Messages.alreadyingamemode);
				}
				} else {
					p.sendMessage(Messages.NoPermission);
				}
				} else if(args[0].equalsIgnoreCase("2") || args[0].equalsIgnoreCase("adventure")) {
					if(p.hasPermission("buildsystem.adventure")) {
						if(p.getGameMode() != GameMode.ADVENTURE) {
					p.setGameMode(GameMode.ADVENTURE);
					p.sendMessage(Messages.prefix + Messages.adventure);
					
				} else {
					p.sendMessage(Messages.prefix + Messages.alreadyingamemode);
				}
				} else {
					p.sendMessage(Messages.NoPermission);
				}
			}
				else if(args[0].equalsIgnoreCase("3") || args[0].equalsIgnoreCase("spectator")) {
					if(p.hasPermission("buildsystem.spectator")) {
						if(p.getGameMode() != GameMode.SPECTATOR) {
					p.setGameMode(GameMode.SPECTATOR);
					p.sendMessage(Messages.prefix + Messages.spectator);
					
				} else {
					p.sendMessage(Messages.prefix + Messages.alreadyingamemode);
				}
				} else {
					p.sendMessage(Messages.NoPermission);
				}
		} else {
			p.sendMessage(Messages.prefix + Messages.invalidgamemode);
		}
		} else if(args.length == 2) {
			Player target = Bukkit.getPlayer(args[1]);
			if(args[0].equalsIgnoreCase("0") || args[0].equalsIgnoreCase("survival")) {
				if(p.hasPermission("buildsystem.changeother")) {
					if(target.getGameMode() != GameMode.SURVIVAL) {
						p.sendMessage(Messages.prefix + Messages.changeothersurvival.replace("[target]", target.getName()));
						target.setGameMode(GameMode.SURVIVAL);
						target.sendMessage(Messages.prefix + Messages.survival);
					} else {
						p.sendMessage(Messages.prefix + Messages.otheralreadyingamemode.replace("[target]", target.getName()));
					}
				} else {
					p.sendMessage(Messages.NoPermission);
				}
			} else if(args[0].equalsIgnoreCase("1") || args[0].equalsIgnoreCase("creative")) {
				if(p.hasPermission("buildsystem.changeother")) {
					if(target.getGameMode() != GameMode.CREATIVE) {
						p.sendMessage(Messages.prefix + Messages.changeothercreative.replace("[target]", target.getName()));
						target.setGameMode(GameMode.CREATIVE);
						target.sendMessage(Messages.prefix + Messages.creative);
					} else {
						p.sendMessage(Messages.prefix + Messages.otheralreadyingamemode.replace("[target]", target.getName()));
					}
				} else {
					p.sendMessage(Messages.NoPermission);
				}
			} else if(args[0].equalsIgnoreCase("2") || args[0].equalsIgnoreCase("adventure")) {
				if(p.hasPermission("buildsystem.changeother")) {
					if(target.getGameMode() != GameMode.ADVENTURE) {
						p.sendMessage(Messages.prefix + Messages.changeotheradventure.replace("[target]", target.getName()));
						target.setGameMode(GameMode.ADVENTURE);
						target.sendMessage(Messages.prefix + Messages.adventure);
					} else {
						p.sendMessage(Messages.prefix + Messages.otheralreadyingamemode.replace("[target]", target.getName()));
					}
				} else {
					p.sendMessage(Messages.NoPermission);
				}
			} else if(args[0].equalsIgnoreCase("3") || args[0].equalsIgnoreCase("spectator")) {
				if(p.hasPermission("buildsystem.changeother")) {
					if(target.getGameMode() != GameMode.SPECTATOR) {
						p.sendMessage(Messages.prefix + Messages.changeotherspectator.replace("[target]", target.getName()));
						target.setGameMode(GameMode.SPECTATOR);
						target.sendMessage(Messages.prefix + Messages.spectator);
					} else {
						p.sendMessage(Messages.prefix + Messages.otheralreadyingamemode.replace("[target]", target.getName()));
					}
				} else {
					p.sendMessage(Messages.NoPermission);
				}
			}
		} else {
			p.sendMessage(Messages.prefix + Messages.usagegamemode);
		}
	} else {
		//Change players gamemode through console..
	}
		return false;
	}
}
