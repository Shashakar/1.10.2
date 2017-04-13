package com.shashakar.tutorial.items;

import com.shashakar.tutorial.Reference;

import com.shashakar.tutorial.Tutorial;
import net.minecraft.item.Item;

public class ItemUncookedCorndog extends Item {

	public ItemUncookedCorndog() {
		
		setUnlocalizedName(Reference.TutorialItems.UNCOOKEDCORNDOG.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.UNCOOKEDCORNDOG.getRegistryName());
		setCreativeTab(Tutorial.CREATIVE_TAB);
	}
	
}