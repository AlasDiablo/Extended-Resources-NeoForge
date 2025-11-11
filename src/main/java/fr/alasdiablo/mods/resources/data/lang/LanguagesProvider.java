package fr.alasdiablo.mods.resources.data.lang;

import fr.alasdiablo.mods.resources.ExtendedResources;
import fr.alasdiablo.mods.resources.registry.ExtendedResourcesItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class LanguagesProvider {

    private static class Global extends LanguageProvider {
        protected Global(PackOutput output, String locale) {
            super(output, ExtendedResources.MOD_ID, locale);
        }

        @Override
        protected void addTranslations() {
            this.add("item_group." + ExtendedResources.MOD_ID + ".tab", "Dio's Extended Resources");
        }
    }

    public static class English {
        private static class Common extends Global {
            protected Common(PackOutput output, String locale) {
                super(output, locale);
            }

            @Override
            protected void addTranslations() {
                super.addTranslations();
                this.add(ExtendedResourcesItems.STEEL_INGOT.get(), "Steel Ingot");

                this.add(ExtendedResourcesItems.COAL_DUST.get(), "Coal Dust");
                this.add(ExtendedResourcesItems.COPPER_DUST.get(), "Copper Dust");
                this.add(ExtendedResourcesItems.DIAMOND_DUST.get(), "Diamond Dust");
                this.add(ExtendedResourcesItems.EMERALD_DUST.get(), "Emerald Dust");
                this.add(ExtendedResourcesItems.GOLD_DUST.get(), "Gold Dust");
                this.add(ExtendedResourcesItems.IRON_DUST.get(), "Iron Dust");
                this.add(ExtendedResourcesItems.LAPIS_DUST.get(), "Lapis Dust");
                this.add(ExtendedResourcesItems.ENRICHED_IRON_DUST.get(), "Enriched Iron Dust");
                this.add(ExtendedResourcesItems.STEEL_DUST.get(), "Steel Dust");

                this.add(ExtendedResourcesItems.COAL_NUGGET.get(), "Coal Chunk");
                this.add(ExtendedResourcesItems.COPPER_NUGGET.get(), "Copper Nugget");
                this.add(ExtendedResourcesItems.DIAMOND_NUGGET.get(), "Diamond Shard");
                this.add(ExtendedResourcesItems.EMERALD_NUGGET.get(), "Emerald Shard");
                this.add(ExtendedResourcesItems.LAPIS_NUGGET.get(), "Lapis Lazuli Fragment");
                this.add(ExtendedResourcesItems.REDSTONE_NUGGET.get(), "Tiny Pile of Redstone");
                this.add(ExtendedResourcesItems.STEEL_NUGGET.get(), "Steel Nugget");

                this.add(ExtendedResourcesItems.NETHERITE_NUGGET.get(), "Netherite Nugget");
                this.add(ExtendedResourcesItems.NETHERITE_FRAGMENT.get(), "Netherite Fragment");

                this.add(ExtendedResourcesItems.COPPER_PLATE.get(), "Copper Plate");
                this.add(ExtendedResourcesItems.IRON_PLATE.get(), "Iron Plate");
                this.add(ExtendedResourcesItems.GOLD_PLATE.get(), "Golden Plate");
                this.add(ExtendedResourcesItems.STEEL_PLATE.get(), "Steel Plate");

                this.add(ExtendedResourcesItems.WOODEN_GEAR.get(), "Wooden Gear");
                this.add(ExtendedResourcesItems.COPPER_GEAR.get(), "Copper Gear");
                this.add(ExtendedResourcesItems.IRON_GEAR.get(), "Iron Gear");
                this.add(ExtendedResourcesItems.GOLD_GEAR.get(), "Golden Gear");
                this.add(ExtendedResourcesItems.STEEL_GEAR.get(), "Steel Gear");

                this.add(ExtendedResourcesItems.COPPER_ROD.get(), "Copper Rod");
                this.add(ExtendedResourcesItems.IRON_ROD.get(), "Iron Rod");
                this.add(ExtendedResourcesItems.GOLD_ROD.get(), "Golden Rod");
                this.add(ExtendedResourcesItems.STEEL_ROD.get(), "Steel Rod");

                this.add(ExtendedResourcesItems.METAL_HAMMER.get(), "Forging hammer");
                this.add(ExtendedResourcesItems.METAL_CUTTER.get(), "Metal cutters");
                this.add(ExtendedResourcesItems.MORTAR.get(), "Mortar");
                this.add(ExtendedResourcesItems.PESTLE.get(), "Pestle");
                this.add(ExtendedResourcesItems.MORTAR_AND_PESTLE.get(), "Mortar and Pestle");
            }
        }

        public static class UnitedKingdom extends Common {
            public UnitedKingdom(PackOutput output) {
                super(output, "en_gb");
            }
        }

        public static class UnitedStates extends Common {
            public UnitedStates(PackOutput output) {
                super(output, "en_us");
            }
        }

        public static class Canada extends Common {
            public Canada(PackOutput output) {
                super(output, "en_ca");
            }
        }

        public static class Australia extends Common {
            public Australia(PackOutput output) {
                super(output, "en_au");
            }
        }

        public static class NewZealand extends Common {
            public NewZealand(PackOutput output) {
                super(output, "en_nz");
            }
        }
    }

    public static class French {
        private static class Common extends Global {
            protected Common(PackOutput output, String locale) {
                super(output, locale);
            }

            @Override
            protected void addTranslations() {
                super.addTranslations();
                this.add(ExtendedResourcesItems.STEEL_INGOT.get(), "Lingot d'acier");

                this.add(ExtendedResourcesItems.COAL_DUST.get(), "Poussière de charbon");
                this.add(ExtendedResourcesItems.COPPER_DUST.get(), "Poussière de cuivre");
                this.add(ExtendedResourcesItems.DIAMOND_DUST.get(), "Poussière de diamant");
                this.add(ExtendedResourcesItems.EMERALD_DUST.get(), "Poussière d'émeraude");
                this.add(ExtendedResourcesItems.GOLD_DUST.get(), "Poussière d'or");
                this.add(ExtendedResourcesItems.IRON_DUST.get(), "Poussière de fer");
                this.add(ExtendedResourcesItems.LAPIS_DUST.get(), "Poussière de lapis-lazuli");
                this.add(ExtendedResourcesItems.ENRICHED_IRON_DUST.get(), "Poussière de fer enrichie");
                this.add(ExtendedResourcesItems.STEEL_DUST.get(), "Poussière d'acier");

                this.add(ExtendedResourcesItems.COAL_NUGGET.get(), "Morceau de charbon");
                this.add(ExtendedResourcesItems.COPPER_NUGGET.get(), "Pépite de cuivre");
                this.add(ExtendedResourcesItems.DIAMOND_NUGGET.get(), "Éclat de diamant");
                this.add(ExtendedResourcesItems.EMERALD_NUGGET.get(), "Éclat d'émeraude");
                this.add(ExtendedResourcesItems.LAPIS_NUGGET.get(), "Fragment de lapis-lazuli");
                this.add(ExtendedResourcesItems.REDSTONE_NUGGET.get(), "Petit tas de redstone");
                this.add(ExtendedResourcesItems.STEEL_NUGGET.get(), "Pépite d'acier");

                this.add(ExtendedResourcesItems.NETHERITE_NUGGET.get(), "Pépite de netherite");
                this.add(ExtendedResourcesItems.NETHERITE_FRAGMENT.get(), "Éclat de netherite");

                this.add(ExtendedResourcesItems.COPPER_PLATE.get(), "Plaque de cuivre");
                this.add(ExtendedResourcesItems.IRON_PLATE.get(), "Plaque d'fer");
                this.add(ExtendedResourcesItems.GOLD_PLATE.get(), "Plaque d'or");
                this.add(ExtendedResourcesItems.STEEL_PLATE.get(), "Plaque d'acier");

                this.add(ExtendedResourcesItems.WOODEN_GEAR.get(), "Roue dentée en bois");
                this.add(ExtendedResourcesItems.COPPER_GEAR.get(), "Roue dentée en cuivre");
                this.add(ExtendedResourcesItems.IRON_GEAR.get(), "Roue dentée en fer");
                this.add(ExtendedResourcesItems.GOLD_GEAR.get(), "Roue dentée en or");
                this.add(ExtendedResourcesItems.STEEL_GEAR.get(), "Roue dentée en acier");

                this.add(ExtendedResourcesItems.COPPER_ROD.get(), "Tige en cuivre");
                this.add(ExtendedResourcesItems.IRON_ROD.get(), "Tige en fer");
                this.add(ExtendedResourcesItems.GOLD_ROD.get(), "Tige en or");
                this.add(ExtendedResourcesItems.STEEL_ROD.get(), "Tige en acier");

                this.add(ExtendedResourcesItems.METAL_HAMMER.get(), "Marteau de forge");
                this.add(ExtendedResourcesItems.METAL_CUTTER.get(), "Cisaille à métaux");
                this.add(ExtendedResourcesItems.MORTAR.get(), "Mortier");
                this.add(ExtendedResourcesItems.PESTLE.get(), "Pilon");
                this.add(ExtendedResourcesItems.MORTAR_AND_PESTLE.get(), "Mortier et pilon");
            }
        }

        public static class France extends Common {
            public France(PackOutput output) {
                super(output, "fr_fr");
            }
        }

        public static class Canada extends Common {
            public Canada(PackOutput output) {
                super(output, "fr_ca");
            }
        }
    }
}
