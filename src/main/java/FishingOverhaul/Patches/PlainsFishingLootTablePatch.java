package FishingOverhaul.Patches;

import necesse.engine.modLoader.annotations.ModMethodPatch;
import necesse.level.maps.biomes.FishingLootTable;
import necesse.level.maps.biomes.FishingSpot;
import necesse.level.maps.biomes.plains.PlainsBiome;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.asm.Advice.OnMethodExit;
import net.bytebuddy.asm.Advice.This;

@ModMethodPatch(target = PlainsBiome.class, name = "getFishingLootTable", arguments = {FishingSpot.class})
public class PlainsFishingLootTablePatch 
{
    @OnMethodExit
    static void onExit(@This PlainsBiome Biome, @Advice.Argument(0) FishingSpot Spot, @Advice.Return(readOnly = false) FishingLootTable Loot)
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
                Loot.addWater(100, "plains_caves_treasure_chest");
            }
            else
            {
                Loot.addWater(25, "plains_caves_treasure_chest");
            }
        }
        else if (Spot.tile.level.isDeepCaveLevel())
        {
            if ("treasure_bait".equals(Spot.bait.getStringID()))
            {
                Loot.addWater(100, "deep_plains_caves_treasure_chest");
            }
            else
            {
                Loot.addWater(25, "deep_plains_caves_treasure_chest");
            }
        }
    }
}
