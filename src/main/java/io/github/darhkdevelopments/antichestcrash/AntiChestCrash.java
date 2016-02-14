package io.github.darhkdevelopments.antichestcrash;

import org.bukkit.plugin.java.JavaPlugin;

public class AntiChestCrash extends JavaPlugin 
{
	
	public static AntiChestCrash instance;
	
	@Override
	public void onEnable() 
	{
		instance = this;
		this.getServer().getPluginManager().registerEvents(new ExploitListeners(), this);
		getLogger().info("AntiChestCrash ENABLED");
		
	}
	
	@Override
	public void onDisable() 
	{
		getLogger().info("AntiChestCrash DISABLED");
	}
	
	
	public static AntiChestCrash getInstance() 
	{
		return instance;
	}
	
	
	

}
