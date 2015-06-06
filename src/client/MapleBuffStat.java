package client;

import handling.Buffstat;
import java.io.Serializable;

public enum MapleBuffStat implements Serializable, Buffstat {

    //==========================Mask[0] - 1 - IDA[0xE]
 
    // 0    
//==========================Mask[0] - 1 - IDA[0xE]
 
    // 0    
    TEST_BUFF0(0, true),
    //提升最大爆擊                      [完成-179]
    INDIE_CR(1, true),
    // 2
    TEST_BUFF2(2, true),
    //物理攻擊力增加                    [完成-179]
    INDIE_PAD(3, true),//indiePad
    //魔法攻擊力增加                    [完成-179]
    INDIE_MAD(4, true),//indieMad
    //物理防御力增加                    [完成-179]
    INDIE_PDD(5, true),//indiePdd
    //魔法防御力增加                    [完成-179]
    INDIE_MDD(6, true),//indieMdd
    //最大體力                          [完成-179]
    INDIE_MAX_HP(7, true), //indieMaxHp, indieMhp
    //最大體力百分比                    [完成-179]
    INDIE_MHP_R(8, true), //indieMhpR
    //最大魔法                          [完成-179]
    INDIE_MAX_MP(9, true),//indieMaxMp
    //最大魔法百分比                    [完成-179]
    INDIE_MMP_R(10, true), //indieMmpR
    //命中值增加                        [完成-179]
    INDIE_ACC(11, true),//indieAcc
    //提升迴避值                        [完成-179]
    INDIE_EVA(12, true),
    //疾速之輪行蹤
    INDIE_JUMP(13, true),
    //疾速之輪行蹤                      [完成-179]
    INDIE_SPEED(14, true),
    //所有能力提升
    INDIE_ALL_STATE(15, true), //indieAllStat 
    // 16
    TEST_BUFF16(16, true),
    //疾速之輪行蹤 & 重生的輪行蹤        [完成-179]
    INDIE_EXP(17, true), //indieExp
    //攻擊速度提升                      [完成-179]
    INDIE_BOOSTER(18, true), //indieBooster
    // 19
    TEST_BUFF19(19, true),
    // 20
    TEST_BUFF20(20, true),
    // 21
    TEST_BUFF21(21, true),
    // 22
    TEST_BUFF22(22, true),
    // 23 
    STACKING_ATK(23, true),
    // 24
    TEST_BUFF24(24, true),
    //提高STR                          [完成-179] 
    INDIE_STR(25, true),
    //提高DEX                          [完成-179] 
    INDIE_DEX(26, true),
    //提高INT                          [完成-179] 
    INDIE_INT(27, true),
    //提高LUK                          [完成-179]  
    INDIE_LUK(28, true),    
    //提高技能攻擊力                    [完成-179]
    INDIE_DAM_R(29, true),//indieDamR
    // 30
    TEST_BUFF30(30, true),
    // 31
    TEST_BUFF31(31, true),
    
    //==========================Mask[1] - 2 - IDA[0xD]
    
