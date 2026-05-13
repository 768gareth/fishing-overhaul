package FishingOverhaul.Registry;

import FishingOverhaul.Utils.TreasureChestItem;
import FishingOverhaul.Utils.UniqueFishItem;
import FishingOverhaul.Utils.UniqueFishingRodItem;
import necesse.engine.registries.ItemRegistry;
import necesse.inventory.item.Item.Rarity;
import necesse.inventory.lootTable.LootList;
import necesse.inventory.lootTable.presets.CaveChestLootTable;
import necesse.inventory.lootTable.presets.DeepCaveChestLootTable;
import necesse.inventory.lootTable.presets.SurfaceRuinsChestLootTable;

public class RegisterItems 
{
    public static void Register()
    {
        LootList Surface = new LootList();
        SurfaceRuinsChestLootTable.mainItem.addPossibleLoot(Surface, new Object[0]);

        LootList ForestCaves = new LootList();
        CaveChestLootTable.basicMainItems.addPossibleCustomLoot(ForestCaves, new Object[0]);

        LootList SnowCaves = new LootList();
        CaveChestLootTable.snowMainItems.addPossibleLoot(SnowCaves, new Object[0]);

        LootList PlainsCaves = new LootList();
        CaveChestLootTable.plainsMainItems.addPossibleLoot(PlainsCaves, new Object[0]);

        LootList SwampCaves = new LootList();
        CaveChestLootTable.swampMainItems.addPossibleLoot(SwampCaves, new Object[0]);

        LootList DesertCaves = new LootList();
        CaveChestLootTable.desertMainItems.addPossibleLoot(DesertCaves, new Object[0]);

        LootList DeepForestCaves = new LootList();
        DeepCaveChestLootTable.basicMainItems.addPossibleLoot(DeepForestCaves, new Object[0]);

        LootList DeepSnowCaves = new LootList();
        DeepCaveChestLootTable.snowMainItems.addPossibleLoot(DeepSnowCaves, new Object[0]);

        LootList DeepPlainsCaves = new LootList();
        DeepCaveChestLootTable.plainsMainItems.addPossibleLoot(DeepPlainsCaves, new Object[0]);

        LootList DeepSwampCaves = new LootList();
        DeepCaveChestLootTable.swampMainItems.addPossibleLoot(DeepSwampCaves, new Object[0]);

        LootList DeepDesertCaves = new LootList();
        DeepCaveChestLootTable.desertMainItems.addPossibleLoot(DeepDesertCaves, new Object[0]);

        ItemRegistry.registerItem("surface_treasure_chest", new TreasureChestItem(Surface, 50, Rarity.UNCOMMON), 20, true);
        ItemRegistry.registerItem("forest_caves_treasure_chest", new TreasureChestItem(ForestCaves, 60, Rarity.UNCOMMON), 25, true);
        ItemRegistry.registerItem("snow_caves_treasure_chest", new TreasureChestItem(SnowCaves, 70, Rarity.UNCOMMON), 30, true);
        ItemRegistry.registerItem("plains_caves_treasure_chest", new TreasureChestItem(PlainsCaves, 80, Rarity.UNCOMMON), 35, true);
        ItemRegistry.registerItem("swamp_caves_treasure_chest", new TreasureChestItem(SwampCaves, 90, Rarity.UNCOMMON), 40, true);
        ItemRegistry.registerItem("desert_caves_treasure_chest", new TreasureChestItem(DesertCaves, 100, Rarity.UNCOMMON), 45, true);

        ItemRegistry.registerItem("deep_forest_caves_treasure_chest", new TreasureChestItem(DeepForestCaves, 110, Rarity.RARE), 50, true);
        ItemRegistry.registerItem("deep_snow_caves_treasure_chest", new TreasureChestItem(DeepSnowCaves, 120, Rarity.RARE), 55, true);
        ItemRegistry.registerItem("deep_plains_caves_treasure_chest", new TreasureChestItem(DeepPlainsCaves, 130, Rarity.RARE), 60, true);
        ItemRegistry.registerItem("deep_swamp_caves_treasure_chest", new TreasureChestItem(DeepSwampCaves, 140, Rarity.RARE), 65, true);
        ItemRegistry.registerItem("deep_desert_caves_treasure_chest", new TreasureChestItem(DeepDesertCaves, 150, Rarity.RARE), 70, true);

        // Fish
        ItemRegistry.registerItem("oyster", (new UniqueFishItem("oyster_tooltip", Rarity.COMMON)).setItemCategory(new String[]{"materials", "commonfish"}), 10.0F, true);
        ItemRegistry.registerItem("magma_dweller", (new UniqueFishItem("magmadweller_tooltip", Rarity.RARE)).setItemCategory(new String[]{"materials", "specialfish"}), 30.0F, true);
        ItemRegistry.registerItem("frost_lurker", (new UniqueFishItem("frostlurker_tooltip", Rarity.RARE)).setItemCategory(new String[]{"materials", "specialfish"}), 30.0F, true);

        // Fishing Rods
        ItemRegistry.registerItem("inferno_rod", new UniqueFishingRodItem
        (
            "inferno_rod_tooltip", 
            45, 
            34, 
            28, 
            2, 
            30, 
            45, 
            Rarity.RARE
        ), 600F, true);

        ItemRegistry.registerItem("crystal_catcher", new UniqueFishingRodItem
        (
            "crystal_catcher_tooltip", 
            60, 
            34, 
            28, 
            3, 
            30, 
            50, 
            Rarity.RARE
        ), 800F, true);

        // Bait
    }
}
