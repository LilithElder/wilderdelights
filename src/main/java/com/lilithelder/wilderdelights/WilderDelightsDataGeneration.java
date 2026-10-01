package com.lilithelder.wilderdelights;

import com.axperty.delightlib.api.DelightAddon;
import com.axperty.delightlib.api.DelightApi;
import com.axperty.delightlib.internal.DelightDataGenerator;
import com.lilithelder.wilderdelights.mushroom.WDBlockLoot;
import com.lilithelder.wilderdelights.tags.WDBlockTagsProvider;
import com.lilithelder.wilderdelights.tags.WDItemTagsProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class WilderDelightsDataGeneration implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        var pack = fabricDataGenerator.createPack();

        FabricDataGenerator.Pack pack1= fabricDataGenerator.createPack();
        DelightApi addon = WilderDelights.addon;

        pack1.addProvider((output, registries) -> new DelightDataGenerator(output, (DelightAddon) addon));
        pack.addProvider(WDItemTagsProvider::new);
        pack.addProvider(WDBlockTagsProvider::new);
        pack.addProvider(WDBlockLoot::new);
    }
}