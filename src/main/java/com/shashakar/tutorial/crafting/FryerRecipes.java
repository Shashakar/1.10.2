package com.shashakar.tutorial.crafting;

import com.google.common.collect.Maps;
import com.shashakar.tutorial.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFishFood;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

import javax.annotation.Nullable;
import java.util.Map;

public class FryerRecipes {

    private static final FryerRecipes FRYING_BASE = new FryerRecipes();
    /** The list of smelting results. */
    private final Map<ItemStack, ItemStack> fryingList = Maps.<ItemStack, ItemStack>newHashMap();
    /** A list which contains how many experience points each recipe output will give. */
    private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();

    public static FryerRecipes instance()
    {
        return FRYING_BASE;
    }

    private FryerRecipes()
    {
        this.addFrying(ModItems.uncookedCorndog, new ItemStack(ModItems.corndog), 0.35F);


        for (ItemFishFood.FishType itemfishfood$fishtype : ItemFishFood.FishType.values())
        {
            if (itemfishfood$fishtype.canCook())
            {
                this.addFryingRecipe(new ItemStack(Items.FISH, 1, itemfishfood$fishtype.getMetadata()), new ItemStack(Items.COOKED_FISH, 1, itemfishfood$fishtype.getMetadata()), 0.35F);
            }
        }

    }

    /**
     * Adds a smelting recipe, where the input item is an instance of Block.
     */
    public void addFryingRecipeForBlock(Block input, ItemStack stack, float experience)
    {
        this.addFrying(Item.getItemFromBlock(input), stack, experience);
    }

    /**
     * Adds a smelting recipe using an Item as the input item.
     */
    public void addFrying(Item input, ItemStack stack, float experience)
    {
        this.addFryingRecipe(new ItemStack(input, 1, 32767), stack, experience);
    }

    /**
     * Adds a smelting recipe using an ItemStack as the input for the recipe.
     */
    public void addFryingRecipe(ItemStack input, ItemStack stack, float experience)
    {
        if (getFryingResult(input) != null) { net.minecraftforge.fml.common.FMLLog.info("Ignored smelting recipe with conflicting input: " + input + " = " + stack); return; }
        this.fryingList.put(input, stack);
        this.experienceList.put(stack, Float.valueOf(experience));
    }

    /**
     * Returns the smelting result of an item.
     */
    @Nullable
    public ItemStack getFryingResult(ItemStack stack)
    {
        for (Map.Entry<ItemStack, ItemStack> entry : this.fryingList.entrySet())
        {
            if (this.compareItemStacks(stack, (ItemStack)entry.getKey()))
            {
                return (ItemStack)entry.getValue();
            }
        }

        return null;
    }

    /**
     * Compares two itemstacks to ensure that they are the same. This checks both the item and the metadata of the item.
     */
    private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
    {
        return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
    }

    public Map<ItemStack, ItemStack> getFryingList()
    {
        return this.fryingList;
    }

    public float getFryingExperience(ItemStack stack)
    {

        for (Map.Entry<ItemStack, Float> entry : this.experienceList.entrySet())
        {
            if (this.compareItemStacks(stack, (ItemStack)entry.getKey()))
            {
                return -1; //-1 will default to the old lookups.
            }
        }

        return 0.0F;
    }
}