    //傷害最大值
    INDIE_MAX_DAMAGE_OVER(32, true),
    //物理傷害減少百分比(重生的輪行蹤)   [完成-179]
    INDIE_ASR_R(33, true), //indieAsrR
    //魔法傷害減少百分比(重生的輪行蹤)   [完成-179]
    INDIE_TER_R(34, true), //indieTerR
    //爆擊率提升                        [完成-179]
    INDIE_CR_R(35, true),
    //超衝擊防禦_防禦力                 [完成-179]
    INDIE_PDD_R(36, true), 
    //提升最大爆擊                      [完成-179]
    INDIE_MAX_CR(37, true),    
    //提升BOSS攻擊力                    [完成-179]
    INDIE_BOSS(38, true),
    //提升所有屬性                      [完成-179]
    INDIE_ALL_STATE_R(39, true),
    //提升檔格                          [完成-179]
    INDIE_STANCE_R(40, true),
    //提升無視防禦                      [完成-179]
    INDIE_IGNORE_MOB_PDP_R(41, true), //indieIgnoreMobpdpR    
    // 42
    TEST_BUFF42(42, true),
    // 43
    TEST_BUFF43(43, true),
    //提升攻擊％                        [完成-179]
    INDIE_PAD_R(44, true),
    //提升最大爆擊％                    [完成-179]
    INDIE_MAX_CR_R(45, true),
    //提升所有迴避值％                  [完成-179]
    INDIE_EVA_R(46, true),
    //提升魔法防禦力％                  [完成-179]
    INDIE_MDD_R(47, true),
    // 48
    TEST_BUFF48(48, true),
    // 49
    TEST_BUFF49(49, true),
    //物理攻擊力                        [完成-179]
    WATK(50),
    //物理防御力                        [完成-179]
    WDEF(51),
    //魔法攻擊力                        [完成-179]
    MATK(52),
    //魔法防御力                        [完成-179]
    MDEF(53),
    //命中率                            [完成-179]
    ACC(54),
    //迴避率                            [完成-179]
    AVOID(55),
    //手技                              [完成-179]
    HANDS(56),
    //移動速度                          [完成-179]
    SPEED(57),
    //跳躍力                            [完成-179]
    JUMP(58),
    //魔心防禦                          [完成-179]
    MAGIC_GUARD(59),
    //隱藏術                            [完成-179]
    DARKSIGHT(60),
    //攻擊加速                          [完成-179]
    BOOSTER(61),
    //傷害反擊                          [完成-179]
    POWERGUARD(62),
    //神聖之火_最大MP                   [完成-179]
    MAXMP(63),
    
    //==========================Mask[2] - 3 - IDA[0xC]
    
    //神聖之火_最大HP                   [完成-179]
    MAXHP(64),    
    //神聖之光                          [完成-179]
    INVICIBLE(65),
    //無形之箭                          [完成-179]
    SOULARROW(66),
    //昏迷                              [完成-179]
    STUN(67),
    //中毒
    POISON(68),
    //封印
    SEAL(69),
    //黑暗
    DARKNESS(70),
    //鬥氣集中
    COMBO(71),
    //召喚獸
    SUMMON(71),
    //屬性攻擊
    WK_CHARGE(72),
    //龍之力量
    DRAGONBLOOD(72),
    //神聖祈禱(176-OK)
    HOLY_SYMBOL(73),
    //(CMS_聚財術)
    MESOUP(74),
    //影分身                       [完成-179]
    SHADOWPARTNER(75),
    //勇者掠奪術
    PICKPOCKET(76),
    //替身術
    PUPPET(76),
    //楓幣護盾
    MESOGUARD(77),
    //
    HP_LOSS_GUARD(78),
    //虛弱                          [完成-179]
    WEAKEN(79),
    //詛咒
    CURSE(80),
    //緩慢                          [完成-179]
    SLOW(81),
    //變身                          [完成-179]
    MORPH(82),
    //恢復(176-OK)
    RECOVERY(83),
    //楓葉祝福                      [完成-179]
    MAPLE_WARRIOR(84),
    //格擋(穩如泰山)                [完成-179]
    STANCE(85),
    //銳利之眼                      [完成-179]
    SHARP_EYES(86),
    //魔法反擊
    MANA_REFLECTION(87),
    //誘惑                          [完成-179]
    SEDUCE(88),
    //暗器傷人
    SPIRIT_CLAW(89),
    //時空門
    MYSTIC_DOOR(89),
    //魔力無限
    INFINITY(90),
    //進階祝福                      [完成-179]
    HOLY_SHIELD(91),
    //敏捷提升                      [完成-179]
    HAMSTRING(92),
    //命中率增加
    BLIND(93),
    //集中精力
    CONCENTRATE(94),
    //不死化
    ZOMBIFY(95),
    //英雄的回響                    [完成-179]
    ECHO_OF_HERO(96),
    //==========================Mask[3] - 4 - IDA[0xB]
    //楓幣獲得率
    MESO_RATE(97),
    //鬼魂變身                      [完成-179]
    GHOST_MORPH(98),
    //
    ARIANT_COSS_IMU(98), // The white ball around you
    //混亂
    REVERSE_DIRECTION(99),
    //掉寶幾率
    DROP_RATE(100),
    //經驗倍率
    EXPRATE(101),
    //樂豆倍率
    ACASH_RATE(102),
    //
    ILLUSION(103),
    //解多人Buff用的                    [IDA找的-179]
    PLAYERS_BUFF8(104),
    //解多人Buff用的                    [IDA找的-179]
    PLAYERS_BUFF9(105),
    //狂暴戰魂
    BERSERK_FURY(106),
    //金剛霸體                      [完成-179]
    DIVINE_BODY(107),
    //(CMS_闪光击)
    SPARK(108),
    //(CMS_终极弓剑)
    FINALATTACK(109),
    //隱藏刀(176-OK)
    BLADE_CLONE(110),
    //自然力重置
    ELEMENT_RESET(111),
    //(CMS_风影漫步)
    WIND_WALK(112),
    //組合無限
    UNLIMITED_COMBO(113),
    //矛之鬥氣
    ARAN_COMBO(114),
    //嗜血連擊                      [完成-179]
    COMBO_DRAIN(115),
    //宙斯之盾
    COMBO_BARRIER(115),
    //強化連擊(CMS_戰神抗壓)
    BODY_PRESSURE(116),
    //釘錘(CMS_戰神威勢)
    SMART_KNOCKBACK(117),
    //(CMS_天使狀態)
    PYRAMID_PQ(118),
    //解多人Buff用的                    [IDA找的-179]
    PLAYERS_BUFF10(119),
    //無法使用藥水
    POTION_CURSE(120),
    //影子
    SHADOW(122),
    //致盲
    BLINDNESS(123),
    //緩慢術
    SLOWNESS(124),
    //守護之力(CMS_魔法屏障)
    MAGIC_SHIELD(125),
    //魔法抵抗．改
    MAGIC_RESISTANCE(126),
    //靈魂之石
    SOUL_STONE(127),
    
