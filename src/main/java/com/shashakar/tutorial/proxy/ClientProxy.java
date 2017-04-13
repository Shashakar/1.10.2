package com.shashakar.tutorial.proxy;

import com.shashakar.tutorial.Reference;
import com.shashakar.tutorial.Tutorial;
import com.shashakar.tutorial.client.gui.GuiHandler;
import com.shashakar.tutorial.init.ModBlocks;
import com.shashakar.tutorial.init.ModItems;
import com.shashakar.tutorial.tileentity.TileEntityFryer;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class ClientProxy extends CommonProxy{
	
	public void init() {

		NetworkRegistry.INSTANCE.registerGuiHandler(Tutorial.instance, new GuiHandler());
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}
}
