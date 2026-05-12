package FishingOverhaul.Patches;

import necesse.engine.modLoader.annotations.ModMethodPatch;
import necesse.engine.registries.ExpeditionMissionRegistry;

@ModMethodPatch(target = ExpeditionMissionRegistry.class, name = "registerCore", arguments = {})
public class ExpeditionRegistrationPatch 
{
    
}