    //==========================Mask[4] - 5 - IDA[0xA]
    
    //飛天騎乘                      [完成-179]
    SOARING(128),    
    //冰凍                          [完成-179]
    FREEZE(129),
    //雷鳴之劍
    LIGHTNING_CHARGE(130),
    //鬥氣爆發                      [完成-179]
    ENRAGE(131),
    //障礙                          [完成-179]
    BACKSTEP(132),
    //無敵(隱‧鎖鏈地獄、自由精神等)[完成-179]
    INVINCIBILITY(133),
    //絕殺刃(176-OK)
    FINAL_CUT(134),
    //咆哮                          [完成-179]
    DAMAGE_BUFF(135),
    //狂獸附體
    ATTACK_BUFF(136), 
    //地雷                          [完成-179]
    RAINING_MINES(137),
    //增強_MaxHP
    ENHANCED_MAXHP(138),
    //增強_MaxMP
    ENHANCED_MAXMP(139),
    //增強_物理攻擊力                   [完成-179]
    ENHANCED_WATK(140),
    //增強_魔法攻擊力                   [完成-179]
    ENHANCED_MATK(141),
    //增強_物理防禦力                   [完成-179]
    ENHANCED_WDEF(142),
    //增強_魔法防禦力                   [完成-179]
    ENHANCED_MDEF(143),
    //全備型盔甲
    PERFECT_ARMOR(144),
    //終極賽特拉特_PROC                 [IDA找的-179]
    SATELLITESAFE_PROC(145),
    //終極賽特拉特_吸收
    SATELLITESAFE_ABSORB(146),                   
    //颶風
    TORNADO(147),
    //咆哮_會心一擊機率增加               [完成-178]
    CRITICAL_RATE_BUFF(147),
    //咆哮_MaxMP 增加                    [完成-178]
    MP_BUFF(148),
    //咆哮_傷害減少                      [完成-178]
    DAMAGE_TAKEN_BUFF(149),
    //咆哮_迴避機率                      [完成-178]
    DODGE_CHANGE_BUFF(150),
    //
    CONVERSION(151),
    //甦醒(176-OK)
    REAPER(152),
    //潛入                               [完成-179]
    INFILTRATE(154),
    //合金盔甲                           [完成-179]                    
    MECH_CHANGE(155),    
    
