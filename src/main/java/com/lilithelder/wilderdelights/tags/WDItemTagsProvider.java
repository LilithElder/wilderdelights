package com.lilithelder.wilderdelights.tags;

import com.lilithelder.wilderdelights.mushroom.WDPaleMushroomColony;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.frozenblock.wilderwild.registry.WWBlocks;
import net.frozenblock.wilderwild.registry.WWItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Item;
import vectorwing.farmersdelight.common.registry.ModItems;
import vectorwing.farmersdelight.common.tag.ModTags;

import java.util.concurrent.CompletableFuture;

public class WDItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public WDItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        valueLookupBuilder(ModTags.Items.SERVING_CONTAINERS)
                .add(ModItems.COOKED_RICE.get())
        ;
        valueLookupBuilder(WDTags.Items.Prickly_Pear_Foods)
                .add(WWItems.PRICKLY_PEAR)
                .add(WWItems.PEELED_PRICKLY_PEAR)
        ;
        valueLookupBuilder(WDTags.Items.Hibiscus)
                .add(WWBlocks.PINK_HIBISCUS.asItem())
                .add(WWBlocks.RED_HIBISCUS.asItem())
                .add(WWBlocks.PURPLE_HIBISCUS.asItem())
                .add(WWBlocks.YELLOW_HIBISCUS.asItem())
                .add(WWBlocks.WHITE_HIBISCUS.asItem())
        ;
        valueLookupBuilder(ConventionalItemTags.MUSHROOMS)
                .add(WWBlocks.PALE_MUSHROOM.asItem())
        ;
        valueLookupBuilder(ModTags.Items.MUSHROOM_COLONIES)
                .add(WDPaleMushroomColony.Pale_Mushroom_Colony_Item)
        ;
    }
}
