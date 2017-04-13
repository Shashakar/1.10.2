package com.shashakar.tutorial.items;

import com.shashakar.tutorial.Reference;

import com.shashakar.tutorial.Tutorial;
import net.minecraft.item.Item;

public class ItemChainsaw extends Item {

	public ItemChainsaw() {
		
		setUnlocalizedName(Reference.TutorialItems.CHAINSAW.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.CHAINSAW.getRegistryName());
		setCreativeTab(Tutorial.CREATIVE_TAB);
	}
	
}