    //==========================Mask[5] - 6 - IDA[0x9]
    
    //暴走形态
    FELINE_BERSERK(156),
    //幸运骰子                          [完成-179]
    DICE_ROLL(157),
    //祝福护甲
    DIVINE_SHIELD(158),
    //攻擊增加百分比                    [完成-179]
    DAMAGE_RATE(159),
    //瞬間移動精通
    TELEPORT_MASTERY(160),
    //戰鬥命令
    COMBAT_ORDERS(161),
    //追隨者
    BEHOLDER(162),
    //功能不知道                        [IDA找的-179]
    IDA_UNK_BUFF11(162),
    //裝備潛能無效化
    DISABLE_POTENTIAL(163),    
    //
    GIANT_POTION(164),
    //玛瑙的保佑
    ONYX_SHROUD(165),
    //玛瑙的意志
    ONYX_WILL(166),
    //龍捲風
    TORNADO_CURSE(167),
    //天使祝福
    BLESS(168),    
    //解多人Buff用的                    [IDA找的-178]
    PLAYERS_BUFF4(169),
    //解多人Buff用的                    [IDA找的-178]
    PLAYERS_BUFF6(170),
    //解多人Buff用的                    [IDA找的-178]
    PLAYERS_BUFF7(171),
    //压制术
    THREATEN_PVP(171),
    //解多人Buff用的                    [IDA找的-178]
    PLAYERS_BUFF5(172),
    //冰骑士
    ICE_KNIGHT(172),    
    //解多人Buff用的                    [IDA找的-178]
    PLAYERS_BUFF15(173),    
    //力量(176-OK)
    STR(173),
    //智力(176-OK)
    INT(174),
    //敏捷(176-OK)
    DEX(175),
    //運氣(176-OK)
    LUK(176),
    //未知(未確定)
    ATTACK(177),    
    //未知(未確定)
    STACK_ALLSTATS(178),
    //未知(未確定)
    PVP_DAMAGE(179),
    //IDA移動Buff                       [IDA找的-179]
    IDA_MOVE_BUFF7(180),
    
    // 181
    // 182
    // 183
    
    //解多人Buff用的                    [IDA找的-178]
    PLAYERS_BUFF2(184),
    //解多人Buff用的                    [IDA找的-178]
    PLAYERS_BUFF1(185),
    //解多人Buff用的                    [IDA找的-178]
    PLAYERS_BUFF12(186),
    //未知(未確定)
    PVP_ATTACK(186),
    
    //187
    
    //隱藏潛能(未確定)
    HIDDEN_POTENTIAL(188),
    //未知(未確定)
    ELEMENT_WEAKEN(189),
    //解多人Buff用的                    [IDA找的-178]
    PLAYERS_BUFF3(189),
    //未知(未確定)(90002000)
    SNATCH(190), 
    
    //凍結                              [完成-178]
    FROZEN(190),
    
    // 191
    // 192   
    // 193

