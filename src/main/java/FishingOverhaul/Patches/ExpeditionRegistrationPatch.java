package FishingOverhaul.Patches;

import necesse.engine.modLoader.annotations.ModMethodPatch;
import necesse.engine.registries.ExpeditionMissionRegistry;
import net.bytebuddy.asm.Advice.OnMethodExit;
import net.bytebuddy.asm.Advice.This;

@ModMethodPatch(target = ExpeditionMissionRegistry.class, name = "registerCore", arguments = {})
public class ExpeditionRegistrationPatch 
{
    @OnMethodExit
    static void onExit(@This ExpeditionMissionRegistry Registry)
    {
        ExpeditionMissionRegistry.fishingTripIDs.clear();
        
    }

}
