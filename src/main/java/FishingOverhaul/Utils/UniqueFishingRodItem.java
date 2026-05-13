package FishingOverhaul.Utils;

import necesse.engine.localization.Localization;
import necesse.engine.util.GameBlackboard;
import necesse.entity.mobs.PlayerMob;
import necesse.gfx.gameTooltips.ListGameTooltips;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.placeableItem.fishingRodItem.FishingRodItem;

public class UniqueFishingRodItem extends FishingRodItem
{
    public String DescriptionKey;

    public UniqueFishingRodItem(String DescriptionTooltipKey, int FishingPower, int PoleWidth, int PoleHeight, int Lines, int ReelWindow, int Precision, Rarity ItemRarity) 
    {
        super(FishingPower, PoleWidth, PoleHeight, 90, 200, Lines, ReelWindow, Precision, ItemRarity);
        DescriptionKey = DescriptionTooltipKey;
    }

    public ListGameTooltips getTooltips(InventoryItem item, PlayerMob perspective, GameBlackboard blackboard) {
      ListGameTooltips tooltips = super.getTooltips(item, perspective, blackboard);
      tooltips.add(Localization.translate("itemtooltip", "fishingrodtip"));
      tooltips.add(Localization.translate("itemtooltip", DescriptionKey));
      tooltips.add(Localization.translate("itemtooltip", "fishingpower", "value", this.fishingPower + "%"));
      if (this.lineCount != 1) {
         tooltips.add(Localization.translate("itemtooltip", "fishinglines", "value", this.lineCount > 0 ? "+" + (this.lineCount - 1) : this.lineCount));
      }

      int baitAmount = this.getAvailableBait(perspective);
      tooltips.add(Localization.translate("itemtooltip", "baitamounttip", "value", baitAmount));
      return tooltips;
   }
}
