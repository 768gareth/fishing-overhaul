package FishingOverhaul;

import FishingOverhaul.Registry.RegisterExpeditions;
import FishingOverhaul.Registry.RegisterItems;
import necesse.engine.modLoader.annotations.ModEntry;

@ModEntry
public class FishingOverhaul 
{
    public void init() 
    {
        System.out.println("[Fishing Overhaul] Initialising mod...");
        
        RegisterItems.Register();
        RegisterExpeditions.Register();
    }
}
