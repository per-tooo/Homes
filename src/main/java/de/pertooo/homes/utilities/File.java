package de.pertooo.homes.utilities;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class File {
    private java.io.File file;
    private FileConfiguration fileConfiguration;
    private String fileName;

    public File(String fileName) {
        this.fileName = fileName + ".yml";
        this.file = new java.io.File("plugins//Homes//players", this.fileName);
        this.fileConfiguration = YamlConfiguration.loadConfiguration(this.file);
    }

    public FileConfiguration getFileConfiguration() { return this.fileConfiguration; }

    public boolean fileExists() { return this.file.exists() && !this.file.isDirectory(); }

    public void saveFile() {
        try {
            this.fileConfiguration.save(this.file);
        } catch (Exception exception) {
            System.out.println("[ERROR] Could not save file: " + this.fileName);
        }
    }
}
