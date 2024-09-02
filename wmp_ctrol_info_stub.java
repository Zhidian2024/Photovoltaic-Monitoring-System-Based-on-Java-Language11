package com.zhengbangnet.commu.wm.message;

/*
*  根据消息定义类、利用Java反射机制，由工具类MakeStubFile自动生成
*  浙江爱充网络, 2020-07-03
* */

import com.zhengbangnet.commu.wm.pack.PackException;
import com.zhengbangnet.commu.wm.pack.PackStubIF;
import com.zhengbangnet.commu.wm.pack.PackUtil;

public class wmp_ctrol_info_stub implements PackStubIF {

    @Override
    public void pack(PackUtil.Buf buf, Object o) throws PackException {
        wmp_ctrol_info wmp_ctrol_info = (wmp_ctrol_info)o;
        PackUtil.putProtocolStr(buf, wmp_ctrol_info.hw_desc);
        PackUtil.putByte(buf, wmp_ctrol_info.ctrl_type);
        PackUtil.putByte(buf, wmp_ctrol_info.serial_num);
        PackUtil.putByte(buf, wmp_ctrol_info.res);
        PackUtil.putByte(buf, wmp_ctrol_info.hw_ver_major.getByte());
        PackUtil.putByte(buf, wmp_ctrol_info.hw_ver_minor.getByte());
        PackUtil.putProtocolStr(buf, wmp_ctrol_info.fw_desc);
        PackUtil.putByte(buf, wmp_ctrol_info.fw_ver_major.getByte());
        PackUtil.putByte(buf, wmp_ctrol_info.fw_ver_minor.getByte());
        PackUtil.putByte(buf, wmp_ctrol_info.fw_ver_inner.getByte());
        PackUtil.putByte(buf, wmp_ctrol_info.res2);
    }

    @Override
    public Object unpack(PackUtil.Buf buf) throws PackException { 
        wmp_ctrol_info wmp_ctrol_info = new wmp_ctrol_info();

        PackUtil.parseProtocolStr(buf, wmp_ctrol_info.hw_desc);
        wmp_ctrol_info.ctrl_type = PackUtil.getByte(buf);
        wmp_ctrol_info.serial_num = PackUtil.getByte(buf);
        wmp_ctrol_info.res = PackUtil.getByte(buf);
        wmp_ctrol_info.hw_ver_major.setByte(PackUtil.getByte(buf));
        wmp_ctrol_info.hw_ver_minor.setByte(PackUtil.getByte(buf));
        PackUtil.parseProtocolStr(buf, wmp_ctrol_info.fw_desc);
        wmp_ctrol_info.fw_ver_major.setByte(PackUtil.getByte(buf));
        wmp_ctrol_info.fw_ver_minor.setByte(PackUtil.getByte(buf));
        wmp_ctrol_info.fw_ver_inner.setByte(PackUtil.getByte(buf));
        wmp_ctrol_info.res2 = PackUtil.getByte(buf);

        return wmp_ctrol_info;
    }
}

