package com.shashakar.tutorial.items;

import com.shashakar.tutorial.Reference;

import com.shashakar.tutorial.Tutorial;
import net.minecraft.item.Item;

public class ItemBlade extends Item {

	public ItemBlade() {
		
		setUnlocalizedName(Reference.TutorialItems.BLADE.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.BLADE.getRegistryName());
		setCreativeTab(Tutorial.CREATIVE_TAB);
	}
	
}