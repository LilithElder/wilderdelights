package com.lilithelder.wilderdelights;

import com.axperty.delightlib.api.DelightAddon;
import com.axperty.delightlib.api.DelightApi;
import net.fabricmc.api.ModInitializer;
import net.frozenblock.wilderwild.registry.WWItems;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.SoundType;
import vectorwing.farmersdelight.common.FoodValues;

public class WilderDelights implements ModInitializer {
    public static final String MOD_ID = "wilderdelights";
    public static DelightApi addon;

    @Override
    public void onInitialize() {
        // Creative Tab Registry
        addon = DelightApi.create(MOD_ID)
                .withCreativeTab("Wilder Delights", // Sets the add-on name in the creative tab
                        () -> new ItemStack(WWItems.COCONUT)); // Sets a bread item icon

        // Prickly Pear Popsicle
        addon.food("prickly_pear_popsicle")
                .nutrition(3)
                .saturation(0.2f)
                .build();

        addon.shapedRecipe("prickly_pear_popsicle")
                .grid(" CC", "ICC", "SI ")
                .define('C', "wilderwild:peeled_prickly_pear")
                .define('I', "minecraft:ice")
                .define('S', "minecraft:stick")
                .result("wilderdelights:prickly_pear_popsicle", 1)
                .build();
        // Coconut Popsicle
        addon.food("coconut_popsicle")
                .nutrition(3)
                .saturation(0.2f)
                .build();

        addon.shapedRecipe("coconut_popsicle")
                .grid(" CC", "ICC", "SI ")
                .define('C', "wilderwild:split_coconut")
                .define('I', "minecraft:ice")
                .define('S', "minecraft:stick")
                .result("wilderdelights:coconut_popsicle", 1)
                .build();

        // Azalea Tea
        addon.food("azalea_tea")
                .nutrition(2) // Determines how many hunger points it restores
                .saturation(0.2f) // Sets the hidden value that keeps a player full longer
                .drinkable() // Sets a drinking animation and returns a glass bottle as leftover
                .withEffect(MobEffects.LUCK, FoodValues.MEDIUM_DURATION, 0, 1.0f)
                .alwaysEdible() // Allows to consume this even if the hunger bar is full
                .build(); // Registers the item

        addon.cookingRecipe("azalea_tea") // Creates a new recipes for the cooking pot
                .addIngredient("minecraft:flowering_azalea_leaves") // Adds a required ingredien
                .addIngredient("minecraft:azalea_leaves") // Adds a second required ingredient
                .addIngredient("minecraft:sugar") // Adds a third required ingredient

                // You're able to add up to six total ingredients for your recipes

                .result("wilderdelights:azalea_tea") // Sets the final item you receive when cooking finishes
                .container("minecraft:glass_bottle") // Requires a specific container to hold the cooked item
                .experience(1.0f) // Amount of XP received after cooking
                .cookingTime(200) // Sets the cook duration in ticks, 200 ticks equals 10 seconds
                .recipeBookTab("drinks") // Places this recipes into the meals category in the recipes book
                .build(); // Registers the recipes
        // Cactus Tea
        addon.food("cactus_tea")
                .nutrition(3) // Determines how many hunger points it restores
                .saturation(0.5f) // Sets the hidden value that keeps a player full longer
                .drinkable() // Sets a drinking animation and returns a glass bottle as leftover
                .withEffect(MobEffects.NAUSEA, FoodValues.BRIEF_DURATION, 0, 1.0f)
                .withEffect(MobEffects.ABSORPTION, FoodValues.MEDIUM_DURATION, 0,1.0f)
                .alwaysEdible() // Allows to consume this even if the hunger bar is full
                .build(); // Registers the item

        addon.cookingRecipe("cactus_tea") // Creates a new recipes for the cooking pot
                .addIngredient("minecraft:cactus") // Adds a required ingredien
                .addIngredient("minecraft:cactus") // Adds a second required ingredient
                .addIngredient("minecraft:sugar") // Adds a third required ingredient

                // You're able to add up to six total ingredients for your recipes

                .result("wilderdelights:cactus_tea") // Sets the final item you receive when cooking finishes
                .container("minecraft:glass_bottle") // Requires a specific container to hold the cooked item
                .experience(1.0f) // Amount of XP received after cooking
                .cookingTime(200) // Sets the cook duration in ticks, 200 ticks equals 10 seconds
                .recipeBookTab("drinks") // Places this recipes into the meals category in the recipes book
                .build(); // Registers the recipes
        // Dandelion Juice
        addon.food("dandelion_juice")
                .nutrition(2) // Determines how many hunger points it restores
                .saturation(0.2f) // Sets the hidden value that keeps a player full longer
                .drinkable() // Sets a drinking animation and returns a glass bottle as leftover
                .withEffect(MobEffects.SATURATION, FoodValues.MEDIUM_DURATION, 0, 1.0f)
                .alwaysEdible() // Allows to consume this even if the hunger bar is full
                .build(); // Registers the item

        addon.cookingRecipe("dandelion_juice") // Creates a new recipes for the cooking pot
                .addIngredient("minecraft:dandelion") // Adds a required ingredien
                .addIngredient("minecraft:dandelion") // Adds a second required ingredient
                .addIngredient("minecraft:sugar") // Adds a third required ingredient

                // You're able to add up to six total ingredients for your recipes

                .result("wilderdelights:dandelion_juice") // Sets the final item you receive when cooking finishes
                .container("minecraft:glass_bottle") // Requires a specific container to hold the cooked item
                .experience(1.0f) // Amount of XP received after cooking
                .cookingTime(200) // Sets the cook duration in ticks, 200 ticks equals 10 seconds
                .recipeBookTab("drinks") // Places this recipes into the meals category in the recipes book
                .build(); // Registers the recipes

        // Golden Apple Cider
        addon.food("golden_apple_cider")
                .nutrition(8) // Determines how many hunger points it restores
                .saturation(0.8f) // Sets the hidden value that keeps a player full longer
                .drinkable() // Sets a drinking animation and returns a glass bottle as leftover
                .withEffect(MobEffects.ABSORPTION, FoodValues.MEDIUM_DURATION, 0, 1.0f)
                .withEffect(MobEffects.REGENERATION, FoodValues.BRIEF_DURATION,0,1.0f)
                .alwaysEdible() // Allows to consume this even if the hunger bar is full
                .build(); // Registers the item

        addon.cookingRecipe("golden_apple_cider") // Creates a new recipes for the cooking pot
                .addIngredient("minecraft:golden_apple") // Adds a required ingredient
                .addIngredient("minecraft:golden_apple") // Adds a second required ingredient
                .addIngredient("minecraft:sugar") // Adds a third required ingredient

                // You're able to add up to six total ingredients for your recipes

                .result("wilderdelights:golden_apple_cider") // Sets the final item you receive when cooking finishes
                .container("minecraft:glass_bottle") // Requires a specific container to hold the cooked item
                .experience(1.5f) // Amount of XP received after cooking
                .cookingTime(200) // Sets the cook duration in ticks, 200 ticks equals 10 seconds
                .recipeBookTab("drinks") // Places this recipes into the meals category in the recipes book
                .build(); // Registers the recipes
        // Prickly Pear Juice
        addon.food("prickly_pear_juice")
                .nutrition(2) // Determines how many hunger points it restores
                .saturation(0.2f) // Sets the hidden value that keeps a player full longer
                .drinkable() // Sets a drinking animation and returns a glass bottle as leftover
                .withEffect(MobEffects.RESISTANCE, FoodValues.MEDIUM_DURATION, 0, 1.0f)
                .alwaysEdible() // Allows to consume this even if the hunger bar is full
                .build(); // Registers the item

        addon.cookingRecipe("prickly_pear_juice") // Creates a new recipes for the cooking pot
                .addIngredient("wilderwild:peeled_prickly_pear") // Adds a required ingredien
                .addIngredient("wilderwild:peeled_prickly_pear") // Adds a second required ingredient
                .addIngredient("minecraft:sugar") // Adds a third required ingredient

                // You're able to add up to six total ingredients for your recipes

                .result("wilderdelights:prickly_pear_juice") // Sets the final item you receive when cooking finishes
                .container("minecraft:glass_bottle") // Requires a specific container to hold the cooked item
                .experience(1.0f) // Amount of XP received after cooking
                .cookingTime(200) // Sets the cook duration in ticks, 200 ticks equals 10 seconds
                .recipeBookTab("drinks") // Places this recipes into the meals category in the recipes book
                .build(); // Registers the recipes        // Prickly Pear Juice
        addon.food("pink_hibiscus_tea")
                .nutrition(2)
                .saturation(0.2f)
                .drinkable()
                .withEffect(MobEffects.HEALTH_BOOST, FoodValues.MEDIUM_DURATION, 0, 1.0f)
                .alwaysEdible()
                .build();

        addon.cookingRecipe("pink_hibiscus_tea")
                .addIngredient("wilderwild:pink_hibiscus")
                .addIngredient("wilderwild:pink_hibiscus")
                .addIngredient("minecraft:sugar")
                .result("wilderdelights:pink_hibiscus_tea")
                .container("minecraft:glass_bottle")
                .experience(1.0f)
                .cookingTime(200)
                .recipeBookTab("drinks")
                .build();
        addon.food("red_hibiscus_tea")
                .nutrition(2)
                .saturation(0.2f)
                .drinkable()
                .withEffect(MobEffects.HEALTH_BOOST, FoodValues.MEDIUM_DURATION, 0, 1.0f)
                .alwaysEdible()
                .build();
        addon.cookingRecipe("red_hibiscus_tea")
                .addIngredient("wilderwild:red_hibiscus")
                .addIngredient("wilderwild:red_hibiscus")
                .addIngredient("minecraft:sugar")
                .result("wilderdelights:red_hibiscus_tea")
                .container("minecraft:glass_bottle")
                .experience(1.0f)
                .cookingTime(200)
                .recipeBookTab("drinks")
                .build();
        addon.food("purple_hibiscus_tea")
                .nutrition(2)
                .saturation(0.2f)
                .drinkable()
                .withEffect(MobEffects.HEALTH_BOOST, FoodValues.MEDIUM_DURATION, 0, 1.0f)
                .alwaysEdible()
                .build();
        addon.cookingRecipe("purple_hibiscus_tea")
                .addIngredient("wilderwild:purple_hibiscus")
                .addIngredient("wilderwild:purple_hibiscus")
                .addIngredient("minecraft:sugar")
                .result("wilderdelights:purple_hibiscus_tea")
                .container("minecraft:glass_bottle")
                .experience(1.0f)
                .cookingTime(200)
                .recipeBookTab("drinks")
                .build();
        addon.food("white_hibiscus_tea")
                .nutrition(2)
                .saturation(0.2f)
                .drinkable()
                .withEffect(MobEffects.HEALTH_BOOST, FoodValues.MEDIUM_DURATION, 0, 1.0f)
                .alwaysEdible()
                .build();
        addon.cookingRecipe("white_hibiscus_tea")
                .addIngredient("wilderwild:white_hibiscus")
                .addIngredient("wilderwild:white_hibiscus")
                .addIngredient("minecraft:sugar")
                .result("wilderdelights:white_hibiscus_tea")
                .container("minecraft:glass_bottle")
                .experience(1.0f)
                .cookingTime(200)
                .recipeBookTab("drinks")
                .build();
        addon.food("yellow_hibiscus_tea")
                .nutrition(2)
                .saturation(0.2f)
                .drinkable()
                .withEffect(MobEffects.HEALTH_BOOST, FoodValues.MEDIUM_DURATION, 0, 1.0f)
                .alwaysEdible()
                .build();
        addon.cookingRecipe("yellow_hibiscus_tea")
                .addIngredient("wilderwild:yellow_hibiscus")
                .addIngredient("wilderwild:yellow_hibiscus")
                .addIngredient("minecraft:sugar")
                .result("wilderdelights:yellow_hibiscus_tea")
                .container("minecraft:glass_bottle")
                .experience(1.0f)
                .cookingTime(200)
                .recipeBookTab("drinks")
                .build();
        addon.food("marigold_syrup")
                .nutrition(2)
                .saturation(0.2f)
                .drinkable()
                .withEffect(MobEffects.STRENGTH, FoodValues.MEDIUM_DURATION, 0, 1.0f)
                .withEffect(MobEffects.SPEED, FoodValues.MEDIUM_DURATION, 0, 1.0f)
                .alwaysEdible()
                .build();
        addon.cookingRecipe("marigold_syrup")
                .addIngredient("wilderwild:marigold")
                .addIngredient("wilderwild:marigold")
                .addIngredient("minecraft:sugar")
                .result("wilderdelights:marigold_syrup")
                .container("minecraft:glass_bottle")
                .experience(1.0f)
                .cookingTime(200)
                .recipeBookTab("drinks")
                .build();

        //Risotto
        addon.food("risotto") // Creates a stew
                .nutrition(7) // Determines how many hunger points it restores
                .saturation(0.4f) // Sets the hidden value that keeps a player full longer
                .bowlFood() // Returns a bowl after eating
                .build(); // Registers the item

        addon.cookingRecipe("risotto") // Creates a new recipes for the cooking pot
                .addTagIngredient("c:crops/rice") // Adds a required ingredient
                .addIngredient("minecraft:carrot") // Adds a second required ingredient
                .addTagIngredient("c:crops/onion") // Adds a third required ingredient

                // You're able to add up to six total ingredients for your recipes

                .result("wilderdelights:risotto") // Sets the final item you receive when cooking finishes
                .container("minecraft:bowl") // Requires a specific container to hold the cooked item
                .experience(1.0f) // Amount of XP received after cooking
                .cookingTime(200) // Sets the cook duration in ticks, 200 ticks equals 10 seconds
                .recipeBookTab("meals") // Places this recipes into the meals category in the recipes book
                .build(); // Registers the recipes
        //Coconut Curry
        addon.food("coconut_curry") // Creates a stew
                .nutrition(15) // Determines how many hunger points it restores
                .saturation(0.9f) // Sets the hidden value that keeps a player full longer
                .bowlFood() // Returns a bowl after eating
                .build(); // Registers the item

        addon.cookingRecipe("coconut_curry") // Creates a new recipes for the cooking pot
                .addTagIngredient("c:crops/rice") // Adds a required ingredient
                .addIngredient("wilderwild:split_coconut") // Adds a second required ingredient
                .addTagIngredient("c:crops/onion") // Adds a third required ingredient
                .addTagIngredient("c:foods/raw_chicken")

                // You're able to add up to six total ingredients for your recipes

                .result("wilderdelights:coconut_curry") // Sets the final item you receive when cooking finishes
                .container("minecraft:bowl") // Requires a specific container to hold the cooked item
                .experience(1.0f) // Amount of XP received after cooking
                .cookingTime(200) // Sets the cook duration in ticks, 200 ticks equals 10 seconds
                .recipeBookTab("meals") // Places this recipes into the meals category in the recipes book
                .build(); // Registers the recipes
        //WW Cabinets
        addon.cabinet("baobab_cabinet") // Creates a cabinet
                .soundType(SoundType.WOOD) // Plays wood sound when broken
                .burnTime(300) // Allows the cabinet be used as fuel, 300 ticks equals 15 seconds
                .recipe(b -> b.grid("OOO", "T T", "OOO") // Defines the exact crafting shape in the crafting table
                        .define('O', "wilderwild:baobab_slab") // Tells the game what item the letter O represents
                        .define('T', "wilderwild:baobab_trapdoor")) // Tells the game what item the letter T represents
                .build(); // Registers the cabinet
        addon.cabinet("cypress_cabinet")
                .soundType(SoundType.WOOD)
                .burnTime(300)
                .recipe(b -> b.grid("OOO", "T T", "OOO")
                        .define('O', "wilderwild:cypress_slab")
                        .define('T', "wilderwild:cypress_trapdoor"))
                .build(); // Registers the cabinet
        addon.cabinet("maple_cabinet")
                .soundType(SoundType.WOOD)
                .burnTime(300)
                .recipe(b -> b.grid("OOO", "T T", "OOO")
                        .define('O', "wilderwild:maple_slab")
                        .define('T', "wilderwild:maple_trapdoor"))
                .build(); // Registers the cabinet
        addon.cabinet("palm_cabinet")
                .soundType(SoundType.WOOD)
                .burnTime(300)
                .recipe(b -> b.grid("OOO", "T T", "OOO")
                        .define('O', "wilderwild:palm_slab")
                        .define('T', "wilderwild:palm_trapdoor"))
                .build(); // Registers the cabinet
        addon.cabinet("willow_cabinet")
                .soundType(SoundType.WOOD)
                .burnTime(300)
                .recipe(b -> b.grid("OOO", "T T", "OOO")
                        .define('O', "wilderwild:willow_slab")
                        .define('T', "wilderwild:willow_trapdoor"))
                .build(); // Registers the cabinet
        //WW Crates
        addon.crate("coconut_crate") // Creates a crate
                .recipe(b -> b.grid("CCC", "CCC", "CCC") // Defines the exact crafting shape in the crafting table
                        .define('C', "wilderwild:coconut")) // Tells the game what item the letter C represents
                .build(); // Registers the crate
        addon.shapelessRecipe("coconut") // Creates a shapeless recipe
                .addIngredient("wilderdelights:coconut_crate") // Adds a required ingredient
                .result("wilderwild:coconut", 9) // Sets the final item you receive and the amount
                .build(); // Registers the recipe
        addon.crate("baobab_nut_crate") // Creates a crate
                .recipe(b -> b.grid("CCC", "CCC", "CCC") // Defines the exact crafting shape in the crafting table
                        .define('C', "wilderwild:baobab_nut")) // Tells the game what item the letter C represents
                .build(); // Registers the crate
        addon.shapelessRecipe("baobab_nut") // Creates a shapeless recipe
                .addIngredient("wilderdelights:baobab_nut_crate") // Adds a required ingredient
                .result("wilderwild:baobab_nut", 9) // Sets the final item you receive and the amount
                .build(); // Registers the recipe
        addon.crate("prickly_pear_crate") // Creates a crate
                .recipe(b -> b.grid("CCC", "CCC", "CCC") // Defines the exact crafting shape in the crafting table
                        .define('C', "wilderwild:prickly_pear")) // Tells the game what item the letter C represents
                .build(); // Registers the crate
        addon.shapelessRecipe("prickly_pear") // Creates a shapeless recipe
                .addIngredient("wilderdelights:prickly_pear_crate") // Adds a required ingredient
                .result("wilderwild:prickly_pear", 9) // Sets the final item you receive and the amount
                .build(); // Registers the recipe

        addon.build();
    }
}