package de.prixix.buildsystem;

import de.prixix.buildsystem.Main;

public class Messages {
	
	public static String prefix = Main.plugin.Config.getString("Messages.Prefix").replaceAll("&", "§");
	public static String creative = Main.plugin.Config.getString("Messages.Creaitve").replaceAll("&", "§");
	public static String survival = Main.plugin.Config.getString("Messages.Survival").replaceAll("&", "§");
	public static String adventure = Main.plugin.Config.getString("Messages.Adventure").replaceAll("&", "§");
	public static String spectator = Main.plugin.Config.getString("Messages.Spectator").replaceAll("&", "§");
	public static String changeothersurvival = Main.plugin.Config.getString("Messages.ChangeOtherSurvival").replaceAll("&", "§");
	public static String changeothercreative = Main.plugin.Config.getString("Messages.ChangeOtherCreative").replaceAll("&", "§");
	public static String changeotheradventure = Main.plugin.Config.getString("Messages.ChangeOtherAdventure").replaceAll("&", "§");
	public static String changeotherspectator = Main.plugin.Config.getString("Messages.ChangeOtherSpectator").replaceAll("&", "§");
	public static String invalidgamemode = Main.plugin.Config.getString("Messages.InvalidGamemode").replaceAll("&", "§");
	public static String alreadyingamemode = Main.plugin.Config.getString("Messages.AlreadyInGamemode").replaceAll("&", "§");
	public static String otheralreadyingamemode = Main.plugin.Config.getString("Messages.OtherAlreadyInGamemode").replaceAll("&", "§");
	public static String joinmessage = Main.plugin.Config.getString("Messages.JoinMessage").replaceAll("&", "§");
	public static String usagegamemode = Main.plugin.Config.getString("Messages.UsageGamemode").replace("&", "§");
	public static String disconnectmessage = Main.plugin.Config.getString("Messages.DisconnectMessage").replaceAll("&", "§");
	public static String NoPermission = Main.plugin.Config.getString("Messages.Prefix").replaceAll("&", "§") + "" + Main.plugin.Config.getString("Messages.NoPermission").replaceAll("&", "§");;
}
