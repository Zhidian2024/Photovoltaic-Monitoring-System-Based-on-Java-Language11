package com.zhengbangnet.commu.wm.message;

/*
*  根据消息定义类、利用Java反射机制，由工具类MakeStubFile自动生成
*  浙江爱充网络, 2020-07-03
* */

import com.zhengbangnet.commu.wm.pack.PackException;
import com.zhengbangnet.commu.wm.pack.PackStubIF;
import com.zhengbangnet.commu.wm.pack.PackUtil;

public class wmp_fw_block_resp_stub implements PackStubIF {

    @Override
    public void pack(PackUtil.Buf buf, Object o) throws PackException {
        wmp_fw_block_resp wmp_fw_block_resp = (wmp_fw_block_resp)o;
        PackUtil.putByte(buf, wmp_fw_block_resp.ctrl_type);
        PackUtil.putByte(buf, wmp_fw_block_resp.fw_ver_major.getByte());
        PackUtil.putByte(buf, wmp_fw_block_resp.fw_ver_minor.getByte());
        PackUtil.putByte(buf, wmp_fw_block_resp.fw_ver_inner.getByte());
        PackUtil.putInt(buf, wmp_fw_block_resp.blk_idx.getInt());
        PackUtil.putInt(buf, wmp_fw_block_resp.blk_len.getInt());
        PackUtil.putByteArray(buf, wmp_fw_block_resp.fw_data);
    }

    @Override
    public Object unpack(PackUtil.Buf buf) throws PackException { 
        wmp_fw_block_resp wmp_fw_block_resp = new wmp_fw_block_resp();

        wmp_fw_block_resp.ctrl_type = PackUtil.getByte(buf);
        wmp_fw_block_resp.fw_ver_major.setByte(PackUtil.getByte(buf));
        wmp_fw_block_resp.fw_ver_minor.setByte(PackUtil.getByte(buf));
        wmp_fw_block_resp.fw_ver_inner.setByte(PackUtil.getByte(buf));
        wmp_fw_block_resp.blk_idx.setInt(PackUtil.getInt(buf));
        wmp_fw_block_resp.blk_len.setInt(PackUtil.getInt(buf));
        PackUtil.parseByteArray(buf, wmp_fw_block_resp.fw_data);

        return wmp_fw_block_resp;
    }
}