    //==========================Mask[6] - 7 - IDA[0x8]
    //未知(未確定)
    PVP_FLAG(194),    
    //無限力量[猜測]
    BOUNDLESS_RAGE(195),        
    //聖十字魔法盾
    HOLY_MAGIC_SHELL(195),
    //核爆術
    BIG_BANG(196),
    //神秘狙擊
    MANY_USES(197),
    //大魔法師(已改成被動,無BUFF)
    BUFF_MASTERY(197),
    //異常抗性                      [完成-179]
    ABNORMAL_STATUS_R(198),
    //屬性抗性                      [完成-179]
    ELEMENTAL_STATUS_R(199),
    //水之盾                        [完成-179]
    WATER_SHIELD(200),
    //變形                          [完成-179]
    DARK_METAMORPHOSIS(201),
    //随机橡木桶
    BARREL_ROLL(202),
    //精神连接(IDA-Check-OK) [跟靈魂灌注是同個東西]
    SPIRIT_LINK(203),
    //靈魂灌注_攻擊增加             [完成-179]
    DAMAGE_R(203),
    //神圣拯救者的祝福
    VIRTUE_EFFECT(204),    
    //光明綠化                     [完成-179]           
    COSMIC_GREEN(205),    
    //靈魂灌注_爆擊率增加           [完成-179]
    CRITICAL_RATE(206),
    
    //未知(未確定)
    NO_SLIP(213),
    //未知(未確定)
    FAMILIAR_SHADOW(214),
    //吸血鬼之觸                    [完成-179]
    ABSORB_DAMAGE_HP(214),
    //提高防禦力[猜測]
    DEFENCE_BOOST_R(215),

    // 216
    // 217
    // 218
    // 219
    // 220
    // 221
    // 222
    // 223
    // 224

    //==========================Mask[7] - 8 - IDA[0x7]
    
    //IDA特殊Buff                  [IDA找的-179]
    IDA_SPECIAL_BUFF_1(225),
    
    // 226
    // 227
    
    //角設預設Buff                  [完成-179]
    CHAR_BUFF(228),
    //角設預設Buff                  [完成-179]
    MOUNT_MORPH(229),
    
    // 230
    
    //使用技能中移動                [完成-179]
    USING_SKILL_MOVE(231),
    //無視防禦力                    [完成-179]
    IGNORE_DEF(232),
    //幸運幻影                      [完成-179]
    FINAL_FEINT(233),
    //幻影斗蓬                      [完成-179]
    PHANTOM_MOVE(234),
    //最小爆擊傷害                  [完成-179]
    MIN_CRITICAL_DAMAGE(235),
    //爆擊機率增加                  [完成-179]
    CRITICAL_RATE2(236),
    //審判                          [完成-179]
    JUDGMENT_DRAW(237),
    //增加_物理攻擊                 [完成-179]
    DAMAGE_UP(238),
    
    // 239
    
    //IDA移動Buff                  [IDA找的-179]
    IDA_MOVE_BUFF2(240),
    //IDA移動Buff                  [IDA找的-179]
    IDA_MOVE_BUFF3(241),
    //IDA移動Buff                  [IDA找的-179]
    IDA_MOVE_BUFF4(242),
    //解多人Buff用的                [IDA找的-179]
    PLAYERS_BUFF14(243),    
    //黑暗之眼                     [完成-179]
    PRESSURE_VOID(244),    
    //光蝕 & 暗蝕                  [完成-179]
    LUMINOUS_GAUGE(245),
    //黑暗強化 & 全面防禦          [完成-179]
    DARK_CRESCENDO(246),
    //黑暗祝福                     [完成-179]
    BLACK_BLESSING(247),
    //抵禦致命異常狀態              [完成-179]
    //(如 元素適應(火、毒), 元素適應(雷、冰), 聖靈守護)
    ABNORMAL_BUFF_RESISTANCES(248),
    //血之限界                     [完成-179]
    LUNAR_TIDE(249),
    
    // 250
    
    //凱撒變型值                   [完成-179]
    KAISER_COMBO(251),
    
    
    //==========================Mask[8] - 9 - IDA[0x6]
    
    //堅韌護甲                     [完成-179]
    GRAND_ARMOR(252),
    //凱撒模式切換                 [完成-179]
    KAISER_MODE_CHANGE(253),
    
    // 254
    
    //IDA移動Buff                  [IDA找的-179]
    IDA_MOVE_BUFF5(255),
    //意志之劍                     [完成-179]
    TEMPEST_BLADES(256),
    //會心一擊傷害                  [完成-179]
    CRIT_DAMAGE(257),
    
    // 258
    
