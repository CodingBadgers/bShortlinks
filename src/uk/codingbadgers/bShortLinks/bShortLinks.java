package uk.codingbadgers.bShortLinks;

import net.milkbowl.vault.permission.Permission;

import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public class bShortLinks extends JavaPlugin {
	
	private PlayerListener m_playerListener = new PlayerListener();
	
	public void onEnable() {
		
		Global.plugin = this;
		this.getServer().getPluginManager().registerEvents(m_playerListener, this);
		
		RegisteredServiceProvider<Permission> permissionProvider = this.getServer().getServicesManager().getRegistration(net.milkbowl.vault.permission.Permission.class);
        if (permissionProvider != null) {
        	Global.permission = permissionProvider.getProvider();
        }
        
        Global.LoadConfig();
		
		Global.OutputConsole("bShortLinks Enabled");
		
	}
	
	public void onDisable() {
		
		Global.OutputConsole("bShortLinks Disabled");
		
	}


}
