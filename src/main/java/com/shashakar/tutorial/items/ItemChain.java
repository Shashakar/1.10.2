package com.shashakar.tutorial.items;

import com.shashakar.tutorial.Reference;

import com.shashakar.tutorial.Tutorial;
import net.minecraft.item.Item;

public class ItemChain extends Item {

	public ItemChain() {
		
		setUnlocalizedName(Reference.TutorialItems.CHAIN.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.CHAIN.getRegistryName());
		setCreativeTab(Tutorial.CREATIVE_TAB);
	}
	
}