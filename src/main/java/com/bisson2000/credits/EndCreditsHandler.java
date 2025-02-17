package com.bisson2000.credits;

import com.bisson2000.creditsbegone.CreditsBeGone;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CreditsBeGone.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EndCreditsHandler {

    @SubscribeEvent
    public static void onPlayerJoin(PlayerEvent.PlayerLoggedInEvent event) {
        if (event.getEntity() instanceof  ServerPlayer serverPlayer) {
            serverPlayer.seenCredits = true;
        }
    }

}
