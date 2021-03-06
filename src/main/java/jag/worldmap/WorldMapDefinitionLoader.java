package jag.worldmap;

import jag.js5.ReferenceTable;

public class WorldMapDefinitionLoader {

    public final ReferenceTable aReferenceTable1807;
    public boolean aBoolean1810;
    public int anInt1808;
    public String aString1809;

    public WorldMapDefinitionLoader(ReferenceTable var1) {
        this.anInt1808 = 0;
        this.aBoolean1810 = false;
        this.aReferenceTable1807 = var1;
    }

    public int method1310() {
        if (this.anInt1808 < 33) {
            if (!this.aReferenceTable1807.method893(WorldMapCacheFeature.COMPOSITEMAP.name, this.aString1809)) {
                return this.anInt1808;
            }

            this.anInt1808 = 33;
        }

        if (this.anInt1808 == 33) {
            if (this.aReferenceTable1807.method906(WorldMapCacheFeature.COMPOSITETEXTURE.name, this.aString1809) && !this.aReferenceTable1807.method893(WorldMapCacheFeature.COMPOSITETEXTURE.name, this.aString1809)) {
                return this.anInt1808;
            }

            this.anInt1808 = 66;
        }

        if (this.anInt1808 == 66) {
            if (!this.aReferenceTable1807.method893(this.aString1809, WorldMapCacheFeature.LABELS.name)) {
                return this.anInt1808;
            }

            this.anInt1808 = 100;
            this.aBoolean1810 = true;
        }

        return this.anInt1808;
    }

    public boolean method1308() {
        return this.aBoolean1810;
    }

    public void method1309(String var1) {
        if (var1 != null && !var1.isEmpty()) {
            if (var1 != this.aString1809) {
                this.aString1809 = var1;
                this.anInt1808 = 0;
                this.aBoolean1810 = false;
                this.method1310();
            }
        }
    }

    public int method1307() {
        return this.anInt1808;
    }
}
