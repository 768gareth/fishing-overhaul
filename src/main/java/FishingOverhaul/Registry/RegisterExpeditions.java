package FishingOverhaul.Registry;

import FishingOverhaul.Utils.CustomFishingExpedition;
import necesse.engine.registries.ExpeditionMissionRegistry;
import necesse.inventory.lootTable.LootTable;

public class RegisterExpeditions 
{
    public static void Register()
    {
        // Loot Tables
        LootTable SurfaceForestLootTable = new LootTable();
        LootTable ForestCavesLootTable = new LootTable();
        LootTable ForestDeepCavesLootTable = new LootTable();

        LootTable SurfaceSnowLootTable = new LootTable();
        LootTable SnowCavesLootTable = new LootTable();
        LootTable SnowDeepCavesLootTable = new LootTable();

        LootTable SurfacePlainsLootTable = new LootTable();
        LootTable PlainsCavesLootTable = new LootTable();
        LootTable PlainsDeepCavesLootTable = new LootTable();

        LootTable SurfaceSwampLootTable = new LootTable();
        LootTable SwampCavesLootTable = new LootTable();
        LootTable SwampDeepCavesLootTable = new LootTable();

        LootTable SurfaceDesertLootTable = new LootTable();
        LootTable DesertCavesLootTable = new LootTable();
        LootTable DesertDeepCavesLootTable = new LootTable();
        
        // Expeditions
        ExpeditionMissionRegistry.registerExpedition("surface_forest_fishing", new CustomFishingExpedition(SurfaceForestLootTable, 200, null));
        ExpeditionMissionRegistry.registerExpedition("forest_caves_fishing", new CustomFishingExpedition(ForestCavesLootTable, 400, "evilsprotector"));
        ExpeditionMissionRegistry.registerExpedition("forest_deep_caves_fishing", new CustomFishingExpedition(ForestDeepCavesLootTable, 600, "reaper"));

        ExpeditionMissionRegistry.registerExpedition("surface_snow_fishing", new CustomFishingExpedition(SurfaceSnowLootTable, 200, null));
        ExpeditionMissionRegistry.registerExpedition("snow_caves_fishing", new CustomFishingExpedition(SnowCavesLootTable, 400, "queenspider"));
        ExpeditionMissionRegistry.registerExpedition("snow_deep_caves_fishing", new CustomFishingExpedition(SnowDeepCavesLootTable, 600, "cryoqueen"));

        ExpeditionMissionRegistry.registerExpedition("surface_plains_fishing", new CustomFishingExpedition(SurfacePlainsLootTable, 200, null));
        ExpeditionMissionRegistry.registerExpedition("plains_caves_fishing", new CustomFishingExpedition(PlainsCavesLootTable, 400, "chieftain"));
        ExpeditionMissionRegistry.registerExpedition("plains_deep_caves_fishing", new CustomFishingExpedition(PlainsDeepCavesLootTable, 600, "thecursedcrone"));

        ExpeditionMissionRegistry.registerExpedition("surface_swamp_fishing", new CustomFishingExpedition(SurfaceSwampLootTable, 200, null));
        ExpeditionMissionRegistry.registerExpedition("swamp_caves_fishing", new CustomFishingExpedition(SwampCavesLootTable, 400, "swampguardian"));
        ExpeditionMissionRegistry.registerExpedition("swamp_deep_caves_fishing", new CustomFishingExpedition(SwampDeepCavesLootTable, 600, "pestwarden"));

        ExpeditionMissionRegistry.registerExpedition("surface_desert_fishing", new CustomFishingExpedition(SurfaceDesertLootTable, 200, null));
        ExpeditionMissionRegistry.registerExpedition("desert_caves_fishing", new CustomFishingExpedition(DesertCavesLootTable, 400, "ancientvulture"));
        ExpeditionMissionRegistry.registerExpedition("desert_deep_caves_fishing", new CustomFishingExpedition(DesertDeepCavesLootTable, 600, "sageandgrit"));
    }
}
