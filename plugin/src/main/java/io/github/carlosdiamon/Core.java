package io.github.carlosdiamon;

import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin {

	@Override
	public void onEnable() {
		getSLF4JLogger().info("Hello World!");
	}

	@Override
	public void onDisable() {
		// zzz
	}
}
