package me.cg360.mod.bridging;

import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BridgingMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class BridgingModForgeHooks {

    @SubscribeEvent
    public void registerBindings(RegisterKeyMappingsEvent event) {
        BridgingKeyMappings.forEachKeybindingDo(event::register);
    }

}
