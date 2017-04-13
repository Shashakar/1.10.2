package com.shashakar.tutorial.init;

import com.shashakar.tutorial.Reference;
import com.shashakar.tutorial.items.*;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

//COMPONENTS
	//FOOD COMPONENTS
		public static Item dough;
		public static Item flour;
		public static Item uncookedCorndog;
		
		//ITEMS WITH VARIANTS
			//FILLINGS
				public static Item fillingApple;
					
			//UNCOOKED PIES
				public static Item uncookedPieApple;
	
	//------------------------------
	//TOOL COMPONENTS
		public static Item chain;
		public static Item blade;
	
//-------------------------------------------------------------
//TOOLS
	public static Item chainsaw;
	public static Item lawnMower;
	public static Item grindstone;
	
	//BUCKETS
		public static Item woodBucketEmpty;
		public static Item woodBucketMilk;
		public static Item woodBucketWater;
	
//-------------------------------------------------------------
//FOOD
	public static Item doughnut;
	public static Item corndog;
	
	//ITEMS WITH VARIANTS
		//PIES
			public static Item pieapple;
	

//-------------------------------------------------------------



	
	public static void init() {
		dough = new ItemDough();
		flour = new ItemFlour();
		uncookedCorndog = new ItemUncookedCorndog();
		fillingApple = new ItemFillingApple();
		uncookedPieApple = new ItemUncookedPieApple();
		chain = new ItemChain();
		blade = new ItemBlade();
		chainsaw = new ItemChainsaw();
		lawnMower = new ItemLawnMower();
		grindstone = new ItemGrindstone();
		woodBucketEmpty = new ItemWoodBucketEmpty();
		woodBucketMilk = new ItemWoodBucketMilk();
		woodBucketWater = new ItemWoodBucketWater();
		doughnut = new ItemDoughnut();
		corndog = new ItemCorndog();
		pieapple = new ItemPieApple();
		
	}
	
	public static void register() {
		GameRegistry.register(dough);
		GameRegistry.register(flour);
		GameRegistry.register(uncookedCorndog);
		GameRegistry.register(fillingApple);
		GameRegistry.register(uncookedPieApple);
		GameRegistry.register(chain);
		GameRegistry.register(blade);
		GameRegistry.register(chainsaw);
		GameRegistry.register(lawnMower);
		GameRegistry.register(grindstone);
		GameRegistry.register(woodBucketEmpty);
		GameRegistry.register(woodBucketMilk);
		GameRegistry.register(woodBucketWater);
		GameRegistry.register(doughnut);
		GameRegistry.register(corndog);
		GameRegistry.register(pieapple);
	}
	
	public static void registerRenders() {
		registerRender(dough);
		registerRender(flour);
		registerRender(uncookedCorndog);
		registerRender(fillingApple);
		registerRender(uncookedPieApple);
		registerRender(chain);
		registerRender(blade);
		registerRender(chainsaw);
		registerRender(lawnMower);
		registerRender(grindstone);
		registerRender(woodBucketEmpty);
		registerRender(woodBucketMilk);
		registerRender(woodBucketWater);
		registerRender(doughnut);
		registerRender(corndog);
		registerRender(pieapple);
	}
	
	private static void registerRender(Item item) {
		System.out.println(item.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
