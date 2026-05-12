package FishingOverhaul.Items;

import necesse.engine.localization.Localization;
import necesse.engine.network.gameNetworkData.GNDItemMap;
import necesse.engine.util.GameBlackboard;
import necesse.engine.util.GameRandom;
import necesse.entity.mobs.PlayerMob;
import necesse.entity.mobs.itemAttacker.ItemAttackSlot;
import necesse.entity.mobs.itemAttacker.ItemAttackerMob;
import necesse.entity.pickup.ItemPickupEntity;
import necesse.gfx.gameTooltips.ListGameTooltips;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.placeableItem.PlaceableItem;
import necesse.inventory.lootTable.LootList;
import necesse.level.maps.Level;

public class TreasureChestItem extends PlaceableItem
{
    LootList Options;
    int LootCoins;
    
    public TreasureChestItem(LootList LootOptions, int CoinLootValue, Rarity ChestRarity) 
    {
        super(99, true);
        this.rarity = ChestRarity;
        this.Options = LootOptions;
        this.LootCoins = CoinLootValue;
    }

    public InventoryItem onAttack(Level level, int x, int y, ItemAttackerMob attackerMob, int attackHeight, InventoryItem item, ItemAttackSlot slot, int animAttack, int seed, GNDItemMap mapContent)
    {
        InventoryItem TreasureItem = Options.getCombinedItemsAndCustomItems().get(GameRandom.globalRandom.getIntBetween(0, Options.getCombinedItemsAndCustomItems().size() - 1));
        InventoryItem Coins = new InventoryItem("coin", GameRandom.globalRandom.getIntBetween((int)(LootCoins / 1.2), (int)(LootCoins / 0.8)));
        ItemPickupEntity CoinPickup = Coins.getPickupEntity(level, attackerMob.x, attackerMob.y);
        ItemPickupEntity TreasurePickup = TreasureItem.getPickupEntity(level, attackerMob.x, attackerMob.y);
        level.entityManager.pickups.add(CoinPickup);
        level.entityManager.pickups.add(TreasurePickup);
        item.setAmount(item.getAmount() - 1);
        return item;
    }

    public ListGameTooltips getTooltips(InventoryItem item, PlayerMob perspective, GameBlackboard blackboard) {
      ListGameTooltips tooltips = super.getTooltips(item, perspective, blackboard);
      tooltips.add(Localization.translate("itemtooltip", "treasure_chest"));
      tooltips.add(Localization.translate("itemtooltip", "chest_tip"));
      return tooltips;
   }
}
