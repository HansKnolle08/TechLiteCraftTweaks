package net.hansisi.tlmc.item;

import net.hansisi.tlmc.TLMCMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TLMCMod.MOD_ID);

    public static final RegistryObject<Item> TLMC_STAR = ITEMS.register("tlmc_star",
            () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> TLMC_INGOT = ITEMS.register("tlmc_ingot",
            () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

