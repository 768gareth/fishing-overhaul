package FishingOverhaul.Patches;

import necesse.engine.modLoader.annotations.ModMethodPatch;
import necesse.level.maps.biomes.FishingLootTable;
import necesse.level.maps.biomes.FishingSpot;
import necesse.level.maps.biomes.forest.ForestBiome;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.asm.Advice.OnMethodExit;
import net.bytebuddy.asm.Advice.This;

@ModMethodPatch(target = ForestBiome.class, name = "getFishingLootTable", arguments = {FishingSpot.class})
public class ForestFishingLootTablePatch 
{
    @OnMethodExit
    static void onExit(@This ForestBiome Biome, @Advice.Argument(0) FishingSpot Spot, @Advice.Return(readOnly = false) FishingLootTable Loot)
    {
        if (Spot.tile.level.isSurfaceLevel())
        {
            if ("treasure_bait".equals(Spot.bait.getStringID()))
            {
                Loot.addWater(100, "surface_treasure_chest");
            }
            else
            {
                Loot.addWater(25, "surface_treasure_chest");
            }
        }
        else if (Spot.tile.level.isBasicCaveLevel()) 
        {
            if ("treasure_bait".equals(Spot.bait.getStringID()))
            {
                Loot.addWater(100, "forest_caves_treasure_chest");
            }
            else
            {
                Loot.addWater(25, "forest_caves_treasure_chest");
            }
        }
        else if (Spot.tile.level.isDeepCaveLevel())
        {
            if ("treasure_bait".equals(Spot.bait.getStringID()))
            {
                Loot.addWater(100, "deep_forest_caves_treasure_chest");
            }
            else
            {
                Loot.addWater(25, "deep_forest_caves_treasure_chest");
            }
        }
    }
}
