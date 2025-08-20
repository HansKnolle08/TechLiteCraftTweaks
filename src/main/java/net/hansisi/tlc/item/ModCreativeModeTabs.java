package net.hansisi.tlc.item;

import net.hansisi.tlc.TLCMod;
import net.hansisi.tlc.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TLCMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TLC_TAB = CREATIVE_MODE_TABS.register("tlc_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TLC_STAR.get()))
                    .title(Component.translatable("creativetab.tlc_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.TLC_STAR.get());
                        pOutput.accept(ModItems.TLC_INGOT.get());
                        pOutput.accept(ModBlocks.TLC_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
