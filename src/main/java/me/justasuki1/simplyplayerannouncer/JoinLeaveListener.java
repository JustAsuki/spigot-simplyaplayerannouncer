package me.justasuki1.simplyplayerannouncer;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveListener implements Listener {

    @EventHandler
    public  void onJoin(PlayerJoinEvent e) {

        Player player = e.getPlayer();

        if (player.hasPlayedBefore()) {
            e.setJoinMessage(ChatColor.DARK_GRAY + "[" + player.getDisplayName() + "]" +ChatColor.DARK_BLUE + " has joined the server! Welcome back :)");
        } else {
            e.setJoinMessage(ChatColor.DARK_GRAY + "[" + player.getDisplayName() + "]" +ChatColor.DARK_BLUE + " has joined the community! Give them a warm welcome <3");
        }
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent e) {

        Player player = e.getPlayer();
        e.setQuitMessage(ChatColor.DARK_GRAY + "[" + player.getDisplayName() + "]" +ChatColor.DARK_RED + " has left the server! Come back soon :(");

    }

}
