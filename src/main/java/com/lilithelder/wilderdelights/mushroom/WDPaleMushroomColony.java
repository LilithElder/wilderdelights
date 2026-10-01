package com.lilithelder.wilderdelights.mushroom;

import com.lilithelder.wilderdelights.WilderDelights;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.frozenblock.wilderwild.registry.WWBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import vectorwing.farmersdelight.common.block.MushroomColonyBlock;
import vectorwing.farmersdelight.common.item.MushroomColonyItem;

import java.util.function.Function;

public class WDPaleMushroomColony {
    public static final Holder<Item> Pale_Mushroom = WWBlocks.PALE_MUSHROOM.asItem().builtInRegistryHolder();

    public static final Block Pale_Mushroom_Colony = registerBlockWithoutBlockItem("pale_mushroom_colony",
            (properties) -> new MushroomColonyBlock(WDPaleMushroomColony.Pale_Mushroom,properties.mapColor(MapColor.COLOR_GRAY).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).postProcess(Blocks::postProcessSelf).pushReaction(PushReaction.DESTROY)));
    public static final Item Pale_Mushroom_Colony_Item = registerItem("pale_mushroom_colony_item", properties -> new MushroomColonyItem(WDPaleMushroomColony.Pale_Mushroom_Colony, properties.useItemDescriptionPrefix()));

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(WilderDelights.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(WilderDelights.MOD_ID, name)))));
    }

    private static Block registerBlockWithoutBlockItem(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(WilderDelights.MOD_ID, name))));
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(WilderDelights.MOD_ID, name), toRegister);
    }

    public static void registerModBlocks() {
        WilderDelights.LOGGER.info("Registering Mod Blocks for " + WilderDelights.MOD_ID);
    }
    public static void registerModItems() {
        WilderDelights.LOGGER.info("Registering Mod Items for " + WilderDelights.MOD_ID);


        CreativeModeTabEvents.modifyOutputEvent(WDPaleMushroomColony.Wilder_Delights_Tab_Key).register(output -> {
            output.accept(Pale_Mushroom_Colony_Item);
        });
    }

    public static final ResourceKey<CreativeModeTab> Wilder_Delights_Tab_Key = createKey("wilder_delights");

    private static ResourceKey<CreativeModeTab> createKey(final String id) {
        return ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.withDefaultNamespace(id));
    }
}