    //靈魂傳動                      [完成-179]
    DAMAGE_ABSORBED(259),
    
    // 260
    
    //功能不知道                    [IDA找的-179]
    IDA_UNK_BUFF3(261),
    
    // 262
    // 263
    
    //功能不知道                    [IDA找的-179]
    IDA_UNK_BUFF5(264),

    //IDA特殊Buff                   [IDA找的-179]
    IDA_SPECIAL_BUFF_3(262),
    //繼承人(176-OK)
    SOUL_BUSTER(268),
    //未知(未確定)
    PRETTY_EXALTATION(268),
    //未知(未確定)
    KAISER_MAJESTY3(269),
    //未知(未確定)
    KAISER_MAJESTY4(270), 
    //IDA移動Buff                   [IDA找的-179]
    IDA_MOVE_BUFF6(265),
    //靈魂深造
    RECHARGE(271),
    //0x10000
    //未知(未確定)
    
    //隱‧鎖鏈地獄(176-OK)
    STATUS_RESIST_TWO(273),
    
    //未知(未確定)
    PARTY_STANCE(274),
    
    //終極審判[猜測]
    FINAL_JUDGMENT_DRAW(273),
    
    //冰雪結界                      [完成-179]
    ABSOLUTE_ZERO_AURA(273),
    //火靈結界[猜測]
    INFERNO_AURA(274),
    
    //復仇天使
    AVENGING_ANGEL(279, true),
    //天堂之門
    HEAVEN_IS_DOOR(280),
    //戰鬥準備
    BOWMASTERHYPER(281),
    
    
    //修羅(176-OK)
    ASURA_IS_ANGER(285),
    //暴能續發
    STIMULATING_CONVERSATION(286),
    //IDA特殊Buff                    [IDA找的-179]
    IDA_SPECIAL_BUFF_2(287),
    
    //==========================Mask[9] - 10 - IDA[0x5]
    
    //功能不知道                     [IDA找的-179]
    IDA_UNK_BUFF10(288),
    //BOSS傷害
    BOSS_DAMAGE(289),
    //功能不知道                     [IDA找的-179]
    IDA_UNK_BUFF8(289),
    //全域代碼                       [完成-179]
    OOPARTS_CODE(290),
    
    //291
    
    //超越_攻擊                      [完成-179]
    EXCEED_ATTACK(292),
    //急速療癒                       [完成-179]
    DIABOLIC_RECOVERY(293),
    
    // 294  
    // 295 
    
    //超越                          [完成-179]
    EXCEED(296),
    //沉月-攻擊數量                  [完成-179]
    ATTACK_COUNT(297),
    
    // 298
    // 299

    //傑諾能量                      [完成-179]
    SUPPLY_SURPLUS(300),
    //IDA特殊Buff                   [IDA找的-179]
    IDA_SPECIAL_BUFF_5(301),
    
    //302
    
    //傑諾飛行                      [完成-179]
    XENON_FLY(303),
    //阿瑪蘭斯發電機                [完成-179]
    AMARANTH_GENERATOR(304),    
    //解多人Buff用的                [IDA找的-179]
    PLAYERS_BUFF13(305),    
    //元素： 風暴                   [完成-179]
    STORM_ELEMENTAL(306),
    //開天闢地[猜測]
    PRIMAL_BOLT(307),
    
    // 308
    // 309
    
    //風暴使者                     [完成-179]
    STORM_BRINGER(310),
    //光之劍-命中提升               [完成-179]
    ACCURACY_PERCENT(311),
    //迴避提升                     [完成-179]
    AVOID_PERCENT(312),
    //阿爾法                       [完成-179]
    ALBATROSS(313),
    //
    SPEED_LEVEL(314),
    //雙重力量 : 沉月/旭日          [完成-179]
    SOLUNA_EFFECT(315),    
    //光之劍                        [完成-179]
    ADD_AVOIDABILITY(316),
    //元素： 靈魂                   [完成-179]
    SOUL_ELEMENT(317),
    //雙重力量 : 沉月/旭日           [完成-179]
    EQUINOX_STANCE(318),
    
