package com.toraden.dice;
import java.util.Random;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
public class NiceDicePlugin extends JavaPlugin{
	
    //↓ onEnableはロードされた時に実行されるメソッ
    @Override
    public void onEnable() {
		System.out.println("Diceプラグインが有効になりました");
	}
    
    @Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (label.equalsIgnoreCase("dice")) {
			Random rand = new Random();
			StringBuilder b = new StringBuilder("§a<SYSTEM>"+sender.getName()+"がDICE! "+ rand.nextInt(1000)+" の目を出した");
			sender.getServer().broadcastMessage(b.toString());
		}

		return true;
	}
}
