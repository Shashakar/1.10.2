package com.shashakar.tutorial;

import com.shashakar.tutorial.client.gui.GuiHandler;
import com.shashakar.tutorial.init.ModCrafting;
import com.shashakar.tutorial.tileentity.TileEntityFryer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.shashakar.tutorial.init.ModBlocks;
import com.shashakar.tutorial.init.ModItems;
import com.shashakar.tutorial.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class Tutorial {
	
	@Instance
	public static Tutorial instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	public static final CreativeTabs CREATIVE_TAB = new TutorialTab();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
		System.out.println("Pre Initializing");
		
		ModItems.init();
		ModItems.register();
		
		ModBlocks.init();
		ModBlocks.register();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event){
		
		System.out.println("Initializing");
		
		proxy.init();

		ModCrafting.register();

		GameRegistry.registerTileEntity(TileEntityFryer.class, Reference.MOD_ID + "fileEntityFryer");
		NetworkRegistry.INSTANCE.registerGuiHandler(Tutorial.instance, new GuiHandler());
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
		System.out.println("Post Initializing");
	}
	
}
//COMPONENTS
//FOOD COMPONENTS
//ITEMS WITH VARIANTS
//FILLINGS

//UNCOOKED PIES

//TOOL COMPONENTS

//-------------------------------------------------------------
//TOOLS


//BUCKETS


//-------------------------------------------------------------
//FOOD


//ITEMS WITH VARIANTS
