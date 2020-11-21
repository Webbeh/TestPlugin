package dev.glassey;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        if (event.getPlayer().getName().equals("Guillaume1868")){
            Bukkit.broadcastMessage("Okaeri oni-chan");
        }
    }
}
