package FishingOverhaul.Items;

import necesse.engine.localization.Localization;
import necesse.engine.util.GameBlackboard;
import necesse.entity.mobs.PlayerMob;
import necesse.gfx.gameTooltips.ListGameTooltips;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.matItem.FishItem;

public class UniqueFishItem extends FishItem
{
    public String DescriptionKey;

    public UniqueFishItem(String DescriptionTooltipKey, Rarity ItemRarity) 
    {
        super(999, ItemRarity, new String[0]);
        DescriptionKey = DescriptionTooltipKey;
    }

    public ListGameTooltips getTooltips(InventoryItem item, PlayerMob perspective, GameBlackboard blackboard) 
    {
      ListGameTooltips tooltips = super.getTooltips(item, perspective, blackboard);
      tooltips.add(Localization.translate("itemtooltip", "craftingmat"));
      tooltips.add(Localization.translate("itemtooltip", DescriptionKey));
      return tooltips;
    }
}
