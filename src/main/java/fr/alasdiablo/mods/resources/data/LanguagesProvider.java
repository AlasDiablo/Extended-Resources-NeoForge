package fr.alasdiablo.mods.resources.data;

import fr.alasdiablo.mods.resources.ExtendedResources;
import fr.alasdiablo.mods.resources.registry.ExtendedResourcesItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class LanguagesProvider {

    public static class EnglishUnitedKingdom extends LanguageProvider {
        public EnglishUnitedKingdom(PackOutput output) {
            super(output, ExtendedResources.MOD_ID, "en_uk");
        }

        protected EnglishUnitedKingdom(PackOutput output, String locale) {
            super(output, ExtendedResources.MOD_ID, locale);
        }

        @Override
        protected void addTranslations() {
            this.add("item_group." + ExtendedResources.MOD_ID + ".tab", "Dio's Extended Resources");

            this.add(ExtendedResourcesItems.COAL_DUST.get(), "Coal Dust");
            this.add(ExtendedResourcesItems.COPPER_DUST.get(), "Copper Dust");
            this.add(ExtendedResourcesItems.DIAMOND_DUST.get(), "Diamond Dust");
            this.add(ExtendedResourcesItems.EMERALD_DUST.get(), "Emerald Dust");
            this.add(ExtendedResourcesItems.GOLD_DUST.get(), "Gold Dust");
            this.add(ExtendedResourcesItems.IRON_DUST.get(), "Iron Dust");
            this.add(ExtendedResourcesItems.LAPIS_DUST.get(), "Lapis Dust");

            this.add(ExtendedResourcesItems.COAL_NUGGET.get(), "Coal Chunk");
            this.add(ExtendedResourcesItems.COPPER_NUGGET.get(), "Copper Nugget");
            this.add(ExtendedResourcesItems.DIAMOND_NUGGET.get(), "Diamond Shard");
            this.add(ExtendedResourcesItems.EMERALD_NUGGET.get(), "Emerald Shard");
            this.add(ExtendedResourcesItems.LAPIS_NUGGET.get(), "Lapis Lazuli Fragment");
            this.add(ExtendedResourcesItems.REDSTONE_NUGGET.get(), "Tiny Pile of Redstone");
        }
    }

    public static class FrenchFrance extends LanguageProvider {
        public FrenchFrance(PackOutput output) {
            super(output, ExtendedResources.MOD_ID, "fr_fr");
        }

        @Override
        protected void addTranslations() {
            this.add("item_group." + ExtendedResources.MOD_ID + ".tab", "Dio's Extended Resources");

            this.add(ExtendedResourcesItems.COAL_DUST.get(), "Poussière de charbon");
            this.add(ExtendedResourcesItems.COPPER_DUST.get(), "Poussière de cuivre");
            this.add(ExtendedResourcesItems.DIAMOND_DUST.get(), "Poussière de diamant");
            this.add(ExtendedResourcesItems.EMERALD_DUST.get(), "Poussière d'émeraude");
            this.add(ExtendedResourcesItems.GOLD_DUST.get(), "Poussière d'or");
            this.add(ExtendedResourcesItems.IRON_DUST.get(), "Poussière de fer");
            this.add(ExtendedResourcesItems.LAPIS_DUST.get(), "Poussière de lapis-lazuli");

            this.add(ExtendedResourcesItems.COAL_NUGGET.get(), "Morceau de charbon");
            this.add(ExtendedResourcesItems.COPPER_NUGGET.get(), "Pépite de cuivre");
            this.add(ExtendedResourcesItems.DIAMOND_NUGGET.get(), "Éclat de diamant");
            this.add(ExtendedResourcesItems.EMERALD_NUGGET.get(), "Éclat d'émeraude");
            this.add(ExtendedResourcesItems.LAPIS_NUGGET.get(), "Fragment de lapis-lazuli");
            this.add(ExtendedResourcesItems.REDSTONE_NUGGET.get(), "Petit tas de redstone");
        }
    }

    public static class EnglishUnitedStates extends EnglishUnitedKingdom {
        public EnglishUnitedStates(PackOutput output) {
            super(output, "en_us");
        }
    }
}
