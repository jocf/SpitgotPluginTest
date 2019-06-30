package io.github.jocf.spigotplugintest;

import org.bukkit.plugin.java.JavaPlugin;

public class SpigotPluginTest extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("onEnable is called!");
    }
    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
    }
}
