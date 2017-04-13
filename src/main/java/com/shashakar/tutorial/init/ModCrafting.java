package com.shashakar.tutorial.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModCrafting {

    public static void register() {
//COMPONENTS
        //FOOD COMPONENTS
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dough, 1), new Object[] {ModItems.flour, new ItemStack(Items.WATER_BUCKET, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dough, 1), new Object[] {ModItems.flour, new ItemStack(ModItems.woodBucketWater, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.flour, 1), new Object[] {Items.WHEAT, new ItemStack(ModItems.grindstone, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.uncookedCorndog, 1), new Object[] {ModItems.dough, new ItemStack(Items.PORKCHOP, 1)});

        //ITEMS WITH VARIANTS
        //FILLINGS
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.fillingApple, 1), new Object[] {Items.SUGAR, new ItemStack(Items.APPLE, 1)});

        //UNCOOKED PIES
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.uncookedPieApple), "DDD", "DFD", "DDD", 'D', ModItems.dough, 'F', ModItems.fillingApple);

        //TOOL COMPONENTS
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.chain), " I ", "I I", " I ", 'I', Items.IRON_INGOT);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.blade, 1), new Object[] {Items.IRON_SWORD, new ItemStack(Items.IRON_SWORD, 1)});

//-------------------------------------------------------------
//TOOLS
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.chainsaw, 1), new Object[] {ModItems.chain, new ItemStack(ModItems.blade, 1)});
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.lawnMower), "  S", "RRR", "BBB", 'S', Items.STICK, 'R', new ItemStack(Blocks.WOOL, 1, 14), 'B', ModItems.blade);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.grindstone), "C  ", " C ", "   ", 'C', Blocks.COBBLESTONE);

        //TOOL BLOCKS
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.fryer), "IFI", "III", 'I', Items.IRON_INGOT, 'F', Blocks.FURNACE);
        //BUCKETS
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.woodBucketEmpty), "W W", " W ", 'W', Blocks.LOG);


//-------------------------------------------------------------
//FOOD


        //ITEMS WITH VARIANTS
        GameRegistry.addSmelting(ModItems.uncookedPieApple, new ItemStack(ModItems.pieapple, 6), 0.35F);
//-------------------------------------------------------------
    }

}

