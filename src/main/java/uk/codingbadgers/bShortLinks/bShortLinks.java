package uk.codingbadgers.bShortLinks;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * 
 * @author The Coding Badgers
 *
 */
public class bShortLinks extends JavaPlugin {
	
	/**
	 * 
	 */
	public void onEnable() {
		Global.plugin = this;
		this.getServer().getPluginManager().registerEvents(new PlayerListener(), this);
        Global.LoadConfig();
		Global.OutputConsole("bShortLinks Enabled");
	}
	
	/**
	 * 
	 */
	public void onDisable() {
		Global.OutputConsole("bShortLinks Disabled");
	}

}
