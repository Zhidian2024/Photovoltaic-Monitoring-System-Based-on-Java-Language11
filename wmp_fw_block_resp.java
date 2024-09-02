package com.zhengbangnet.commu.wm.message;

import com.zhengbangnet.commu.wm.pack.UnsignedChar;
import com.zhengbangnet.commu.wm.pack.UnsignedInt;

/*
 *  通信协议消息定义，修改自研究院plat_wm_def.h
 *  Eichong ZDY, 2020-4-23
 * */

/************************** 充电桩固件更新数据结构定义 *****************************/
public class wmp_fw_block_resp {
    public byte  ctrl_type;                                      // 控制器类型: 参看前面定义
    public UnsignedChar fw_ver_major = new UnsignedChar();          // 固件主版本号
    public UnsignedChar fw_ver_minor = new UnsignedChar();          // 固件副版本号
    public UnsignedChar fw_ver_inner = new UnsignedChar();          // 固件内版本号

    public UnsignedInt blk_idx = new UnsignedInt();                 // 数据块标号
    public UnsignedInt blk_len = new UnsignedInt();                 // 数据块大小

    public byte[] fw_data = new byte[0];
}
