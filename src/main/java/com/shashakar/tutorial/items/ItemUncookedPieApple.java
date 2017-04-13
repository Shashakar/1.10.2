package com.shashakar.tutorial.items;

import com.shashakar.tutorial.Reference;

import com.shashakar.tutorial.Tutorial;
import net.minecraft.item.Item;

public class ItemUncookedPieApple extends Item {

	public ItemUncookedPieApple() {
		
		setUnlocalizedName(Reference.TutorialItems.UNCOOKEDPIEAPPLE.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.UNCOOKEDPIEAPPLE.getRegistryName());
		setCreativeTab(Tutorial.CREATIVE_TAB);
	}
	
}