/*
 This file is part of the OdinMS Maple Story Server
 Copyright (C) 2008 ~ 2010 Patrick Huy <patrick.huy@frz.cc> 
 Matthias Butz <matze@odinms.de>
 Jan Christian Meyer <vimes@odinms.de>

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU Affero General Public License version 3
 as published by the Free Software Foundation. You may not use, modify
 or distribute this program under any other version of the
 GNU Affero General Public License.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU Affero General Public License for more details.

 You should have received a copy of the GNU Affero General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package client.inventory;

public enum ItemFlag {

    LOCK(0x01),//封印
    SPIKES(0x02),//防滑
    COLD(0x04),//防寒
    UNTRADABLE(0x08),//不可交易
    KARMA_EQ(0x10), // 可以交換1次
    KARMA_USE(0x02),
    CHARM_EQUIPPED(0x20),//裝備時獲得魅力
    ANDROID_ACTIVATED(0x40),//機器人激活
    CRAFTED(0x80),
    CRAFTED_USE(0x10),
    SHIELD_WARD(0x100), //裝備防爆
    LUCKY_DAY(0x200), //幸運捲軸
    KARMA_ACC_USE(0x400),
    KARMA_ACC(0x1000),
    SLOTS_PROTECT(0x2000), // 保護升級次數
    SCROLL_PROTECT(0x4000); // 捲軸防護
    private final int value;

    private ItemFlag(int value) {
        this.value = value;
    }

    public final int getValue() {
        return value;
    }

    public final boolean check(int flag) {
        return (flag & value) == value;
    }
}
