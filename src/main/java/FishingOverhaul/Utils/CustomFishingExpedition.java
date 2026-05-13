package FishingOverhaul.Utils;

import java.util.List;

import necesse.engine.expeditions.SettlerExpedition;
import necesse.engine.localization.message.GameMessage;
import necesse.engine.localization.message.LocalMessage;
import necesse.engine.util.GameRandom;
import necesse.entity.mobs.friendly.human.HumanMob;
import necesse.inventory.InventoryItem;
import necesse.inventory.lootTable.LootList;
import necesse.inventory.lootTable.LootTable;
import necesse.level.maps.levelData.settlementData.ServerSettlementData;

public class CustomFishingExpedition extends SettlerExpedition 
{
   public String ExpeditionQuestTier;
   public int ExpeditionBaseCost;
   public LootTable ExpeditionLootOptions;

   public CustomFishingExpedition(LootTable LootOptions, int BaseCost, String QuestTier)
   {
        this.ExpeditionLootOptions = LootOptions;
        this.ExpeditionBaseCost = BaseCost;
        this.ExpeditionQuestTier = QuestTier;
   }

   public GameMessage getUnavailableMessage() 
   {
      return new LocalMessage("expedition", "completequests");
   }

   public float getSuccessChance(ServerSettlementData settlement) 
   {
      return SettlerExpedition.questProgressSuccessChance(settlement, ExpeditionQuestTier);
   }

   public int getBaseCost(ServerSettlementData settlement) 
   {
      return ExpeditionBaseCost;
   }

   public List<InventoryItem> getRewardItems(ServerSettlementData settlement, HumanMob mob) 
   {
      return ExpeditionLootOptions.getNewList(GameRandom.globalRandom, 1.0F, new Object[0]);
   }

   public List<InventoryItem> getItemIcons() 
   {
      LootList IconList = new LootList();
      ExpeditionLootOptions.addPossibleLoot(IconList, new Object[0]);
      return IconList.getCombinedItemsAndCustomItems();
   }
}
