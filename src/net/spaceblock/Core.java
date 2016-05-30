package net.spaceblock;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin implements Listener {

    public void newEvent(Listener listener) {
        Bukkit.getPluginManager().registerEvents(listener, this);
    }

    public void newCommand(String command, CommandExecutor commandExecutor) {
        getCommand(command).setExecutor(commandExecutor);
    }

    public void onEnable() {

    }
}
