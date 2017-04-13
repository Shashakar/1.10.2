package com.shashakar.tutorial.items;

import com.shashakar.tutorial.Reference;

import com.shashakar.tutorial.Tutorial;
import net.minecraft.item.Item;

public class ItemWoodBucketWater extends Item {

	public ItemWoodBucketWater() {
		
		setUnlocalizedName(Reference.TutorialItems.WOODBUCKETWATER.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.WOODBUCKETWATER.getRegistryName());
		setCreativeTab(Tutorial.CREATIVE_TAB);
	}
	
}