package com.shawndoeswhat.silverhelpers;

import com.shawndoeswhat.silverhelpers.commands.DiscordCommand;
import com.shawndoeswhat.silverhelpers.commands.ModrinthCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class SilverHelpers extends JavaPlugin {

    private static SilverHelpers instance;

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();

        getLogger().info("SilverHelpers enabled!");

        getCommand("discord").setExecutor(new DiscordCommand());
        getCommand("modrinth").setExecutor(new ModrinthCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("SilverHelpers disabled.");
    }

    public static SilverHelpers getInstance() {
        return instance;
    }
}
