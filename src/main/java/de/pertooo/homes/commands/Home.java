package de.pertooo.homes.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.UUID;

public class Home implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!(commandSender instanceof Player))
            return false;

        Player player = (Player) commandSender;

        // home (help)
        if (strings.length == 0) {}

        // home list
        if (strings.length == 1) {}

        // home <set|tp|delete> <arg>
        if (strings.length == 2) {}

        // home by <player> list
        if (strings.length == 3) {}

        // home by <player> <tp|delete> <arg>
        if (strings.length == 4) {}

        return false;
    }
}
