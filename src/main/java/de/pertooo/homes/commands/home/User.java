package de.pertooo.homes.commands.home;

import de.pertooo.homes.utilities.File;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class User {
    public static void setHome(Player player, String homeName) {
        File file = new File(player.getUniqueId().toString());
        FileConfiguration cfg = file.getFileConfiguration();

        if (cfg.get(homeName) != null)
            return;

        Location location = player.getLocation();

        cfg.set(homeName + ".world", location.getWorld().toString());
        cfg.set(homeName + ".x", location.getX());
        cfg.set(homeName + ".y", location.getY());
        cfg.set(homeName + ".z", location.getZ());
        cfg.set(homeName + ".yaw", location.getYaw());
        cfg.set(homeName + ".pitch", location.getPitch());
    }
}
