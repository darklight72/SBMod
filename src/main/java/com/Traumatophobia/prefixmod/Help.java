package com.Traumatophobia.prefixmod;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.IClientCommand;

public class Help implements IClientCommand {
	public static boolean Toggled = false;
	
	private final List aliases;

	public Help()
    { 
		aliases = new ArrayList();
		aliases.add("trauhelp");
		aliases.add("trauphohelp");
		aliases.add("sbmodhelp");
		aliases.add("skyblockmodhelp");
		aliases.add("thelp");
    } 
	

	@Override
	public boolean checkPermission(MinecraftServer arg0, ICommandSender arg1) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void execute(MinecraftServer arg0, ICommandSender arg1, String[] arg2) throws CommandException {
		String boarder = "";
		for (int i = 0; i < 20; i++) {
			boarder += TextFormatting.DARK_RED+"*";
			boarder += TextFormatting.RED+"*";
		}
		
		if (arg2.length == 0 || arg2[0].equals("1")) {
		Minecraft.getMinecraft().player.sendMessage(new TextComponentString(boarder));
		Minecraft.getMinecraft().player.sendMessage(new TextComponentString(TextFormatting.BOLD+"Universal Commands"));
		Minecraft.getMinecraft().player.sendMessage(new TextComponentString("/togglenotify - Toggles your name being highlighted"));
		Minecraft.getMinecraft().player.sendMessage(new TextComponentString("/addnick - adds extra words to notify"));
		Minecraft.getMinecraft().player.sendMessage(new TextComponentString("/delnick - stops notifing you when a word is said"));
		Minecraft.getMinecraft().player.sendMessage(new TextComponentString("/nicklist - lists your nicknames"));
		Minecraft.getMinecraft().player.sendMessage(new TextComponentString("/setchatprefix [prefix] - Sets a prefix before you talk"));
		Minecraft.getMinecraft().player.sendMessage(new TextComponentString("/setchatsuffix [suffix] - Sets a suffix after you talk"));
		Minecraft.getMinecraft().player.sendMessage(new TextComponentString("/removechatprefix - removes your prefix"));
		Minecraft.getMinecraft().player.sendMessage(new TextComponentString("/toggleraffle - removes [SBRaffle] in chat"));
		Minecraft.getMinecraft().player.sendMessage(new TextComponentString("/togglevotes - removes 'player voted' in chat"));
		Minecraft.getMinecraft().player.sendMessage(new TextComponentString("/togletips - removes [Skyblock] in chat"));
		Minecraft.getMinecraft().player.sendMessage(new TextComponentString("/togglemobarena - removes [MobArena] in chat"));
		Minecraft.getMinecraft().player.sendMessage(new TextComponentString("/togglewelcome - removes the title when you cross island boarders"));
		Minecraft.getMinecraft().player.sendMessage(new TextComponentString("/toggleshop - removes shop notifications"));
		Minecraft.getMinecraft().player.sendMessage(new TextComponentString("/toggleall - removes everything"));
		Minecraft.getMinecraft().player.sendMessage(new TextComponentString("do /thelp 2 for next more commands"));
		Minecraft.getMinecraft().player.sendMessage(new TextComponentString(boarder));
		}
		else if (arg2[0].equals("2")) {
			Minecraft.getMinecraft().player.sendMessage(new TextComponentString(boarder));
			Minecraft.getMinecraft().player.sendMessage(new TextComponentString("/noticeclag - Makes clag more noticable"));
			Minecraft.getMinecraft().player.sendMessage(new TextComponentString("/toggleafk - Same as /tafk but you have to type it again to cancel"));
			Minecraft.getMinecraft().player.sendMessage(new TextComponentString("/colours - shows all formatting colours"));
			Minecraft.getMinecraft().player.sendMessage(new TextComponentString("/autoadvert [message] - automatically sends message every minuite"));
			Minecraft.getMinecraft().player.sendMessage(new TextComponentString("/stopautoadvert - stops auto advert"));
			Minecraft.getMinecraft().player.sendMessage(new TextComponentString("/autoadverttime [time] - sets the time between auto adverts"));
			Minecraft.getMinecraft().player.sendMessage(new TextComponentString("/joincommand - Adds commands to be used when you log in"));
			Minecraft.getMinecraft().player.sendMessage(new TextComponentString("/autoprivate [Line2] [Line3] - Automatically writes private signs"));
			Minecraft.getMinecraft().player.sendMessage(new TextComponentString("/autobuy - Automatically buys raffle tickets"));
			Minecraft.getMinecraft().player.sendMessage(new TextComponentString("do /thelp 3 for next more commands"));
			Minecraft.getMinecraft().player.sendMessage(new TextComponentString(boarder));

		}
		else if (arg2[0].equals("3")) {
			Minecraft.getMinecraft().player.sendMessage(new TextComponentString(boarder));
			Minecraft.getMinecraft().player.sendMessage(new TextComponentString(TextFormatting.BOLD+"Skylord+ commands"));
			Minecraft.getMinecraft().player.sendMessage(new TextComponentString("/autofix - Automatically fixes when durability falls below 10%"));
			Minecraft.getMinecraft().player.sendMessage(new TextComponentString(boarder));
			Minecraft.getMinecraft().player.sendMessage(new TextComponentString(TextFormatting.BOLD+"Skygod+ commands"));
			Minecraft.getMinecraft().player.sendMessage(new TextComponentString("/enchantall - enchants held item to max"));
			Minecraft.getMinecraft().player.sendMessage(new TextComponentString(boarder));
			Minecraft.getMinecraft().player.sendMessage(new TextComponentString(TextFormatting.BOLD+"Skytitan+ commands"));
			Minecraft.getMinecraft().player.sendMessage(new TextComponentString("/autospawnmob [mob] [amount] [player] - Auto /spawnmob every min"));
			Minecraft.getMinecraft().player.sendMessage(new TextComponentString("/stopspawnmob sheep:rainbow [amount] [player] - cycles through colours"));
			Minecraft.getMinecraft().player.sendMessage(new TextComponentString("/stopspawnmob - stops spawning mobs"));
			Minecraft.getMinecraft().player.sendMessage(new TextComponentString(boarder));
		}
		else {
			Minecraft.getMinecraft().player.sendMessage(new TextComponentString("Please do /thelp [page number]"));
		}
	}



	@Override
	public List<String> getAliases() {
		// TODO Auto-generated method stub
		return this.aliases;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "tsbhelp";
	}

	@Override
	public List<String> getTabCompletions(MinecraftServer arg0, ICommandSender arg1, String[] arg2, BlockPos arg3) {
		// TODO Auto-generated method stub
		List<String> empty = new ArrayList<>();
		return empty;
	}

	@Override
	public String getUsage(ICommandSender arg0) {
		// TODO Auto-generated method stub
		return "tsbhelp";
	}

	@Override
	public boolean isUsernameIndex(String[] arg0, int arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int compareTo(ICommand arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean allowUsageWithoutPrefix(ICommandSender arg0, String arg1) {
		// TODO Auto-generated method stub
		return false;
	}

}