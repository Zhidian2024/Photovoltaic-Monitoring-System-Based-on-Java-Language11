package com.zhengbangnet.commu.wm.message;

/*
 *  通信协议消息定义，修改自研究院plat_wm_def.h
 *  Eichong ZDY, 2020-4-21
 * */

/********************************** 通用定义 **********************************/
public class wmp_common_def {
    public final static byte WMP_KEY_LEN = 16;         // 加密解密密钥长度
    public final static byte WMP_CIPHER_LEN = 16;      // 加密解密数据段长度
    public final static byte WMP_VIN_LEN = 17;         // VIN长度
    public final static byte WMP_SERIAL_LEN = 16;      // 流水号长度
    public final static byte WMP_PWD_LEN = 32;          // 密码长度
}
