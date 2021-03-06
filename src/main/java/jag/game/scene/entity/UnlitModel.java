package jag.game.scene.entity;

import jag.Face;
import jag.Vertex;
import jag.graphics.JagGraphics3D;
import jag.js5.ReferenceTable;
import jag.opcode.Buffer;
import jag.statics.Statics3;

public class UnlitModel extends Entity {

    public static final int[] anIntArray1433;
    public static final int[] anIntArray1434;
    public static final int[] anIntArray1427;
    public static final int[] anIntArray1430;
    public static int anInt1424;

    static {
        anIntArray1434 = new int[10000];
        anIntArray1430 = new int[10000];
        anInt1424 = 0;
        anIntArray1433 = JagGraphics3D.SIN_TABLE;
        anIntArray1427 = JagGraphics3D.COS_TABLE;
    }

    public short aShort1441;
    public short aShort1439;
    public boolean aBoolean1420;
    public int[] anIntArray787;
    public Vertex[] aClass96Array1431;
    public int[] xVertices;
    public short[] aShortArray1421;
    public int anInt380;
    public int anInt574;
    public int anInt1436;
    public int[] anIntArray782;
    public int[] yVertices;
    public byte[] aByteArray1440;
    public int[] zVertices;
    public short[] aShortArray1435;
    public Vertex[] aClass96Array1422;
    public int anInt556;
    public int anInt1105;
    public Face[] aClass104Array1432;
    public int[] anIntArray747;
    public int[][] anIntArrayArray1429;
    public int anInt1437;
    public byte defaultRenderPriority;
    public int[][] anIntArrayArray1426;
    public int[] anIntArray692;
    public int anInt579;
    public int anInt702;
    public int[] anIntArray687;
    public byte[] aByteArray1423;
    public byte[] aByteArray1425;
    public byte[] aByteArray1438;
    public byte[] aByteArray1428;
    public short[] aShortArray718;
    public short[] aShortArray724;
    public short[] aShortArray719;

    public UnlitModel() {
        this.anInt380 = 0;
        this.anInt574 = 0;
        this.defaultRenderPriority = 0;
        this.aBoolean1420 = false;
    }

    public UnlitModel(UnlitModel[] var1, int var2) {
        this.anInt380 = 0;
        this.anInt574 = 0;
        this.defaultRenderPriority = 0;
        this.aBoolean1420 = false;
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.anInt380 = 0;
        this.anInt574 = 0;
        this.anInt702 = 0;
        this.defaultRenderPriority = -1;

        int var9;
        UnlitModel var10;
        for (var9 = 0; var9 < var2; ++var9) {
            var10 = var1[var9];
            if (var10 != null) {
                this.anInt380 += var10.anInt380;
                this.anInt574 += var10.anInt574;
                this.anInt702 += var10.anInt702;
                if (var10.aByteArray1428 != null) {
                    var4 = true;
                } else {
                    if (this.defaultRenderPriority == -1) {
                        this.defaultRenderPriority = var10.defaultRenderPriority;
                    }

                    if (this.defaultRenderPriority != var10.defaultRenderPriority) {
                        var4 = true;
                    }
                }

                var3 |= var10.aByteArray1440 != null;
                var5 |= var10.aByteArray1425 != null;
                var6 |= var10.anIntArray782 != null;
                var7 |= var10.aShortArray1421 != null;
                var8 |= var10.aByteArray1423 != null;
            }
        }

        this.xVertices = new int[this.anInt380];
        this.yVertices = new int[this.anInt380];
        this.zVertices = new int[this.anInt380];
        this.anIntArray787 = new int[this.anInt380];
        this.anIntArray747 = new int[this.anInt574];
        this.anIntArray687 = new int[this.anInt574];
        this.anIntArray692 = new int[this.anInt574];
        if (var3) {
            this.aByteArray1440 = new byte[this.anInt574];
        }

        if (var4) {
            this.aByteArray1428 = new byte[this.anInt574];
        }

        if (var5) {
            this.aByteArray1425 = new byte[this.anInt574];
        }

        if (var6) {
            this.anIntArray782 = new int[this.anInt574];
        }

        if (var7) {
            this.aShortArray1421 = new short[this.anInt574];
        }

        if (var8) {
            this.aByteArray1423 = new byte[this.anInt574];
        }

        this.aShortArray1435 = new short[this.anInt574];
        if (this.anInt702 > 0) {
            this.aByteArray1438 = new byte[this.anInt702];
            this.aShortArray718 = new short[this.anInt702];
            this.aShortArray724 = new short[this.anInt702];
            this.aShortArray719 = new short[this.anInt702];
        }

        this.anInt380 = 0;
        this.anInt574 = 0;
        this.anInt702 = 0;

        for (var9 = 0; var9 < var2; ++var9) {
            var10 = var1[var9];
            if (var10 != null) {
                int var11;
                for (var11 = 0; var11 < var10.anInt574; ++var11) {
                    if (var3 && var10.aByteArray1440 != null) {
                        this.aByteArray1440[this.anInt574] = var10.aByteArray1440[var11];
                    }

                    if (var4) {
                        if (var10.aByteArray1428 != null) {
                            this.aByteArray1428[this.anInt574] = var10.aByteArray1428[var11];
                        } else {
                            this.aByteArray1428[this.anInt574] = var10.defaultRenderPriority;
                        }
                    }

                    if (var5 && var10.aByteArray1425 != null) {
                        this.aByteArray1425[this.anInt574] = var10.aByteArray1425[var11];
                    }

                    if (var6 && var10.anIntArray782 != null) {
                        this.anIntArray782[this.anInt574] = var10.anIntArray782[var11];
                    }

                    if (var7) {
                        if (var10.aShortArray1421 != null) {
                            this.aShortArray1421[this.anInt574] = var10.aShortArray1421[var11];
                        } else {
                            this.aShortArray1421[this.anInt574] = -1;
                        }
                    }

                    if (var8) {
                        if (var10.aByteArray1423 != null && var10.aByteArray1423[var11] != -1) {
                            this.aByteArray1423[this.anInt574] = (byte) (this.anInt702 + var10.aByteArray1423[var11]);
                        } else {
                            this.aByteArray1423[this.anInt574] = -1;
                        }
                    }

                    this.aShortArray1435[this.anInt574] = var10.aShortArray1435[var11];
                    this.anIntArray747[this.anInt574] = this.method979(var10, var10.anIntArray747[var11]);
                    this.anIntArray687[this.anInt574] = this.method979(var10, var10.anIntArray687[var11]);
                    this.anIntArray692[this.anInt574] = this.method979(var10, var10.anIntArray692[var11]);
                    ++this.anInt574;
                }

                for (var11 = 0; var11 < var10.anInt702; ++var11) {
                    byte var12 = this.aByteArray1438[this.anInt702] = var10.aByteArray1438[var11];
                    if (var12 == 0) {
                        this.aShortArray718[this.anInt702] = (short) this.method979(var10, var10.aShortArray718[var11]);
                        this.aShortArray724[this.anInt702] = (short) this.method979(var10, var10.aShortArray724[var11]);
                        this.aShortArray719[this.anInt702] = (short) this.method979(var10, var10.aShortArray719[var11]);
                    }

                    ++this.anInt702;
                }
            }
        }

    }

