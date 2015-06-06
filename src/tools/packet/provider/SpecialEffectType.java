package tools.packet.provider;

/**
 *
 * @author 黯淡
 */
public enum SpecialEffectType {
    //等級提升[178-完成]
    LEVEL_UP(0),
    //近端技能特效[178-完成]
    LOCAL_SKILL_EFFECT(1),
    //遠端技能特效[178-完成]
    REMOTE_SKILL_EFFECT(2),
    //神之子特效[178-完成]
    ZERO_EFFECT(3),
    //機甲戰神-輔助機器特效[178-完成]
    MECHANIC_EFFECT(4),
    UNK5(5),
    UNK6(6),
    //物品獲得/丟棄文字特效[178-完成]
    ITEM_OPERATION_EFFECT(7),
    //技能飛行體特效[178-完成]
    SKILL_FLYING_OBJECT(9),
    UNK10(10),
    //職業變更[178-完成]
    CHANGE_JOB(14),
    //任務完成[178-完成]
    QUET_COMPLETE(15),
    //暗夜行者技能特效[178-完成]
    FIRE_EFFECT(68),
    
    ;
    private final int value;
    private SpecialEffectType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
}
