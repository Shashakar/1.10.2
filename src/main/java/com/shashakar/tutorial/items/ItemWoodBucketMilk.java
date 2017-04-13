package com.shashakar.tutorial.items;

import com.shashakar.tutorial.Reference;

import com.shashakar.tutorial.Tutorial;
import net.minecraft.item.Item;

public class ItemWoodBucketMilk extends Item {

	public ItemWoodBucketMilk() {
		
		setUnlocalizedName(Reference.TutorialItems.WOODBUCKETMILK.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.WOODBUCKETMILK.getRegistryName());
		setCreativeTab(Tutorial.CREATIVE_TAB);
	}
	
}