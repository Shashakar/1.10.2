package com.shashakar.tutorial.items;

import com.shashakar.tutorial.Reference;

import com.shashakar.tutorial.Tutorial;
import net.minecraft.item.Item;

public class ItemDough extends Item {

	public ItemDough() {
		
		setUnlocalizedName(Reference.TutorialItems.DOUGH.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.DOUGH.getRegistryName());
		setCreativeTab(Tutorial.CREATIVE_TAB);
	}
	
}