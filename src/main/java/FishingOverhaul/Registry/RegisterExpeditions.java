package FishingOverhaul.Registry;

import FishingOverhaul.Utils.CustomFishingExpedition;
import necesse.engine.registries.ExpeditionMissionRegistry;
import necesse.inventory.lootTable.LootItemInterface;
import necesse.inventory.lootTable.LootTable;
import necesse.inventory.lootTable.lootItem.LootItem;

public class RegisterExpeditions 
{
    public static void Register()
    {
        System.out.println("[Fishing Overhaul] Reconfiguring expeditions...");
        ExpeditionMissionRegistry.fishingTripIDs.clear();
        
        // Forest Biome
        LootTable SurfaceForestLootTable = new LootTable
        (
            new LootItemInterface[]
            {
                new LootItem("surface_treasure_chest"),

                new LootItem("carp"),
                new LootItem("salmon"),
                new LootItem("trout"),

                new LootItem("furfish"),
                new LootItem("gobfish"),
                new LootItem("halffish")
            }
        );

        LootTable ForestCavesLootTable = new LootTable
        (
            new LootItemInterface[]
            {
                new LootItem("forest_caves_treasure_chest"),

                new LootItem("carp"),
                new LootItem("salmon"),
                new LootItem("trout"),

                new LootItem("rockfish"),
                new LootItem("terrorfish")
            }
        );

        LootTable ForestDeepCavesLootTable = new LootTable
        (
            new LootItemInterface[]
            {
                new LootItem("deep_forest_caves_treasure_chest"),

                new LootItem("carp"),
                new LootItem("salmon"),
                new LootItem("trout"),

                new LootItem("rockfish"),
                new LootItem("terrorfish"),

                new LootItem("magma_dweller")
            }
        );

        // Snow Biome
        LootTable SurfaceSnowLootTable = new LootTable
        (
            new LootItemInterface[]
            {
                new LootItem("surface_treasure_chest"),

                new LootItem("carp"),
                new LootItem("salmon"),
                new LootItem("trout"),

                new LootItem("icefish"),
                new LootItem("gobfish"),
                new LootItem("halffish")
            }
        );

        LootTable SnowCavesLootTable = new LootTable
        (
            new LootItemInterface[]
            {
                new LootItem("snow_caves_treasure_chest"),

                new LootItem("cod"),
                new LootItem("salmon"),

                new LootItem("icefish"),
                new LootItem("gobfish"),
                new LootItem("halffish")
            }
        );

        LootTable SnowDeepCavesLootTable = new LootTable
        (
            new LootItemInterface[]
            {
                new LootItem("deep_snow_caves_treasure_chest"),

                new LootItem("carp"),
                new LootItem("salmon"),
                new LootItem("trout"),

                new LootItem("rockfish"),
                new LootItem("terrorfish"),

                new LootItem("magma_dweller"),
                new LootItem("frost_lurker")
            }
        );

        // Plains Biome
        LootTable SurfacePlainsLootTable = new LootTable
        (
            new LootItemInterface[]
            {
                new LootItem("surface_treasure_chest"),

                new LootItem("carp"),
                new LootItem("salmon"),
                new LootItem("trout"),

                new LootItem("gobfish"),
                new LootItem("halffish")
            }
        );

        LootTable PlainsCavesLootTable = new LootTable
        (
            new LootItemInterface[]
            {
                new LootItem("plains_caves_treasure_chest"),

                new LootItem("carp"),
                new LootItem("mackerel"),
                new LootItem("salmon"),
                new LootItem("trout"),
                new LootItem("tuna"),

                new LootItem("gobfish"),
                new LootItem("halffish")
            }
        );

        LootTable PlainsDeepCavesLootTable = new LootTable
        (
            new LootItemInterface[]
            {
                new LootItem("deep_plains_caves_treasure_chest"),

                new LootItem("carp"),
                new LootItem("salmon"),

                new LootItem("rockfish"),
                new LootItem("terrorfish"),

                new LootItem("magma_dweller")
            }
        );

        // Swamp Biome
        LootTable SurfaceSwampLootTable = new LootTable
        (
            new LootItemInterface[]
            {
                new LootItem("surface_treasure_chest"),

                new LootItem("carp"),
                new LootItem("salmon"),

                new LootItem("gobfish"),
                new LootItem("halffish"),
                new LootItem("swampfish")
            }
        );

        LootTable SwampCavesLootTable = new LootTable
        (
            new LootItemInterface[]
            {
                new LootItem("swamp_caves_treasure_chest"),

                new LootItem("carp"),
                new LootItem("mackerel"),
                new LootItem("salmon"),
                new LootItem("tuna"),

                new LootItem("gobfish"),
                new LootItem("halffish"),
                new LootItem("swampfish")
            }
        );

        LootTable SwampDeepCavesLootTable = new LootTable
        (
            new LootItemInterface[]
            {
                new LootItem("deep_swamp_caves_treasure_chest"),

                new LootItem("salmon"),

                new LootItem("terrorfish"),

                new LootItem("magma_dweller")
            }
        );

        // Desert Biome
        LootTable SurfaceDesertLootTable = new LootTable
        (
            new LootItemInterface[]
            {
                new LootItem("surface_treasure_chest"),

                new LootItem("carp"),
                new LootItem("salmon"), 
                new LootItem("mackerel"), 
                new LootItem("trout"), 
                new LootItem("tuna"),

                new LootItem("gobfish"),
                new LootItem("halffish"),
            }
        );
        LootTable DesertCavesLootTable = new LootTable
        (
            new LootItemInterface[]
            {
                new LootItem("desert_caves_treasure_chest"),

                new LootItem("carp"),
                new LootItem("salmon"), 

                new LootItem("rockfish"),
                new LootItem("terrorfish")
            }
        );
        LootTable DesertDeepCavesLootTable = new LootTable
        (
            new LootItemInterface[]
            {
                new LootItem("deep_desert_caves_treasure_chest"),

                new LootItem("carp"),
                new LootItem("salmon"), 

                new LootItem("rockfish"),
                new LootItem("terrorfish"),

                new LootItem("magma_dweller")
            }
        );
        
        // Expeditions
        ExpeditionMissionRegistry.registerExpedition("surface_forest_fishing", new CustomFishingExpedition(SurfaceForestLootTable, 200, null));
        ExpeditionMissionRegistry.registerExpedition("forest_caves_fishing", new CustomFishingExpedition(ForestCavesLootTable, 300, "evilsprotector"));
        ExpeditionMissionRegistry.registerExpedition("forest_deep_caves_fishing", new CustomFishingExpedition(ForestDeepCavesLootTable, 400, "reaper"));

        ExpeditionMissionRegistry.registerExpedition("surface_snow_fishing", new CustomFishingExpedition(SurfaceSnowLootTable, 250, null));
        ExpeditionMissionRegistry.registerExpedition("snow_caves_fishing", new CustomFishingExpedition(SnowCavesLootTable, 350, "queenspider"));
        ExpeditionMissionRegistry.registerExpedition("snow_deep_caves_fishing", new CustomFishingExpedition(SnowDeepCavesLootTable, 450, "cryoqueen"));

        ExpeditionMissionRegistry.registerExpedition("surface_plains_fishing", new CustomFishingExpedition(SurfacePlainsLootTable, 300, null));
        ExpeditionMissionRegistry.registerExpedition("plains_caves_fishing", new CustomFishingExpedition(PlainsCavesLootTable, 400, "chieftain"));
        ExpeditionMissionRegistry.registerExpedition("plains_deep_caves_fishing", new CustomFishingExpedition(PlainsDeepCavesLootTable, 500, "thecursedcrone"));

        ExpeditionMissionRegistry.registerExpedition("surface_swamp_fishing", new CustomFishingExpedition(SurfaceSwampLootTable, 350, null));
        ExpeditionMissionRegistry.registerExpedition("swamp_caves_fishing", new CustomFishingExpedition(SwampCavesLootTable, 450, "swampguardian"));
        ExpeditionMissionRegistry.registerExpedition("swamp_deep_caves_fishing", new CustomFishingExpedition(SwampDeepCavesLootTable, 550, "pestwarden"));

        ExpeditionMissionRegistry.registerExpedition("surface_desert_fishing", new CustomFishingExpedition(SurfaceDesertLootTable, 400, null));
        ExpeditionMissionRegistry.registerExpedition("desert_caves_fishing", new CustomFishingExpedition(DesertCavesLootTable, 500, "ancientvulture"));
        ExpeditionMissionRegistry.registerExpedition("desert_deep_caves_fishing", new CustomFishingExpedition(DesertDeepCavesLootTable, 600, "sageandgrit"));
    }
}
