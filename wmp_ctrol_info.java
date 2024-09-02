package com.zhengbangnet.commu.wm.message;

import com.zhengbangnet.commu.wm.pack.ProtocolStr;
import com.zhengbangnet.commu.wm.pack.UnsignedChar;

/*
 *  通信协议消息定义，修改自研究院plat_wm_def.h
 *  Eichong ZDY, 2020-4-23
 * */

/************************** 充电桩控制板数据结构定义 *****************************/
public class wmp_ctrol_info {
    public final static byte  WMP_CTRL_DESC_LEN = 16;

    public ProtocolStr hw_desc = new ProtocolStr(ProtocolStr.Type.PST_ASCII, WMP_CTRL_DESC_LEN);

    //1 TCU-直流计费板；2 CCU-直流充电板；3 PCU-直流功率板；4 ACU-交流充电板；5 CTU-直流计费充电板。
    public byte ctrl_type;                                      // 控制器类型
    public byte serial_num;                                     // 序号

    public byte res;                                            // 保留
    public UnsignedChar hw_ver_major = new UnsignedChar();      // 硬件版本
    public UnsignedChar hw_ver_minor = new UnsignedChar();      // 硬件版本

    public ProtocolStr fw_desc = new ProtocolStr(ProtocolStr.Type.PST_ASCII, WMP_CTRL_DESC_LEN);
    public UnsignedChar fw_ver_major = new UnsignedChar();      // 固件主版本号
    public UnsignedChar fw_ver_minor = new UnsignedChar();      // 固件副版本号
    public UnsignedChar fw_ver_inner = new UnsignedChar();      // 固件内测版本号
    public byte res2;                                           // 保留
}
