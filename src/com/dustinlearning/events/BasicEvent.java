package com.dustinlearning.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class BasicEvent extends JavaPlugin implements Listener{

public void onEnable(){

PluginManager pm = getServer().getPluginManager();
pm.registerEvents(this, this);


}
@EventHandler 
public void onJoin(PlayerJoinEvent e){
	Player p = e.getPlayer();
		p.sendMessage(ChatColor.GOLD + "Thanks for joining" + ChatColor.BLUE + ChatColor.BOLD + " Cosmic Network" + " " + p.getName());
			e.getJoinMessage().remove();

}

}
