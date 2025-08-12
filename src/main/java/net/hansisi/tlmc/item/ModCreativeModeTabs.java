package net.hansisi.tlmc.item;

import net.hansisi.tlmc.TLMCMod;
import net.hansisi.tlmc.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TLMCMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TLMC_TAB = CREATIVE_MODE_TABS.register("tlmc_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TLMC_STAR.get()))
                    .title(Component.translatable("creativetab.tlmc_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.TLMC_STAR.get());
                        pOutput.accept(ModItems.TLMC_INGOT.get());
                        pOutput.accept(ModBlocks.TLMC_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