    // 319
    // 320
    
    //==========================Mask[10] - 11 - IDA[0x4]
    
    //靈魂球BUFF                    [完成-179]
    SOUL_WEAPON(321),
    //靈魂BUFF                      [完成-179]
    SOUL_WEAPON_HEAD(322),
    //復原
    HP_RECOVER(323),
    //功能不知道                    [完成-179]
    IDA_UNK_BUFF4(324),
    
    // 325
    
    //十字深鎖鏈                    [完成-179]
    CROSS_SURGE(326),    
    //超衝擊防禦_防禦概率
    PARASHOCK_GUARD(327),
    //功能不知道                   [IDA找的-179]
    IDA_UNK_BUFF12(328),
    //寒冰迅移[猜測]               [IDA找的-179]                 
    CHILLING_STEP(329),
    
    // 330
    
    //祝福福音
    PASSIVE_BLESS(331),
    
    // 332
    // 333
    
    //功能不知道                    [IDA找的-179]
    IDA_UNK_BUFF13(334),
    //IDA特殊Buff                   [IDA找的-179]
    IDA_SPECIAL_BUFF_8(335),
    //IDA特殊Buff                   [IDA找的-179]
    IDA_SPECIAL_BUFF_6(336),
    
    // 337
    
    //IDA移動Buff                   [IDA找的-179]
    IDA_MOVE_BUFF8(338),
    //IDA特殊Buff                   [IDA找的-179]
    IDA_SPECIAL_BUFF_7(339),
    //功能不知道                    [IDA找的-179]
    IDA_UNK_BUFF14(340),
    //時之威能                      [完成-179]
    DIVINE_FORCE_AURA(341),
    //聖靈神速                      [完成-179]
    DIVINE_SPEED_AURA(342),
    
    // 343
    // 344
    // 345
    // 346
    // 347
    // 348
    // 大砲(95001002)               [完成-179]
    CANNON(349),
    
    // 350
    // 351
    // 352

    //==========================Mask[11] - 12 - IDA[0x3]
    
    //無視怪物傷害(重生的輪行蹤)        [完成-179]
    IGNORE_MOB_DAM_R(353), //ignoreMobDamR
    //靈魂結界                         [完成-179]
    SPIRIT_WARD(354),
    //死裡逃生                         [完成-179]
    CLOSE_CALL(355),    
    //IDA特殊Buff                     [IDA找的-179]
    IDA_SPECIAL_BUFF_9(356),
    
    // 357
    // 358
    // 359
    // 360
    // 361
    
    //IDA移動Buff                     [IDA找的-179]
    IDA_MOVE_BUFF9(362),    
    //元素 : 闇黑                     [完成-179]
    DARK_ELEMENTAL(363),
    
    // 364
    
    //燃燒                            [完成-179]
    CONTROLLED_BURN(365),
    
    // 366
    // 367
    // 368
    // 369
    // 370
    // 371
    // 372
    
    //功能不知道                       [IDA找的-179]
    IDA_UNK_BUFF16(373),    
    //危機繩索
    AURA_BOOST(374),
    //拔刀術                           [完成-179]
    HAYATO(375),
    //拔刀術-新技體                    [完成-179]
    BATTOUJUTSU_SOUL(376),
    //制敵之先                         [完成-179]
    COUNTERATTACK(377),
    //柳身                             [完成-179]
    WILLOW_DODGE(378),        
    //紫扇仰波                         [完成-179]
    SHIKIGAMI(379),
    //武神招來                         [完成-179]
    MILITARY_MIGHT(380),
    //武神招來                         [完成-179]
    MILITARY_MIGHT1(381),
    //武神招來                         [完成-179]
    MILITARY_MIGHT2(382),
    //拔刀術                           [完成-179]
    BATTOUJUTSU_STANCE(383),
    
    // 384
    
    //==========================Mask[12] - 13 - IDA[0x2]
        
    // 385
    
