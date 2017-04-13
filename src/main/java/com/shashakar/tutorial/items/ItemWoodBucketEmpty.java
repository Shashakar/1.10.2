package com.shashakar.tutorial.items;

import com.shashakar.tutorial.Reference;

import com.shashakar.tutorial.Tutorial;
import net.minecraft.item.Item;

public class ItemWoodBucketEmpty extends Item {

	public ItemWoodBucketEmpty() {
		
		setUnlocalizedName(Reference.TutorialItems.WOODBUCKETEMPTY.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.WOODBUCKETEMPTY.getRegistryName());
		setCreativeTab(Tutorial.CREATIVE_TAB);
	}
	
}