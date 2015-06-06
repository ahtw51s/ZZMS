/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.inventory;

/**
 *
 * @author Pungin
 */
public enum EchantScroll {

    攻擊_力量_100("攻擊(力量)", 100, 16, 155, EchantEquipStat.STR.getValue() | EchantEquipStat.WATK.getValue(), new int[]{1, 3}),
    攻擊_力量_70("攻擊(力量)", 70, 20, 200, EchantEquipStat.STR.getValue() | EchantEquipStat.WATK.getValue(), new int[]{2, 5}),
    攻擊_力量_30("攻擊(力量)", 30, 24, 240, EchantEquipStat.STR.getValue() | EchantEquipStat.WATK.getValue(), new int[]{3, 7}),
    攻擊_力量_15("攻擊(力量)", 15, 29, 290, EchantEquipStat.STR.getValue() | EchantEquipStat.WATK.getValue(), new int[]{4, 9}),
    魔力_智力_100("魔力(智力)", 100, 16, 155, EchantEquipStat.INT.getValue() | EchantEquipStat.MATK.getValue(), new int[]{1, 3}),
    魔力_智力_70("魔力(智力)", 70, 20, 200, EchantEquipStat.INT.getValue() | EchantEquipStat.MATK.getValue(), new int[]{2, 5}),
    魔力_智力_30("魔力(智力)", 30, 24, 240, EchantEquipStat.INT.getValue() | EchantEquipStat.MATK.getValue(), new int[]{3, 7}),
    魔力_智力_15("魔力(智力)", 15, 29, 290, EchantEquipStat.INT.getValue() | EchantEquipStat.MATK.getValue(), new int[]{4, 9}),
    攻擊_敏捷_100("攻擊(敏捷)", 100, 16, 155, EchantEquipStat.DEX.getValue() | EchantEquipStat.WATK.getValue(), new int[]{1, 3}),
    攻擊_敏捷_70("攻擊(敏捷)", 70, 20, 200, EchantEquipStat.DEX.getValue() | EchantEquipStat.WATK.getValue(), new int[]{2, 5}),
    攻擊_敏捷_30("攻擊(敏捷)", 30, 24, 240, EchantEquipStat.DEX.getValue() | EchantEquipStat.WATK.getValue(), new int[]{3, 7}),
    攻擊_敏捷_15("攻擊(敏捷)", 15, 29, 290, EchantEquipStat.DEX.getValue() | EchantEquipStat.WATK.getValue(), new int[]{4, 9}),
    攻擊_運氣_100("攻擊(運氣)", 100, 16, 155, EchantEquipStat.LUK.getValue() | EchantEquipStat.WATK.getValue(), new int[]{1, 3}),
    攻擊_運氣_70("攻擊(運氣)", 70, 20, 200, EchantEquipStat.LUK.getValue() | EchantEquipStat.WATK.getValue(), new int[]{2, 5}),
    攻擊_運氣_30("攻擊(運氣)", 30, 24, 240, EchantEquipStat.LUK.getValue() | EchantEquipStat.WATK.getValue(), new int[]{3, 7}),
    攻擊_運氣_15("攻擊(運氣)", 15, 29, 290, EchantEquipStat.LUK.getValue() | EchantEquipStat.WATK.getValue(), new int[]{4, 9}),
    攻擊_體力_100("攻擊(體力)", 100, 16, 155, EchantEquipStat.MHP.getValue() | EchantEquipStat.WATK.getValue(), new int[]{1, 3}),
    攻擊_體力_70("攻擊(體力)", 70, 20, 200, EchantEquipStat.MHP.getValue() | EchantEquipStat.WATK.getValue(), new int[]{2, 5}),
    攻擊_體力_30("攻擊(體力)", 30, 24, 240, EchantEquipStat.MHP.getValue() | EchantEquipStat.WATK.getValue(), new int[]{3, 7}),
    攻擊_體力_15("攻擊(體力)", 15, 29, 290, EchantEquipStat.MHP.getValue() | EchantEquipStat.WATK.getValue(), new int[]{4, 9}),
    攻擊_100("攻擊", 100, 9, 155, EchantEquipStat.WATK.getValue(), new int[]{1}),
    攻擊_70("攻擊", 70, 11, 200, EchantEquipStat.WATK.getValue(), new int[]{2}),
    攻擊_30("攻擊", 30, 14, 240, EchantEquipStat.WATK.getValue(), new int[]{3}),
    魔力_100("魔力", 100, 9, 155, EchantEquipStat.MATK.getValue(), new int[]{1}),
    魔力_70("魔力", 70, 11, 200, EchantEquipStat.MATK.getValue(), new int[]{2}),
    魔力_30("魔力", 30, 14, 240, EchantEquipStat.MATK.getValue(), new int[]{3}),
    力量_100("力量", 100, 26, 155, EchantEquipStat.STR.getValue(), new int[]{3}),
    力量_70("力量", 70, 34, 200, EchantEquipStat.STR.getValue(), new int[]{4}),
    力量_30("力量", 30, 40, 240, EchantEquipStat.STR.getValue(), new int[]{7}),
    體力_100("體力", 100, 26, 155, EchantEquipStat.MHP.getValue(), new int[]{3}),
    體力_70("體力", 70, 34, 200, EchantEquipStat.MHP.getValue(), new int[]{4}),
    體力_30("體力", 30, 40, 240, EchantEquipStat.MHP.getValue(), new int[]{7}),
    智力_100("智力", 100, 26, 155, EchantEquipStat.INT.getValue(), new int[]{3}),
    智力_70("智力", 70, 34, 200, EchantEquipStat.INT.getValue(), new int[]{4}),
    智力_30("智力", 30, 40, 240, EchantEquipStat.INT.getValue(), new int[]{7}),
    敏捷_100("敏捷", 100, 26, 155, EchantEquipStat.DEX.getValue(), new int[]{3}),
    敏捷_70("敏捷", 70, 34, 200, EchantEquipStat.DEX.getValue(), new int[]{4}),
    敏捷_30("敏捷", 30, 40, 240, EchantEquipStat.DEX.getValue(), new int[]{7}),
    運氣_100("運氣", 100, 26, 155, EchantEquipStat.LUK.getValue(), new int[]{3}),
    運氣_70("運氣", 70, 34, 200, EchantEquipStat.LUK.getValue(), new int[]{4}),
    運氣_30("運氣", 30, 40, 240, EchantEquipStat.LUK.getValue(), new int[]{7}),
    ;

    private final String name;
    private final int successRate;
    private final int viewType;
    private final int cost;
    private final int mask;
    private final int[] values;

    private EchantScroll(String name, int successRate, int viewType, int cost, int mask, int[] values) {
        this.name = name;
        this.successRate = successRate;
        this.viewType = viewType;
        this.cost = cost;
        this.mask = mask;
        this.values = values;
    }

    public String getName() {
        return successRate + "% " + name + "卷軸";
    }

    public int getSuccessRate() {
        return successRate;
    }

    public int getViewType() {
        return viewType;
    }

    public int getCost() {
        return cost;
    }

    public int getMask() {
        return mask;
    }

    public int[] getValues() {
        return values;
    }
}
