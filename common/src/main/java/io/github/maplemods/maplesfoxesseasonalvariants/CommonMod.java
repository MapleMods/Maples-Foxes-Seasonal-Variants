package io.github.maplemods.maplesfoxesseasonalvariants;

import io.github.maplemods.sapling.functions.RegisterFunctions;
import io.github.maplemods.maplesfoxesseasonalvariants.data.Constants;
import net.minecraft.world.entity.EntityType;

public class CommonMod {

    public static void init() {
        Constants.LOG.info("[" + Constants.MOD_NAME + "] Loaded " + Constants.MOD_NAME + " version " + Constants.MOD_VERSION + ".");

        RegisterFunctions.registerCategory(Constants.MOD_ID, "spring", "season", 3, 1, 5, 31);
        RegisterFunctions.registerCategory(Constants.MOD_ID, "summer", "season", 6, 1, 8, 31);
        RegisterFunctions.registerCategory(Constants.MOD_ID, "autumn", "season", 9, 1, 11, 30);
        RegisterFunctions.registerCategory(Constants.MOD_ID, "winter", "season", 12, 1, 2, 28);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.FOX, "autumn", "flannel_fox", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "autumn", "flannel_fox", "*", "flannel_fox");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "autumn", "flannel_fox", "*baby", "flannel_fox");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "autumn", "flannel_fox", "entity/fox/fox_sleep", "flannel_fox_any_sleep");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "autumn", "flannel_fox", "entity/fox/snow_fox_sleep", "flannel_fox_any_sleep");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.FOX, "autumn", "pumpkin_fox", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "autumn", "pumpkin_fox", "*", "pumpkin_fox");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "autumn", "pumpkin_fox", "*baby", "pumpkin_fox");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "autumn", "pumpkin_fox", "entity/fox/fox_sleep", "pumpkin_fox_any_sleep");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "autumn", "pumpkin_fox", "entity/fox/snow_fox_sleep", "pumpkin_fox_any_sleep");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.FOX, "spring", "cherryblossom_fox", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "spring", "cherryblossom_fox", "*", "cherryblossom_fox");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "spring", "cherryblossom_fox", "*baby", "cherryblossom_fox");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "spring", "cherryblossom_fox", "entity/fox/fox_sleep", "cherryblossom_fox_any_sleep");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "spring", "cherryblossom_fox", "entity/fox/snow_fox_sleep", "cherryblossom_fox_any_sleep");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.FOX, "spring", "flower_fox", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "spring", "flower_fox", "*", "flower_fox");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "spring", "flower_fox", "*baby", "flower_fox");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "spring", "flower_fox", "entity/fox/fox_sleep", "flower_fox_any_sleep");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "spring", "flower_fox", "entity/fox/snow_fox_sleep", "flower_fox_any_sleep");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.FOX, "summer", "midsommar_fox", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "summer", "midsommar_fox", "*", "midsommar_fox");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "summer", "midsommar_fox", "*baby", "midsommar_fox");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "summer", "midsommar_fox", "entity/fox/fox_sleep", "midsommar_fox_any_sleep");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "summer", "midsommar_fox", "entity/fox/snow_fox_sleep", "midsommar_fox_any_sleep");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.FOX, "summer", "watermelon_fox", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "summer", "watermelon_fox", "*", "watermelon_fox");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "summer", "watermelon_fox", "*baby", "watermelon_fox");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "summer", "watermelon_fox", "entity/fox/fox_sleep", "watermelon_fox_any_sleep");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "summer", "watermelon_fox", "entity/fox/snow_fox_sleep", "watermelon_fox_any_sleep");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.FOX, "winter", "frozen_fox", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "winter", "frozen_fox", "*", "frozen_fox");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "winter", "frozen_fox", "*baby", "frozen_fox");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "winter", "frozen_fox", "entity/fox/fox_sleep", "frozen_fox_any_sleep");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "winter", "frozen_fox", "entity/fox/snow_fox_sleep", "frozen_fox_any_sleep");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.FOX, "winter", "snow_covered_fox", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "winter", "snow_covered_fox", "*", "snow_covered_fox");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "winter", "snow_covered_fox", "*baby", "snow_covered_fox");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "winter", "snow_covered_fox", "entity/fox/fox_sleep", "snow_covered_fox_any_sleep");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.FOX, "winter", "snow_covered_fox", "entity/fox/snow_fox_sleep", "snow_covered_fox_any_sleep");
    }
}