    //迅速                             [完成-179]
    JINSOKU(386),
    //一閃                             [完成-179]
    HITOKIRI_STRIKE(387), 
    //花炎結界                         [完成-179]
    FOX_FIRE(388),
    //影朋‧花狐                        [完成-179]
    HAKU_REBORN(389),
    //花狐的祝福
    HAKU_BLESS(390),
    
    // 391
    
    //解多人Buff用的                    [IDA找的-179]
    PLAYERS_BUFF11(392),
    
    // 393
    // 394
    // 395
    // 396
    
    //精靈召喚模式                      [完成-179]
    ANIMAL_SELECT(397),
    
    // 398
    // 399
    // 400
    // 401
    
    //IDA特殊Buff                       [IDA找的-179]
    IDA_SPECIAL_BUFF_4(402),
    
    // 403
    
    //依古尼斯咆哮-迴避提升               [完成-179]
    PROP(404),
    
    // 405
    
    //召喚美洲豹                         [完成-179]
    SUMMON_JAGUAR(406),
    //自由精神                           [完成-179]
    SPIRIT_OF_FREEDOM(407),    
    //功能不知道                         [IDA找的-179]
    IDA_UNK_BUFF1(408),
    
    // 409
    
    //功能不知道                        [IDA找的-179]
    IDA_UNK_BUFF2(410),    
    //光環效果                          [完成-179]
    NEW_AURA(411),
    //黑暗閃電                          [完成-179]
    DARK_SHOCK(412),
    //戰鬥精通                          [完成-179]
    BATTLE_MASTER(413),
    //死神契約                          [完成-179]
    GRIM_CONTRACT(414), 
    
    // 415
    // 416
    
    //==========================Mask[13] - 14 - IDA[0x0]
    
    // 417
    // 418
    
    //神盾系統                          [完成-179]
    AEGIS_SYSTEM(419),    
    //索魂精通                          [完成-179]   
    SOUL_SEEKER(420),
    //小狐仙                            [完成-179]
    FOX_SPIRITS(421),
    //暗影蝙蝠                          [完成-179]
    SHADOW_BAT(422),
    
    // 423
    
    //燎原之火                          [完成-179]
    IGNITE(424),
    
    //能量獲得                          [完成-179]
    ENERGY_CHARGE(425, true),
    //衝鋒_速度                         [完成-179]
    DASH_SPEED(426, true),    
    //衝鋒_跳躍                         [完成-179]
    DASH_JUMP(427, true),
    //怪物騎乘                          [完成-179]
    MONSTER_RIDING(428, true),
    //最終極速                          [完成-179]
    SPEED_INFUSION(429, true),
    //指定攻擊(無盡追擊)                 [完成-179]
    HOMING_BEACON(430, true),
    //預設Buff-1                        [完成-179]
    DEFAULTBUFF1(431, true),
    //預設Buff-2                        [完成-179]
    DEFAULTBUFF2(432, true),
    
    
    //-----------------[已停用的Buff]
    //黑色繩索                      
    DARK_AURA_OLD(888),
    //藍色繩索                      
    BLUE_AURA_OLD(888),
    //黃色繩索                      
    YELLOW_AURA_OLD(888),
    //貓頭鷹召喚
    OWL_SPIRIT(888),
    //超級體
    BODY_BOOST(888),
    
    ;
    private static final long serialVersionUID = 0L;
    private final int buffstat;
    private final int first;
    private boolean stacked = false;

    private MapleBuffStat(int buffstat) {
        this.buffstat = 1 << (31 - (buffstat % 32));
        this.first = (int) Math.floor(buffstat / 32);
    }

    private MapleBuffStat(int buffstat, boolean stacked) {
        this.buffstat = 1 << (31 - (buffstat % 32));
        this.first = (int) Math.floor(buffstat / 32);
        this.stacked = stacked;
    }

    @Override
    public int getPosition() {
        return first;
    }

    @Override
    public int getValue() {
        return buffstat;
    }

    public final boolean canStack() {
        return stacked;
    }
}
