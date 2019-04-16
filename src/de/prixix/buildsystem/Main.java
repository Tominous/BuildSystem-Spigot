package de.prixix.buildsystem;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import de.prixix.buildsystem.commands.CMD_Gamemode;

public class Main extends JavaPlugin {
	
	public static Main plugin;
	private ConsoleCommandSender Console = getServer().getConsoleSender();
	public FileConfiguration Config = this.getConfig();
	
	public void onEnable() {
		plugin = this;
		loadConfig();
		checkVersion();
		initializeCommands();
		
		Console.sendMessage(Messages.prefix + "The system has been loaded.");
	}
	
	private void loadConfig() {
		Config.options().copyDefaults(true);
		saveConfig();
		Console.sendMessage(Messages.prefix + "Config loaded.");
	}
	
	private void checkVersion() {
		Console.sendMessage(Messages.prefix + "Trying to check the current version...");
		try {
			String out = new Scanner(new URL("http://www.prixix.tk/api/plugin_version.php?id=buildsystemspigot").openStream(), "UTF-8").useDelimiter("\\A").next();
			if(!out.contains(getDescription().getVersion())) {
				Console.sendMessage(Messages.prefix + "§aA new version is available.");
				Console.sendMessage(Messages.prefix + "§aDownload: http://www.prixix.tk/download/51219/");
			} else {
				Console.sendMessage(Messages.prefix + "No update available.");
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void initializeCommands() {
		this.getCommand("gamemode").setExecutor((CommandExecutor)new CMD_Gamemode());
	}
}
