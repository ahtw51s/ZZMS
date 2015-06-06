package client;

public enum ExpMasks {

    EVENT_BONUS(0x1), // [Int] 活動獎勵經驗值(+%d)
    MONSTER_PERCENT(0x2), // [Byte] 怪物額外經驗值(+%d%)
    EVENT_PARTY_BONUS(0x4),// [Byte] 活動組隊經驗值(+%d)
    // 0x8 [Byte]
    PARTY_BONUS(0x10), // [Int] 組隊經驗值(+%d)
    WEDDING_BONUS(0x20), // [Int] 結婚紅利經驗值(+%d)
    EQUIP_BONUS(0x40), // [Int] 道具裝備紅利經驗值(+%d)
    INTERNET_CAFE_BONUS(0x80), // [Int] 高級服務贈送經驗值(+%d)
    RAINBOW_WEEK_BONUS(0x100), // [Int] 彩虹週獎勵經驗值(+%d)
    BOOM_UP_BONUS(0x200), // [Int] 爆發獎勵經驗值(+%d)
    ELIXIR_BONUS(0x400), // [Int] 秘藥額外經驗值(+%d)
    SKILL_BONUS(0x800), // [Int] (null)額外經驗值(+%d)
    BUFF_BONUS(0x1000), // [Int] 加持獎勵經驗值(+%d)
    REST_BONUS(0x2000), // [Int] 休息獎勵經驗值(+%d)
    ITEM_BONUS(0x4000), // [Int] 道具獎勵經驗值(+%d)
    ASWAN_WINNER_BONUS(0x8000), // [Int] 阿斯旺勝利者獎勵經驗值(+%d)
    ITEM_PERCENT_BONUS(0x10000), // [Int] 依道具%增加經驗值(+%d)
    VALUE_PACK_BONUS(0x20000), // [Int] 超值包獎勵經驗值(+%d)
    ITEM_PARTYQUEST_PERCENT_BONUS(0x40000), // [Int] 依道具的組隊任務%增加經驗值(+%d)
    ADDITIONAL_BONUS(0x80000), // [Int] 獲得追加經驗值(+%d)
    BLOOD_ALLIANCE_BONUS(0x100000),; // [Int] 家族經驗值獎勵(+%d)

    final int value;

    private ExpMasks(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
