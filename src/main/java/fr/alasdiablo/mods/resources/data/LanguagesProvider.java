package fr.alasdiablo.mods.resources.data;

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
