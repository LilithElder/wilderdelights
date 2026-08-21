package com.lilithelder.wilderdelights;

import com.axperty.delightlib.api.DelightAddon;
import com.axperty.delightlib.api.DelightApi;
import com.axperty.delightlib.api.FoodDuration;
import net.fabricmc.api.ModInitializer;
import net.frozenblock.wilderwild.registry.WWItems;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.SoundType;
import vectorwing.farmersdelight.common.FoodValues;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class WilderDelights implements ModInitializer {
    public static final String MOD_ID = "wilderdelights";
    public static DelightApi addon;

    @Override
    public void onInitialize() {
        // Creative Tab Registry
        addon = DelightApi.create(MOD_ID)
                .withCreativeTab("Wilder Delights", // Sets the add-on name in the creative tab
                        () -> new ItemStack(WWItems.SPLIT_COCONUT)); // Sets a bread item icon

        addon.food("prickly_pear_popsicle")
                .nutrition(3)
                .saturation(0.2f)
                .build();
        addon.shapedRecipe("prickly_pear_popsicle")
                .grid(" CC", "ICC", "SI ")
                .defineTag('C', "c:foods/prickly_pear")
                .define('I', "minecraft:ice")
                .define('S', "minecraft:stick")
                .result("wilderdelights:prickly_pear_popsicle", 1)
                .build();

        addon.food("coconut_popsicle")
                .nutrition(3)
                .saturation(0.2f)
                .build();
        addon.shapedRecipe("coconut_popsicle")
                .grid(" CC", "ICC", "SI ")
                .define('C', "wilderdelights:coconut_milk")
                .define('I', "minecraft:ice")
                .define('S', "minecraft:stick")
                .result("wilderdelights:coconut_popsicle", 1)
                .build();

        addon.food("prickly_pear_hibiscus_agua_fresca")
                .nutrition(2)
                .saturation(0.2f)
                .drinkable()
                .withEffect(MobEffects.RESISTANCE, FoodValues.MEDIUM_DURATION, 0, 1.0f)
                .alwaysEdible()
                .build();
        addon.cookingRecipe("prickly_pear_hibiscus_agua_fresca")
                .addTagIngredient("c:foods/prickly_pear")
                .addTagIngredient("c:hibiscus")
                .addIngredient("minecraft:sugar")
                .result("wilderdelights:prickly_pear_hibiscus_agua_fresca",1)
                .container("minecraft:glass_bottle")
                .experience(1.0f)
                .cookingTime(200)
                .recipeBookTab("drinks")
                .build();

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

        addon.food("baobab_drink")
                .nutrition(2)
                .saturation(0.2f)
                .drinkable()
                .withEffect(MobEffects.HASTE, FoodValues.MEDIUM_DURATION, 0, 1.0f)
                .alwaysEdible()
                .build();
        addon.cookingRecipe("baobab_drink")
                .addIngredient("wilderwild:baobab_nut")
                .addTagIngredient("c:drinks/milk")
                .addIngredient("minecraft:sugar")
                .result("wilderdelights:baobab_drink")
                .container("minecraft:glass_bottle")
                .experience(1.0f)
                .cookingTime(200)
                .recipeBookTab("drinks")
                .build();

        addon.food("coconut_water")
                .nutrition(2)
                .saturation(0.2f)
                .drinkable()
                .withEffect(MobEffects.WATER_BREATHING, FoodValues.MEDIUM_DURATION, 0, 1.0f)
                .alwaysEdible()
                .build();
        addon.shapelessRecipe("coconut_water")
                .addIngredient("wilderwild:split_coconut")
                .addIngredient("minecraft:glass_bottle")
                .result("wilderdelights:coconut_water")
                .build();

        addon.food("coconut_flakes")
                .build();

        addon.food("coconut_milk")
                .drinkable()
                .build();
        addon.cookingRecipe("coconut_milk")
                .addIngredient("wilderwild:split_coconut")
                .result("wilderdelights:coconut_milk")
                .container("minecraft:glass_bottle")
                .experience(1.0f)
                .cookingTime(200)
                .recipeBookTab("drinks")
                .build();

        addon.food("coconut_cookie")
                .nutrition(2)
                .saturation(0.1f)
                .fast()
                .build();
        addon.shapelessRecipe("coconut_cookie")
                .addIngredient("wilderdelights:coconut_flakes")
                .addTagIngredient("c:crops/wheat")
                .addTagIngredient("c:crops/wheat")
                .result("wilderdelights:coconut_cookie", 8)
                .build();

        addon.food("coconut_macaroon")
                .nutrition(7)
                .saturation(0.6f)
                .fast()
                .build();
        addon.cookingRecipe("coconut_macaroon")
                .addIngredient("wilderdelights:coconut_flakes")
                .addTagIngredient("c:eggs")
                .addIngredient("minecraft:sugar")
                .addIngredient("minecraft:cocoa_beans")
                .result("wilderdelights:coconut_macaroon",1)
                .experience(1.0f)
                .cookingTime(200)
                .recipeBookTab("meals")
                .build();

        addon.food("coconut_noodle_soup")
                .nutrition(12)
                .saturation(0.75f)
                .withNourishment(FoodDuration.MEDIUM)
                .bowlFood()
                .build();
        addon.cookingRecipe("coconut_noodle_soup")
                .addIngredient("wilderdelights:coconut_milk")
                .addTagIngredient("c:foods/pasta")
                .addTagIngredient("c:foods/vegetable")
                .addTagIngredient("c:mushrooms")
                .result("wilderdelights:coconut_noodle_soup",1)
                .container("minecraft:bowl")
                .experience(1.0f)
                .cookingTime(200)
                .recipeBookTab("meals")
                .build();

        addon.food("coconut_curry")
                .nutrition(15)
                .saturation(0.9f)
                .withNourishment(FoodDuration.LONG)
                .bowlFood()
                .build();
        addon.cookingRecipe("coconut_curry")
                .addIngredient("wilderdelights:coconut_milk")
                .addTagIngredient("c:crops/onion")
                .addTagIngredient("c:foods/raw_chicken")
                .result("wilderdelights:coconut_curry",1)
                .container("farmersdelight:cooked_rice")
                .experience(1.0f)
                .cookingTime(200)
                .recipeBookTab("meals")
                .build();

        addon.placeableFood("coconut_pie")
                .pie("coconut_pie_slice")
                .build();
        addon.food("coconut_pie_slice")
                .nutrition(6)
                .saturation(0.6f)
                .build();
        addon.shapedRecipe("coconut_pie")
                .grid("WWW", "BBB", "SPS")
                .define('W', "wilderdelights:coconut_flakes")
                .define('S', "minecraft:sugar")
                .define('P', "farmersdelight:pie_crust")
                .define('B', "wilderdelights:coconut_milk")
                .result("wilderdelights:coconut_pie")
                .build();
        addon.shapedRecipe("coconut_pie_from_slices")
                .grid("BB ", "BB ")
                .define('B', "wilderdelights:coconut_pie_slice")
                .result("wilderdelights:coconut_pie")
                .build();

        addon.food("tenderloin_with_prickly_pear_sauce")
                .nutrition(14)
                .saturation(0.75f)
                .withNourishment(FoodDuration.MEDIUM)
                .bowlFood()
                .build();
        addon.cookingRecipe("tenderloin_with_prickly_pear_sauce")
                .addTagIngredient("c:foods/raw_meat")
                .addTagIngredient("c:foods/prickly_pear")
                .addTagIngredient("c:crops/potato")
                .result("wilderdelights:tenderloin_with_prickly_pear_sauce")
                .container("minecraft:bowl")
                .experience(1.0f)
                .cookingTime(200)
                .recipeBookTab("meals")
                .build();

        addon.food("crab_boil")
                .nutrition(12)
                .saturation(0.8f)
                .withNourishment(FoodDuration.MEDIUM)
                .bowlFood()
                .build();
        addon.cookingRecipe("crab_boil")
                .addIngredient("wilderwild:crab_claw")
                .addTagIngredient("c:crops/potato")
                .addTagIngredient("c:crops/onion")
                .addTagIngredient("c:crops/tomato")
                .result("wilderdelights:crab_boil")
                .container("minecraft:bowl")
                .experience(1.0f)
                .cookingTime(200)
                .recipeBookTab("meals")
                .build();

        addon.food("surf_and_turf_sandwich")
                .nutrition(15)
                .saturation(0.9f)
                .withEffect(MobEffects.DOLPHINS_GRACE, FoodValues.MEDIUM_DURATION,0,1.0F)
                .build();
        addon.shapelessRecipe("surf_and_turf_sandwich")
                .addIngredient("wilderwild:cooked_crab_claw")
                .addTagIngredient("c:foods/cooked_meat")
                .addTagIngredient("c:foods/leafy_green")
                .addTagIngredient("c:foods/bread")
                .result("wilderdelights:surf_and_turf_sandwich", 1)
                .build();

        //Cabinets
        addon.cabinet("baobab_cabinet")
                .soundType(SoundType.WOOD)
                .burnTime(300)
                .recipe(b -> b.grid("OOO", "T T", "OOO")
                        .define('O', "wilderwild:baobab_slab")
                        .define('T', "wilderwild:baobab_trapdoor"))
                .build();
        addon.cabinet("cypress_cabinet")
                .soundType(SoundType.WOOD)
                .burnTime(300)
                .recipe(b -> b.grid("OOO", "T T", "OOO")
                        .define('O', "wilderwild:cypress_slab")
                        .define('T', "wilderwild:cypress_trapdoor"))
                .build();
        addon.cabinet("maple_cabinet")
                .soundType(SoundType.WOOD)
                .burnTime(300)
                .recipe(b -> b.grid("OOO", "T T", "OOO")
                        .define('O', "wilderwild:maple_slab")
                        .define('T', "wilderwild:maple_trapdoor"))
                .build();
        addon.cabinet("palm_cabinet")
                .soundType(SoundType.WOOD)
                .burnTime(300)
                .recipe(b -> b.grid("OOO", "T T", "OOO")
                        .define('O', "wilderwild:palm_slab")
                        .define('T', "wilderwild:palm_trapdoor"))
                .build();
        addon.cabinet("willow_cabinet")
                .soundType(SoundType.WOOD)
                .burnTime(300)
                .recipe(b -> b.grid("OOO", "T T", "OOO")
                        .define('O', "wilderwild:willow_slab")
                        .define('T', "wilderwild:willow_trapdoor"))
                .build();

        // Crates
        addon.crate("coconut_crate")
                .recipe(b -> b.grid("CCC", "CCC", "CCC")
                .define('C', "wilderwild:coconut"))
                .build();
        addon.shapelessRecipe("coconut")
                .addIngredient("wilderdelights:coconut_crate")
                .result("wilderwild:coconut", 9)
                .build();
        addon.crate("baobab_nut_crate")
                .recipe(b -> b.grid("CCC", "CCC", "CCC")
                .define('C', "wilderwild:baobab_nut"))
                .build();
        addon.shapelessRecipe("baobab_nut")
                .addIngredient("wilderdelights:baobab_nut_crate")
                .result("wilderwild:baobab_nut", 9)
                .build();
        addon.crate("prickly_pear_crate")
                .recipe(b -> b.grid("CCC", "CCC", "CCC")
                .define('C', "wilderwild:prickly_pear"))
                .build();
        addon.shapelessRecipe("prickly_pear")
                .addIngredient("wilderdelights:prickly_pear_crate")
                .result("wilderwild:prickly_pear", 9)
                .build();

        addon.build();
    }
}