    public UnlitModel(byte[] var1) {
        this.anInt380 = 0;
        this.anInt574 = 0;
        this.defaultRenderPriority = 0;
        this.aBoolean1420 = false;
        if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
            this.method975(var1);
        } else {
            this.method980(var1);
        }

    }

    public UnlitModel(UnlitModel var1, boolean var2, boolean var3, boolean var4) {
        this.anInt380 = 0;
        this.anInt574 = 0;
        this.defaultRenderPriority = 0;
        this.aBoolean1420 = false;
        this.anInt380 = var1.anInt380;
        this.anInt574 = var1.anInt574;
        this.anInt702 = var1.anInt702;
        int var6;
        if (var2) {
            this.xVertices = var1.xVertices;
            this.yVertices = var1.yVertices;
            this.zVertices = var1.zVertices;
        } else {
            this.xVertices = new int[this.anInt380];
            this.yVertices = new int[this.anInt380];
            this.zVertices = new int[this.anInt380];

            for (var6 = 0; var6 < this.anInt380; ++var6) {
                this.xVertices[var6] = var1.xVertices[var6];
                this.yVertices[var6] = var1.yVertices[var6];
                this.zVertices[var6] = var1.zVertices[var6];
            }
        }

        if (var3) {
            this.aShortArray1435 = var1.aShortArray1435;
        } else {
            this.aShortArray1435 = new short[this.anInt574];

            for (var6 = 0; var6 < this.anInt574; ++var6) {
                this.aShortArray1435[var6] = var1.aShortArray1435[var6];
            }
        }

        if (!var4 && var1.aShortArray1421 != null) {
            this.aShortArray1421 = new short[this.anInt574];

            for (var6 = 0; var6 < this.anInt574; ++var6) {
                this.aShortArray1421[var6] = var1.aShortArray1421[var6];
            }
        } else {
            this.aShortArray1421 = var1.aShortArray1421;
        }

        this.aByteArray1425 = var1.aByteArray1425;
        this.anIntArray747 = var1.anIntArray747;
        this.anIntArray687 = var1.anIntArray687;
        this.anIntArray692 = var1.anIntArray692;
        this.aByteArray1440 = var1.aByteArray1440;
        this.aByteArray1428 = var1.aByteArray1428;
        this.aByteArray1423 = var1.aByteArray1423;
        this.defaultRenderPriority = var1.defaultRenderPriority;
        this.aByteArray1438 = var1.aByteArray1438;
        this.aShortArray718 = var1.aShortArray718;
        this.aShortArray724 = var1.aShortArray724;
        this.aShortArray719 = var1.aShortArray719;
        this.anIntArray787 = var1.anIntArray787;
        this.anIntArray782 = var1.anIntArray782;
        this.anIntArrayArray1429 = var1.anIntArrayArray1429;
        this.anIntArrayArray1426 = var1.anIntArrayArray1426;
        this.aClass96Array1431 = var1.aClass96Array1431;
        this.aClass104Array1432 = var1.aClass104Array1432;
        this.aClass96Array1422 = var1.aClass96Array1422;
        this.aShort1441 = var1.aShort1441;
        this.aShort1439 = var1.aShort1439;
    }

    public static UnlitModel method982(ReferenceTable var0, int var1, int var2) {
        byte[] var3 = var0.unpack(var1, var2);
        return var3 == null ? null : new UnlitModel(var3);
    }

    public static void method970(UnlitModel var0, UnlitModel var1, int var2, int var3, int var4, boolean var5) {
        var0.method973();
        var0.method593();
        var1.method973();
        var1.method593();
        ++anInt1424;
        int var6 = 0;
        int[] var7 = var1.xVertices;
        int var8 = var1.anInt380;

        int var9;
        for (var9 = 0; var9 < var0.anInt380; ++var9) {
            Vertex var10 = var0.aClass96Array1431[var9];
            if (var10.anInt728 != 0) {
                int var11 = var0.yVertices[var9] - var3;
                if (var11 <= var1.anInt1105) {
                    int var12 = var0.xVertices[var9] - var2;
                    if (var12 >= var1.anInt1436 && var12 <= var1.anInt556) {
                        int var13 = var0.zVertices[var9] - var4;
                        if (var13 >= var1.anInt1437 && var13 <= var1.anInt579) {
                            for (int var14 = 0; var14 < var8; ++var14) {
                                Vertex var15 = var1.aClass96Array1431[var14];
                                if (var12 == var7[var14] && var13 == var1.zVertices[var14] && var11 == var1.yVertices[var14] && var15.anInt728 != 0) {
                                    if (var0.aClass96Array1422 == null) {
                                        var0.aClass96Array1422 = new Vertex[var0.anInt380];
                                    }

                                    if (var1.aClass96Array1422 == null) {
                                        var1.aClass96Array1422 = new Vertex[var8];
                                    }

                                    Vertex var16 = var0.aClass96Array1422[var9];
                                    if (var16 == null) {
                                        var16 = var0.aClass96Array1422[var9] = new Vertex(var10);
                                    }

                                    Vertex var17 = var1.aClass96Array1422[var14];
                                    if (var17 == null) {
                                        var17 = var1.aClass96Array1422[var14] = new Vertex(var15);
                                    }

                                    var16.anInt729 += var15.anInt729;
                                    var16.anInt727 += var15.anInt727;
                                    var16.anInt726 += var15.anInt726;
                                    var16.anInt728 += var15.anInt728;
                                    var17.anInt729 += var10.anInt729;
                                    var17.anInt727 += var10.anInt727;
                                    var17.anInt726 += var10.anInt726;
                                    var17.anInt728 += var10.anInt728;
                                    ++var6;
                                    anIntArray1434[var9] = anInt1424;
                                    anIntArray1430[var14] = anInt1424;
                                }
                            }
                        }
                    }
                }
            }
        }

        if (var6 >= 3 && var5) {
            for (var9 = 0; var9 < var0.anInt574; ++var9) {
                if (anIntArray1434[var0.anIntArray747[var9]] == anInt1424 && anIntArray1434[var0.anIntArray687[var9]] == anInt1424 && anIntArray1434[var0.anIntArray692[var9]] == anInt1424) {
                    if (var0.aByteArray1440 == null) {
                        var0.aByteArray1440 = new byte[var0.anInt574];
                    }

                    var0.aByteArray1440[var9] = 2;
                }
            }

            for (var9 = 0; var9 < var1.anInt574; ++var9) {
                if (anInt1424 == anIntArray1430[var1.anIntArray747[var9]] && anInt1424 == anIntArray1430[var1.anIntArray687[var9]] && anInt1424 == anIntArray1430[var1.anIntArray692[var9]]) {
                    if (var1.aByteArray1440 == null) {
                        var1.aByteArray1440 = new byte[var1.anInt574];
                    }

                    var1.aByteArray1440[var9] = 2;
                }
            }

        }
    }

    public static int method968(int var0) {
        if (var0 < 2) {
            var0 = 2;
        } else if (var0 > 126) {
            var0 = 126;
        }

        return var0;
    }

    public static int method974(int var0, int var1) {
        var1 = (var0 & 127) * var1 >> 7;
        if (var1 < 2) {
            var1 = 2;
        } else if (var1 > 126) {
            var1 = 126;
        }

        return (var0 & 65408) + var1;
    }

    public void method973() {
        if (!this.aBoolean1420) {
            super.height = 0;
            this.anInt1105 = 0;
            this.anInt1436 = 999999;
            this.anInt556 = -999999;
            this.anInt579 = -99999;
            this.anInt1437 = 99999;

            for (int var1 = 0; var1 < this.anInt380; ++var1) {
                int var2 = this.xVertices[var1];
                int var3 = this.yVertices[var1];
                int var4 = this.zVertices[var1];
                if (var2 < this.anInt1436) {
                    this.anInt1436 = var2;
                }

                if (var2 > this.anInt556) {
                    this.anInt556 = var2;
                }

                if (var4 < this.anInt1437) {
                    this.anInt1437 = var4;
                }

                if (var4 > this.anInt579) {
                    this.anInt579 = var4;
                }

                if (-var3 > super.height) {
                    super.height = -var3;
                }

                if (var3 > this.anInt1105) {
                    this.anInt1105 = var3;
                }
            }

            this.aBoolean1420 = true;
        }
    }

    public void method593() {
        if (this.aClass96Array1431 == null) {
            this.aClass96Array1431 = new Vertex[this.anInt380];

            int var1;
            for (var1 = 0; var1 < this.anInt380; ++var1) {
                this.aClass96Array1431[var1] = new Vertex();
            }

            for (var1 = 0; var1 < this.anInt574; ++var1) {
                int var2 = this.anIntArray747[var1];
                int var3 = this.anIntArray687[var1];
                int var4 = this.anIntArray692[var1];
                int var5 = this.xVertices[var3] - this.xVertices[var2];
                int var6 = this.yVertices[var3] - this.yVertices[var2];
                int var7 = this.zVertices[var3] - this.zVertices[var2];
                int var8 = this.xVertices[var4] - this.xVertices[var2];
                int var9 = this.yVertices[var4] - this.yVertices[var2];
                int var10 = this.zVertices[var4] - this.zVertices[var2];
                int var11 = var6 * var10 - var9 * var7;
                int var12 = var7 * var8 - var10 * var5;

                int var13;
                for (var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
                    var11 >>= 1;
                    var12 >>= 1;
                }

                int var14 = (int) Math.sqrt(var11 * var11 + var12 * var12 + var13 * var13);
                if (var14 <= 0) {
                    var14 = 1;
                }

                var11 = var11 * 256 / var14;
                var12 = var12 * 256 / var14;
                var13 = var13 * 256 / var14;
                byte var15;
                if (this.aByteArray1440 == null) {
                    var15 = 0;
                } else {
                    var15 = this.aByteArray1440[var1];
                }

                if (var15 == 0) {
                    Vertex var16 = this.aClass96Array1431[var2];
                    var16.anInt729 += var11;
                    var16.anInt727 += var12;
                    var16.anInt726 += var13;
                    ++var16.anInt728;
                    var16 = this.aClass96Array1431[var3];
                    var16.anInt729 += var11;
                    var16.anInt727 += var12;
                    var16.anInt726 += var13;
                    ++var16.anInt728;
                    var16 = this.aClass96Array1431[var4];
                    var16.anInt729 += var11;
                    var16.anInt727 += var12;
                    var16.anInt726 += var13;
                    ++var16.anInt728;
                } else if (var15 == 1) {
                    if (this.aClass104Array1432 == null) {
                        this.aClass104Array1432 = new Face[this.anInt574];
                    }

                    Face var17 = this.aClass104Array1432[var1] = new Face();
                    var17.anInt772 = var11;
                    var17.anInt770 = var12;
                    var17.anInt769 = var13;
                }
            }

        }
    }

    public void method580() {
        this.aClass96Array1431 = null;
        this.aClass96Array1422 = null;
        this.aClass104Array1432 = null;
        this.aBoolean1420 = false;
    }

    public UnlitModel method978() {
        UnlitModel var1 = new UnlitModel();
        if (this.aByteArray1440 != null) {
            var1.aByteArray1440 = new byte[this.anInt574];

            System.arraycopy(this.aByteArray1440, 0, var1.aByteArray1440, 0, this.anInt574);
        }

        var1.anInt380 = this.anInt380;
        var1.anInt574 = this.anInt574;
        var1.anInt702 = this.anInt702;
        var1.xVertices = this.xVertices;
        var1.yVertices = this.yVertices;
        var1.zVertices = this.zVertices;
        var1.anIntArray747 = this.anIntArray747;
        var1.anIntArray687 = this.anIntArray687;
        var1.anIntArray692 = this.anIntArray692;
        var1.aByteArray1428 = this.aByteArray1428;
        var1.aByteArray1425 = this.aByteArray1425;
        var1.aByteArray1423 = this.aByteArray1423;
        var1.aShortArray1435 = this.aShortArray1435;
        var1.aShortArray1421 = this.aShortArray1421;
        var1.defaultRenderPriority = this.defaultRenderPriority;
        var1.aByteArray1438 = this.aByteArray1438;
        var1.aShortArray718 = this.aShortArray718;
        var1.aShortArray724 = this.aShortArray724;
        var1.aShortArray719 = this.aShortArray719;
        var1.anIntArray787 = this.anIntArray787;
        var1.anIntArray782 = this.anIntArray782;
        var1.anIntArrayArray1429 = this.anIntArrayArray1429;
        var1.anIntArrayArray1426 = this.anIntArrayArray1426;
        var1.aClass96Array1431 = this.aClass96Array1431;
        var1.aClass104Array1432 = this.aClass104Array1432;
        var1.aShort1441 = this.aShort1441;
        var1.aShort1439 = this.aShort1439;
        return var1;
    }

    public void texturize(short var1, short var2) {
        for (int var3 = 0; var3 < this.anInt574; ++var3) {
            if (this.aShortArray1435[var3] == var1) {
                this.aShortArray1435[var3] = var2;
            }
        }

    }

    public void method764(int var1, int var2, int var3) {
        for (int var4 = 0; var4 < this.anInt380; ++var4) {
            this.xVertices[var4] = this.xVertices[var4] * var1 / 128;
            this.yVertices[var4] = var2 * this.yVertices[var4] / 128;
            this.zVertices[var4] = var3 * this.zVertices[var4] / 128;
        }

        this.method580();
    }

    public void method980(byte[] var1) {
        boolean var2 = false;
        boolean var3 = false;
        Buffer var4 = new Buffer(var1);
        Buffer var5 = new Buffer(var1);
        Buffer var6 = new Buffer(var1);
        Buffer var7 = new Buffer(var1);
        Buffer var8 = new Buffer(var1);
        var4.caret = var1.length - 18;
        int var9 = var4.readUShort();
        int var10 = var4.readUShort();
        int var11 = var4.readUByte();
        int var12 = var4.readUByte();
        int var13 = var4.readUByte();
        int var14 = var4.readUByte();
        int var15 = var4.readUByte();
        int var16 = var4.readUByte();
        int var17 = var4.readUShort();
        int var18 = var4.readUShort();
        int var19 = var4.readUShort();
        int var20 = var4.readUShort();
        byte var21 = 0;
        int var45 = var21 + var9;
        int var23 = var45;
        var45 += var10;
        int var24 = var45;
        if (var13 == 255) {
            var45 += var10;
        }

        int var25 = var45;
        if (var15 == 1) {
            var45 += var10;
        }

        int var26 = var45;
        if (var12 == 1) {
            var45 += var10;
        }

        int var27 = var45;
        if (var16 == 1) {
            var45 += var9;
        }

        int var28 = var45;
        if (var14 == 1) {
            var45 += var10;
        }

        int var29 = var45;
        var45 += var20;
        int var30 = var45;
        var45 += var10 * 2;
        int var31 = var45;
        var45 += var11 * 6;
        int var32 = var45;
        var45 += var17;
        int var33 = var45;
        var45 += var18;
        int var10000 = var45 + var19;
        this.anInt380 = var9;
        this.anInt574 = var10;
        this.anInt702 = var11;
        this.xVertices = new int[var9];
        this.yVertices = new int[var9];
        this.zVertices = new int[var9];
        this.anIntArray747 = new int[var10];
        this.anIntArray687 = new int[var10];
        this.anIntArray692 = new int[var10];
        if (var11 > 0) {
            this.aByteArray1438 = new byte[var11];
            this.aShortArray718 = new short[var11];
            this.aShortArray724 = new short[var11];
            this.aShortArray719 = new short[var11];
        }

        if (var16 == 1) {
            this.anIntArray787 = new int[var9];
        }

        if (var12 == 1) {
            this.aByteArray1440 = new byte[var10];
            this.aByteArray1423 = new byte[var10];
            this.aShortArray1421 = new short[var10];
        }

        if (var13 == 255) {
            this.aByteArray1428 = new byte[var10];
        } else {
            this.defaultRenderPriority = (byte) var13;
        }

        if (var14 == 1) {
            this.aByteArray1425 = new byte[var10];
        }

        if (var15 == 1) {
            this.anIntArray782 = new int[var10];
        }

        this.aShortArray1435 = new short[var10];
        var4.caret = var21;
        var5.caret = var32;
        var6.caret = var33;
        var7.caret = var45;
        var8.caret = var27;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;

        int var38;
        int var39;
        int var40;
        int var41;
        int var42;
        for (var38 = 0; var38 < var9; ++var38) {
            var39 = var4.readUByte();
            var40 = 0;
            if ((var39 & 1) != 0) {
                var40 = var5.method1046();
            }

            var41 = 0;
            if ((var39 & 2) != 0) {
                var41 = var6.method1046();
            }

            var42 = 0;
            if ((var39 & 4) != 0) {
                var42 = var7.method1046();
            }

            this.xVertices[var38] = var35 + var40;
            this.yVertices[var38] = var36 + var41;
            this.zVertices[var38] = var37 + var42;
            var35 = this.xVertices[var38];
            var36 = this.yVertices[var38];
            var37 = this.zVertices[var38];
            if (var16 == 1) {
                this.anIntArray787[var38] = var8.readUByte();
            }
        }

        var4.caret = var30;
        var5.caret = var26;
        var6.caret = var24;
        var7.caret = var28;
        var8.caret = var25;

        for (var38 = 0; var38 < var10; ++var38) {
            this.aShortArray1435[var38] = (short) var4.readUShort();
            if (var12 == 1) {
                var39 = var5.readUByte();
                if ((var39 & 1) == 1) {
                    this.aByteArray1440[var38] = 1;
                    var2 = true;
                } else {
                    this.aByteArray1440[var38] = 0;
                }

                if ((var39 & 2) == 2) {
                    this.aByteArray1423[var38] = (byte) (var39 >> 2);
                    this.aShortArray1421[var38] = this.aShortArray1435[var38];
                    this.aShortArray1435[var38] = 127;
                    if (this.aShortArray1421[var38] != -1) {
                        var3 = true;
                    }
                } else {
                    this.aByteArray1423[var38] = -1;
                    this.aShortArray1421[var38] = -1;
                }
            }

            if (var13 == 255) {
                this.aByteArray1428[var38] = var6.readByte();
            }

            if (var14 == 1) {
                this.aByteArray1425[var38] = var7.readByte();
            }

            if (var15 == 1) {
                this.anIntArray782[var38] = var8.readUByte();
            }
        }

        var4.caret = var29;
        var5.caret = var23;
        var38 = 0;
        var39 = 0;
        var40 = 0;
        var41 = 0;

        int var43;
        int var44;
        for (var42 = 0; var42 < var10; ++var42) {
            var43 = var5.readUByte();
            if (var43 == 1) {
                var38 = var4.method1046() + var41;
                var39 = var4.method1046() + var38;
                var40 = var4.method1046() + var39;
                var41 = var40;
                this.anIntArray747[var42] = var38;
                this.anIntArray687[var42] = var39;
                this.anIntArray692[var42] = var40;
            }

            if (var43 == 2) {
                var39 = var40;
                var40 = var4.method1046() + var41;
                var41 = var40;
                this.anIntArray747[var42] = var38;
                this.anIntArray687[var42] = var39;
                this.anIntArray692[var42] = var40;
            }

            if (var43 == 3) {
                var38 = var40;
                var40 = var4.method1046() + var41;
                var41 = var40;
                this.anIntArray747[var42] = var38;
                this.anIntArray687[var42] = var39;
                this.anIntArray692[var42] = var40;
            }

            if (var43 == 4) {
                var44 = var38;
                var38 = var39;
                var39 = var44;
                var40 = var4.method1046() + var41;
                var41 = var40;
                this.anIntArray747[var42] = var38;
                this.anIntArray687[var42] = var44;
                this.anIntArray692[var42] = var40;
            }
        }

        var4.caret = var31;

        for (var42 = 0; var42 < var11; ++var42) {
            this.aByteArray1438[var42] = 0;
            this.aShortArray718[var42] = (short) var4.readUShort();
            this.aShortArray724[var42] = (short) var4.readUShort();
            this.aShortArray719[var42] = (short) var4.readUShort();
        }

        if (this.aByteArray1423 != null) {
            boolean var46 = false;

            for (var43 = 0; var43 < var10; ++var43) {
                var44 = this.aByteArray1423[var43] & 255;
                if (var44 != 255) {
                    if (this.anIntArray747[var43] == (this.aShortArray718[var44] & '\uffff') && this.anIntArray687[var43] == (this.aShortArray724[var44] & '\uffff') && this.anIntArray692[var43] == (this.aShortArray719[var44] & '\uffff')) {
                        this.aByteArray1423[var43] = -1;
                    } else {
                        var46 = true;
                    }
                }
            }

            if (!var46) {
                this.aByteArray1423 = null;
            }
        }

        if (!var3) {
            this.aShortArray1421 = null;
        }

        if (!var2) {
            this.aByteArray1440 = null;
        }

    }

    public void colorize(short var1, short var2) {
        if (this.aShortArray1421 != null) {
            for (int var3 = 0; var3 < this.anInt574; ++var3) {
                if (this.aShortArray1421[var3] == var1) {
                    this.aShortArray1421[var3] = var2;
                }
            }

        }
    }

    public final Model light(int var1, int var2, int var3, int var4, int var5) {
        this.method593();
        int var6 = (int) Math.sqrt(var5 * var5 + var3 * var3 + var4 * var4);
        int var7 = var6 * var2 >> 8;
        Model var8 = new Model();
        var8.anIntArray374 = new int[this.anInt574];
        var8.anIntArray1469 = new int[this.anInt574];
        var8.anIntArray689 = new int[this.anInt574];
        if (this.anInt702 > 0 && this.aByteArray1423 != null) {
            int[] var9 = new int[this.anInt702];

            int var10;
            for (var10 = 0; var10 < this.anInt574; ++var10) {
                if (this.aByteArray1423[var10] != -1) {
                    ++var9[this.aByteArray1423[var10] & 255];
                }
            }

            var8.anInt575 = 0;

            for (var10 = 0; var10 < this.anInt702; ++var10) {
                if (var9[var10] > 0 && this.aByteArray1438[var10] == 0) {
                    ++var8.anInt575;
                }
            }

            var8.anIntArray782 = new int[var8.anInt575];
            var8.anIntArray1103 = new int[var8.anInt575];
            var8.anIntArray781 = new int[var8.anInt575];
            var10 = 0;

            int var12;
            for (var12 = 0; var12 < this.anInt702; ++var12) {
                if (var9[var12] > 0 && this.aByteArray1438[var12] == 0) {
                    var8.anIntArray782[var10] = this.aShortArray718[var12] & '\uffff';
                    var8.anIntArray1103[var10] = this.aShortArray724[var12] & '\uffff';
                    var8.anIntArray781[var10] = this.aShortArray719[var12] & '\uffff';
                    var9[var12] = var10++;
                } else {
                    var9[var12] = -1;
                }
            }

            var8.aByteArray1752 = new byte[this.anInt574];

            for (var12 = 0; var12 < this.anInt574; ++var12) {
                if (this.aByteArray1423[var12] != -1) {
                    var8.aByteArray1752[var12] = (byte) var9[this.aByteArray1423[var12] & 255];
                } else {
                    var8.aByteArray1752[var12] = -1;
                }
            }
        }

        for (int var11 = 0; var11 < this.anInt574; ++var11) {
            byte var17;
            if (this.aByteArray1440 == null) {
                var17 = 0;
            } else {
                var17 = this.aByteArray1440[var11];
            }

            byte var18;
            if (this.aByteArray1425 == null) {
                var18 = 0;
            } else {
                var18 = this.aByteArray1425[var11];
            }

            short var13;
            if (this.aShortArray1421 == null) {
                var13 = -1;
            } else {
                var13 = this.aShortArray1421[var11];
            }

            if (var18 == -2) {
                var17 = 3;
            }

            if (var18 == -1) {
                var17 = 2;
            }

            Vertex var15;
            int var16;
            Face var19;
            if (var13 == -1) {
                if (var17 != 0) {
                    if (var17 == 1) {
                        var19 = this.aClass104Array1432[var11];
                        var16 = (var4 * var19.anInt770 + var5 * var19.anInt769 + var3 * var19.anInt772) / (var7 / 2 + var7) + var1;
                        var8.anIntArray374[var11] = method974(this.aShortArray1435[var11] & '\uffff', var16);
                        var8.anIntArray689[var11] = -1;
                    } else if (var17 == 3) {
                        var8.anIntArray374[var11] = 128;
                        var8.anIntArray689[var11] = -1;
                    } else {
                        var8.anIntArray689[var11] = -2;
                    }
                } else {
                    int var14 = this.aShortArray1435[var11] & '\uffff';
                    if (this.aClass96Array1422 != null && this.aClass96Array1422[this.anIntArray747[var11]] != null) {
                        var15 = this.aClass96Array1422[this.anIntArray747[var11]];
                    } else {
                        var15 = this.aClass96Array1431[this.anIntArray747[var11]];
                    }

                    var16 = (var4 * var15.anInt727 + var5 * var15.anInt726 + var3 * var15.anInt729) / (var7 * var15.anInt728) + var1;
                    var8.anIntArray374[var11] = method974(var14, var16);
                    if (this.aClass96Array1422 != null && this.aClass96Array1422[this.anIntArray687[var11]] != null) {
                        var15 = this.aClass96Array1422[this.anIntArray687[var11]];
                    } else {
                        var15 = this.aClass96Array1431[this.anIntArray687[var11]];
                    }

                    var16 = (var4 * var15.anInt727 + var5 * var15.anInt726 + var3 * var15.anInt729) / (var7 * var15.anInt728) + var1;
                    var8.anIntArray1469[var11] = method974(var14, var16);
                    if (this.aClass96Array1422 != null && this.aClass96Array1422[this.anIntArray692[var11]] != null) {
                        var15 = this.aClass96Array1422[this.anIntArray692[var11]];
                    } else {
                        var15 = this.aClass96Array1431[this.anIntArray692[var11]];
                    }

                    var16 = (var4 * var15.anInt727 + var5 * var15.anInt726 + var3 * var15.anInt729) / (var7 * var15.anInt728) + var1;
                    var8.anIntArray689[var11] = method974(var14, var16);
                }
            } else if (var17 != 0) {
                if (var17 == 1) {
                    var19 = this.aClass104Array1432[var11];
                    var16 = (var4 * var19.anInt770 + var5 * var19.anInt769 + var3 * var19.anInt772) / (var7 / 2 + var7) + var1;
                    var8.anIntArray374[var11] = method968(var16);
                    var8.anIntArray689[var11] = -1;
                } else {
                    var8.anIntArray689[var11] = -2;
                }
            } else {
                if (this.aClass96Array1422 != null && this.aClass96Array1422[this.anIntArray747[var11]] != null) {
                    var15 = this.aClass96Array1422[this.anIntArray747[var11]];
                } else {
                    var15 = this.aClass96Array1431[this.anIntArray747[var11]];
                }

                var16 = (var4 * var15.anInt727 + var5 * var15.anInt726 + var3 * var15.anInt729) / (var7 * var15.anInt728) + var1;
                var8.anIntArray374[var11] = method968(var16);
                if (this.aClass96Array1422 != null && this.aClass96Array1422[this.anIntArray687[var11]] != null) {
                    var15 = this.aClass96Array1422[this.anIntArray687[var11]];
                } else {
                    var15 = this.aClass96Array1431[this.anIntArray687[var11]];
                }

                var16 = (var4 * var15.anInt727 + var5 * var15.anInt726 + var3 * var15.anInt729) / (var7 * var15.anInt728) + var1;
                var8.anIntArray1469[var11] = method968(var16);
                if (this.aClass96Array1422 != null && this.aClass96Array1422[this.anIntArray692[var11]] != null) {
                    var15 = this.aClass96Array1422[this.anIntArray692[var11]];
                } else {
                    var15 = this.aClass96Array1431[this.anIntArray692[var11]];
                }

                var16 = (var4 * var15.anInt727 + var5 * var15.anInt726 + var3 * var15.anInt729) / (var7 * var15.anInt728) + var1;
                var8.anIntArray689[var11] = method968(var16);
            }
        }

        this.method828();
        var8.anInt574 = this.anInt380;
        var8.xVertices = this.xVertices;
        var8.yVertices = this.yVertices;
        var8.zVertices = this.zVertices;
        var8.anInt379 = this.anInt574;
        var8.xTriangles = this.anIntArray747;
        var8.yTriangles = this.anIntArray687;
        var8.zTriangles = this.anIntArray692;
        var8.aByteArray1757 = this.aByteArray1428;
        var8.aByteArray1438 = this.aByteArray1425;
        var8.aByte1753 = this.defaultRenderPriority;
        var8.anIntArrayArray1755 = this.anIntArrayArray1429;
        var8.anIntArrayArray1754 = this.anIntArrayArray1426;
        var8.aShortArray724 = this.aShortArray1421;
        return var8;
    }

    public void method975(byte[] var1) {
        Buffer var2 = new Buffer(var1);
        Buffer var3 = new Buffer(var1);
        Buffer var4 = new Buffer(var1);
        Buffer var5 = new Buffer(var1);
        Buffer var6 = new Buffer(var1);
        Buffer var7 = new Buffer(var1);
        Buffer var8 = new Buffer(var1);
        var2.caret = var1.length - 23;
        int var9 = var2.readUShort();
        int var10 = var2.readUShort();
        int var11 = var2.readUByte();
        int var12 = var2.readUByte();
        int var13 = var2.readUByte();
        int var14 = var2.readUByte();
        int var15 = var2.readUByte();
        int var16 = var2.readUByte();
        int var17 = var2.readUByte();
        int var18 = var2.readUShort();
        int var19 = var2.readUShort();
        int var20 = var2.readUShort();
        int var21 = var2.readUShort();
        int var22 = var2.readUShort();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26;
        if (var11 > 0) {
            this.aByteArray1438 = new byte[var11];
            var2.caret = 0;

            for (var26 = 0; var26 < var11; ++var26) {
                byte var27 = this.aByteArray1438[var26] = var2.readByte();
                if (var27 == 0) {
                    ++var23;
                }

                if (var27 >= 1 && var27 <= 3) {
                    ++var24;
                }

                if (var27 == 2) {
                    ++var25;
                }
            }
        }

        var26 = var11 + var9;
        int var28 = var26;
        if (var12 == 1) {
            var26 += var10;
        }

        int var29 = var26;
        var26 += var10;
        int var30 = var26;
        if (var13 == 255) {
            var26 += var10;
        }

        int var31 = var26;
        if (var15 == 1) {
            var26 += var10;
        }

        int var32 = var26;
        if (var17 == 1) {
            var26 += var9;
        }

        int var33 = var26;
        if (var14 == 1) {
            var26 += var10;
        }

        int var34 = var26;
        var26 += var21;
        int var35 = var26;
        if (var16 == 1) {
            var26 += var10 * 2;
        }

        int var36 = var26;
        var26 += var22;
        int var37 = var26;
        var26 += var10 * 2;
        int var38 = var26;
        var26 += var18;
        int var39 = var26;
        var26 += var19;
        int var40 = var26;
        var26 += var20;
        int var41 = var26;
        var26 += var23 * 6;
        int var42 = var26;
        var26 += var24 * 6;
        int var43 = var26;
        var26 += var24 * 6;
        int var44 = var26;
        var26 += var24 * 2;
        int var45 = var26;
        var26 += var24;
        int var46 = var26;
        var26 += var24 * 2 + var25 * 2;
        this.anInt380 = var9;
        this.anInt574 = var10;
        this.anInt702 = var11;
        this.xVertices = new int[var9];
        this.yVertices = new int[var9];
        this.zVertices = new int[var9];
        this.anIntArray747 = new int[var10];
        this.anIntArray687 = new int[var10];
        this.anIntArray692 = new int[var10];
        if (var17 == 1) {
            this.anIntArray787 = new int[var9];
        }

        if (var12 == 1) {
            this.aByteArray1440 = new byte[var10];
        }

        if (var13 == 255) {
            this.aByteArray1428 = new byte[var10];
        } else {
            this.defaultRenderPriority = (byte) var13;
        }

        if (var14 == 1) {
            this.aByteArray1425 = new byte[var10];
        }

        if (var15 == 1) {
            this.anIntArray782 = new int[var10];
        }

        if (var16 == 1) {
            this.aShortArray1421 = new short[var10];
        }

        if (var16 == 1 && var11 > 0) {
            this.aByteArray1423 = new byte[var10];
        }

        this.aShortArray1435 = new short[var10];
        if (var11 > 0) {
            this.aShortArray718 = new short[var11];
            this.aShortArray724 = new short[var11];
            this.aShortArray719 = new short[var11];
        }

        var2.caret = var11;
        var3.caret = var38;
        var4.caret = var39;
        var5.caret = var40;
        var6.caret = var32;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;

        int var51;
        int var52;
        int var53;
        int var54;
        int var55;
        for (var51 = 0; var51 < var9; ++var51) {
            var52 = var2.readUByte();
            var53 = 0;
            if ((var52 & 1) != 0) {
                var53 = var3.method1046();
            }

            var54 = 0;
            if ((var52 & 2) != 0) {
                var54 = var4.method1046();
            }

            var55 = 0;
            if ((var52 & 4) != 0) {
                var55 = var5.method1046();
            }

            this.xVertices[var51] = var48 + var53;
            this.yVertices[var51] = var49 + var54;
            this.zVertices[var51] = var50 + var55;
            var48 = this.xVertices[var51];
            var49 = this.yVertices[var51];
            var50 = this.zVertices[var51];
            if (var17 == 1) {
                this.anIntArray787[var51] = var6.readUByte();
            }
        }

        var2.caret = var37;
        var3.caret = var28;
        var4.caret = var30;
        var5.caret = var33;
        var6.caret = var31;
        var7.caret = var35;
        var8.caret = var36;

        for (var51 = 0; var51 < var10; ++var51) {
            this.aShortArray1435[var51] = (short) var2.readUShort();
            if (var12 == 1) {
                this.aByteArray1440[var51] = var3.readByte();
            }

            if (var13 == 255) {
                this.aByteArray1428[var51] = var4.readByte();
            }

            if (var14 == 1) {
                this.aByteArray1425[var51] = var5.readByte();
            }

            if (var15 == 1) {
                this.anIntArray782[var51] = var6.readUByte();
            }

            if (var16 == 1) {
                this.aShortArray1421[var51] = (short) (var7.readUShort() - 1);
            }

            if (this.aByteArray1423 != null && this.aShortArray1421[var51] != -1) {
                this.aByteArray1423[var51] = (byte) (var8.readUByte() - 1);
            }
        }

        var2.caret = var34;
        var3.caret = var29;
        var51 = 0;
        var52 = 0;
        var53 = 0;
        var54 = 0;

        int var56;
        for (var55 = 0; var55 < var10; ++var55) {
            var56 = var3.readUByte();
            if (var56 == 1) {
                var51 = var2.method1046() + var54;
                var52 = var2.method1046() + var51;
                var53 = var2.method1046() + var52;
                var54 = var53;
                this.anIntArray747[var55] = var51;
                this.anIntArray687[var55] = var52;
                this.anIntArray692[var55] = var53;
            }

            if (var56 == 2) {
                var52 = var53;
                var53 = var2.method1046() + var54;
                var54 = var53;
                this.anIntArray747[var55] = var51;
                this.anIntArray687[var55] = var52;
                this.anIntArray692[var55] = var53;
            }

            if (var56 == 3) {
                var51 = var53;
                var53 = var2.method1046() + var54;
                var54 = var53;
                this.anIntArray747[var55] = var51;
                this.anIntArray687[var55] = var52;
                this.anIntArray692[var55] = var53;
            }

            if (var56 == 4) {
                int var57 = var51;
                var51 = var52;
                var52 = var57;
                var53 = var2.method1046() + var54;
                var54 = var53;
                this.anIntArray747[var55] = var51;
                this.anIntArray687[var55] = var57;
                this.anIntArray692[var55] = var53;
            }
        }

        var2.caret = var41;
        var3.caret = var42;
        var4.caret = var43;
        var5.caret = var44;
        var6.caret = var45;
        var7.caret = var46;

        for (var55 = 0; var55 < var11; ++var55) {
            var56 = this.aByteArray1438[var55] & 255;
            if (var56 == 0) {
                this.aShortArray718[var55] = (short) var2.readUShort();
                this.aShortArray724[var55] = (short) var2.readUShort();
                this.aShortArray719[var55] = (short) var2.readUShort();
            }
        }

        var2.caret = var26;
        var55 = var2.readUByte();
        if (var55 != 0) {
            new Statics3();
            var2.readUShort();
            var2.readUShort();
            var2.readUShort();
            var2.readInt();
        }

    }

    public void method976(int var1, int var2, int var3) {
        for (int var4 = 0; var4 < this.anInt380; ++var4) {
            int[] var10000 = this.xVertices;
            var10000[var4] += var1;
            var10000 = this.yVertices;
            var10000[var4] += var2;
            var10000 = this.zVertices;
            var10000[var4] += var3;
        }

        this.method580();
    }

    public UnlitModel method977(int[][] var1, int var2, int var3, int var4, int var6) {
        this.method973();
        int var7 = var2 + this.anInt1436;
        int var8 = var2 + this.anInt556;
        int var9 = var4 + this.anInt1437;
        int var10 = var4 + this.anInt579;
        if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
            var7 >>= 7;
            var8 = var8 + 127 >> 7;
            var9 >>= 7;
            var10 = var10 + 127 >> 7;
            if (var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) {
                return this;
            }
            UnlitModel var11 = new UnlitModel();
            var11.anInt380 = this.anInt380;
            var11.anInt574 = this.anInt574;
            var11.anInt702 = this.anInt702;
            var11.xVertices = this.xVertices;
            var11.zVertices = this.zVertices;
            var11.anIntArray747 = this.anIntArray747;
            var11.anIntArray687 = this.anIntArray687;
            var11.anIntArray692 = this.anIntArray692;
            var11.aByteArray1440 = this.aByteArray1440;
            var11.aByteArray1428 = this.aByteArray1428;
            var11.aByteArray1425 = this.aByteArray1425;
            var11.aByteArray1423 = this.aByteArray1423;
            var11.aShortArray1435 = this.aShortArray1435;
            var11.aShortArray1421 = this.aShortArray1421;
            var11.defaultRenderPriority = this.defaultRenderPriority;
            var11.aByteArray1438 = this.aByteArray1438;
            var11.aShortArray718 = this.aShortArray718;
            var11.aShortArray724 = this.aShortArray724;
            var11.aShortArray719 = this.aShortArray719;
            var11.anIntArray787 = this.anIntArray787;
            var11.anIntArray782 = this.anIntArray782;
            var11.anIntArrayArray1429 = this.anIntArrayArray1429;
            var11.anIntArrayArray1426 = this.anIntArrayArray1426;
            var11.aShort1441 = this.aShort1441;
            var11.aShort1439 = this.aShort1439;
            var11.yVertices = new int[var11.anInt380];
            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if (var6 == 0) {
                for (var12 = 0; var12 < var11.anInt380; ++var12) {
                    var13 = var2 + this.xVertices[var12];
                    var14 = var4 + this.zVertices[var12];
                    var15 = var13 & 127;
                    var16 = var14 & 127;
                    var17 = var13 >> 7;
                    var18 = var14 >> 7;
                    var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                    var20 = var1[var17][var18 + 1] * (128 - var15) + var15 * var1[var17 + 1][var18 + 1] >> 7;
                    var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                    var11.yVertices[var12] = var21 + this.yVertices[var12] - var3;
                }
            } else {
                for (var12 = 0; var12 < var11.anInt380; ++var12) {
                    var13 = (-this.yVertices[var12] << 16) / super.height;
                    if (var13 < var6) {
                        var14 = var2 + this.xVertices[var12];
                        var15 = var4 + this.zVertices[var12];
                        var16 = var14 & 127;
                        var17 = var15 & 127;
                        var18 = var14 >> 7;
                        var19 = var15 >> 7;
                        var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                        var21 = var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][var19 + 1] >> 7;
                        int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                        var11.yVertices[var12] = (var6 - var13) * (var22 - var3) / var6 + this.yVertices[var12];
                    }
                }
            }

            var11.method580();
            return var11;
        }
        return this;
    }

    public void method828() {
        int[] var1;
        int var2;
        int var10002;
        int var3;
        int var4;
        if (this.anIntArray787 != null) {
            var1 = new int[256];
            var2 = 0;

            for (var3 = 0; var3 < this.anInt380; ++var3) {
                var4 = this.anIntArray787[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }

            this.anIntArrayArray1429 = new int[var2 + 1][];

            for (var3 = 0; var3 <= var2; ++var3) {
                this.anIntArrayArray1429[var3] = new int[var1[var3]];
                var1[var3] = 0;
            }

            for (var3 = 0; var3 < this.anInt380; this.anIntArrayArray1429[var4][var1[var4]++] = var3++) {
                var4 = this.anIntArray787[var3];
            }

            this.anIntArray787 = null;
        }

        if (this.anIntArray782 != null) {
            var1 = new int[256];
            var2 = 0;

            for (var3 = 0; var3 < this.anInt574; ++var3) {
                var4 = this.anIntArray782[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }

            this.anIntArrayArray1426 = new int[var2 + 1][];

            for (var3 = 0; var3 <= var2; ++var3) {
                this.anIntArrayArray1426[var3] = new int[var1[var3]];
                var1[var3] = 0;
            }

            for (var3 = 0; var3 < this.anInt574; this.anIntArrayArray1426[var4][var1[var4]++] = var3++) {
                var4 = this.anIntArray782[var3];
            }

            this.anIntArray782 = null;
        }

    }

    public void method981() {
        int var1;
        for (var1 = 0; var1 < this.anInt380; ++var1) {
            this.zVertices[var1] = -this.zVertices[var1];
        }

        for (var1 = 0; var1 < this.anInt574; ++var1) {
            int var2 = this.anIntArray747[var1];
            this.anIntArray747[var1] = this.anIntArray692[var1];
            this.anIntArray692[var1] = var2;
        }

        this.method580();
    }

    public void method302(int var1) {
        int var2 = anIntArray1433[var1];
        int var3 = anIntArray1427[var1];

        for (int var4 = 0; var4 < this.anInt380; ++var4) {
            int var5 = var2 * this.zVertices[var4] + var3 * this.xVertices[var4] >> 16;
            this.zVertices[var4] = var3 * this.zVertices[var4] - var2 * this.xVertices[var4] >> 16;
            this.xVertices[var4] = var5;
        }

        this.method580();
    }

    public void method886() {
        for (int var1 = 0; var1 < this.anInt380; ++var1) {
            int var2 = this.xVertices[var1];
            this.xVertices[var1] = this.zVertices[var1];
            this.zVertices[var1] = -var2;
        }

        this.method580();
    }

    public void method972() {
        for (int var1 = 0; var1 < this.anInt380; ++var1) {
            this.xVertices[var1] = -this.xVertices[var1];
            this.zVertices[var1] = -this.zVertices[var1];
        }

        this.method580();
    }

    public void method969() {
        for (int var1 = 0; var1 < this.anInt380; ++var1) {
            int var2 = this.zVertices[var1];
            this.zVertices[var1] = this.xVertices[var1];
            this.xVertices[var1] = -var2;
        }

        this.method580();
    }

    public final int method979(UnlitModel var1, int var2) {
        int var3 = -1;
        int var4 = var1.xVertices[var2];
        int var5 = var1.yVertices[var2];
        int var6 = var1.zVertices[var2];

        for (int var7 = 0; var7 < this.anInt380; ++var7) {
            if (var4 == this.xVertices[var7] && var5 == this.yVertices[var7] && var6 == this.zVertices[var7]) {
                var3 = var7;
                break;
            }
        }

        if (var3 == -1) {
            this.xVertices[this.anInt380] = var4;
            this.yVertices[this.anInt380] = var5;
            this.zVertices[this.anInt380] = var6;
            if (var1.anIntArray787 != null) {
                this.anIntArray787[this.anInt380] = var1.anIntArray787[var2];
            }

            var3 = this.anInt380++;
        }

        return var3;
    }
}
