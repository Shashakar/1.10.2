package com.shashakar.tutorial.items;

import com.shashakar.tutorial.Reference;

import com.shashakar.tutorial.Tutorial;
import net.minecraft.item.Item;

public class ItemFlour extends Item {

	public ItemFlour() {
		
		setUnlocalizedName(Reference.TutorialItems.FLOUR.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.FLOUR.getRegistryName());
		setCreativeTab(Tutorial.CREATIVE_TAB);
	}
	
}