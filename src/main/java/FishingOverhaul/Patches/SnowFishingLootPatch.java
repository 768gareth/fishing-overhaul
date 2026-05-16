package FishingOverhaul.Patches;

import necesse.engine.modLoader.annotations.ModMethodPatch;
import necesse.level.maps.biomes.FishingLootTable;
import necesse.level.maps.biomes.FishingSpot;
import necesse.level.maps.biomes.snow.SnowBiome;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.asm.Advice.OnMethodExit;
import net.bytebuddy.asm.Advice.This;

@ModMethodPatch(target = SnowBiome.class, name = "getFishingLootTable", arguments = {FishingSpot.class})
public class SnowFishingLootPatch 
{
    @OnMethodExit
    static void onExit(@This SnowBiome Biome, @Advice.Argument(0) FishingSpot Spot, @Advice.Return(readOnly = false) FishingLootTable Loot)
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
                Loot.addWater(100, "snow_caves_treasure_chest");
            }
            else
            {
                Loot.addWater(25, "snow_caves_treasure_chest");
            }
        }
        else if (Spot.tile.level.isDeepCaveLevel())
        {
            if ("treasure_bait".equals(Spot.bait.getStringID()))
            {
                Loot.addWater(100, "deep_snow_caves_treasure_chest");
            }
            else
            {
                Loot.addWater(25, "surface_treasure_chest");
            }
        }   
    }
}
