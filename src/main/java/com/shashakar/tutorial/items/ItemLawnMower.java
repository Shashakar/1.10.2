package com.shashakar.tutorial.items;

import com.shashakar.tutorial.Reference;

import com.shashakar.tutorial.Tutorial;
import net.minecraft.item.Item;

public class ItemLawnMower extends Item {

	public ItemLawnMower() {
		
		setUnlocalizedName(Reference.TutorialItems.LAWNMOWER.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.LAWNMOWER.getRegistryName());
		setCreativeTab(Tutorial.CREATIVE_TAB);
	}
	
}