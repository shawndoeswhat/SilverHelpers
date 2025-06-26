package com.shawndoeswhat.silverhelpers.commands;

import com.shawndoeswhat.silverhelpers.SilverHelpers;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class DiscordCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String link = SilverHelpers.getInstance().getConfig().getString("discord-link");
        String message = SilverHelpers.getInstance().getConfig().getString("messages.discord");
        if (message == null) message = "§bJoin our Discord: §f%link%";
        sender.sendMessage(message.replace("%link%", link));
        return true;
    }
}
