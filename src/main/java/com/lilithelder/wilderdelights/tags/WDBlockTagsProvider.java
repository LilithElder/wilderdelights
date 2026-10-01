package com.lilithelder.wilderdelights.tags;

import com.lilithelder.wilderdelights.mushroom.WDPaleMushroomColony;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.frozenblock.wilderwild.registry.WWBlocks;
import net.minecraft.core.HolderLookup;
import vectorwing.farmersdelight.common.tag.ModTags;

import java.util.concurrent.CompletableFuture;

public class WDBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public WDBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        valueLookupBuilder(WDTags.Blocks.Hibiscus)
                .add(WWBlocks.RED_HIBISCUS)
                .add(WWBlocks.PURPLE_HIBISCUS)
                .add(WWBlocks.YELLOW_HIBISCUS)
                .add(WWBlocks.WHITE_HIBISCUS)
                .add(WWBlocks.PINK_HIBISCUS)
        ;
        valueLookupBuilder(ModTags.Blocks.UNAFFECTED_BY_RICH_SOIL)
                .add(WDPaleMushroomColony.Pale_Mushroom_Colony)
        ;
        valueLookupBuilder(ModTags.Blocks.COMPOST_ACTIVATORS)
                .add(WWBlocks.PALE_MUSHROOM)
        ;
        valueLookupBuilder(ModTags.Blocks.MUSHROOM_COLONIES)
                .add(WDPaleMushroomColony.Pale_Mushroom_Colony)
        ;
    }

}
