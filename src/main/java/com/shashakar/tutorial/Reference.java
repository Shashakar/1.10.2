package com.shashakar.tutorial;

public class Reference {

	public static final String MOD_ID = "stm";
	public static final String NAME = "Shashakar's Tutorial Mod";
	public static final String VERSION = "1.1";
	public static final String ACCEPTED_VERSIONS = "[1.9.4, 1.10.2]";
	
	public static final String CLIENT_PROXY_CLASS = "com.shashakar.tutorial.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.shashakar.tutorial.proxy.ServerProxy";
	
	public static enum TutorialItems {
		
//COMPONENTS
	//FOOD COMPONENTS
		FLOUR("flour", "ItemFlour"),
		DOUGH("dough", "ItemDough"),
		UNCOOKEDCORNDOG("uncookedcorndog", "ItemUncookedCorndog"),
			
			//ITEMS WITH VARIANTS
				//FILLINGS
					FILLINGAPPLE("fillingapple", "ItemFillingApple"),
				
				//UNCOOKED PIES
					UNCOOKEDPIEAPPLE("uncookedapplepie", "ItemUncookedPieApple"),
				
	//TOOL COMPONENTS
		CHAIN("chain", "ItemChain"),
		BLADE("blade", "ItemBlade"),
			
//-------------------------------------------------------------
//TOOLS
	CHAINSAW("chainsaw", "ItemChainsaw"),
	LAWNMOWER("lawnmower", "ItemLawnMower"),
	GRINDSTONE("grindstone", "ItemGrindstone"),
			
	//BUCKETS
		WOODBUCKETEMPTY("woodbucketempty", "ItemWoodBucketEmpty"),
		WOODBUCKETWATER("woodbucketwater", "ItemWoodBucketWater"),
		WOODBUCKETMILK("woodbucketmilk", "ItemWoodBucketMilk"),
		
//-------------------------------------------------------------
//FOOD
	DOUGHNUT("doughnut", "ItemDoughnut"),
	CORNDOG("corndog", "ItemCorndog"),
			
	//ITEMS WITH VARIANTS
		PIEAPPLE("pieapple", "ItemPieApple");

//-------------------------------------------------------------
		private String unlocalizedName;
		private String registryName;
		
		TutorialItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
	
	public static enum TutorialBlocks {
		FRYER("fryer", "BlockFryer");
		
		private String unlocalizedName;
		private String registryName;
		
		TutorialBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
}

