package com.zhengbangnet.commu.wm.message;

/*
*  根据消息定义类、利用Java反射机制，由工具类MakeStubFile自动生成
*  浙江爱充网络, 2020-07-03
* */

import com.zhengbangnet.commu.wm.pack.PackException;
import com.zhengbangnet.commu.wm.pack.PackStubIF;
import com.zhengbangnet.commu.wm.pack.PackUtil;

public class wmp_fw_block_req_stub implements PackStubIF {

    @Override
    public void pack(PackUtil.Buf buf, Object o) throws PackException {
        wmp_fw_block_req wmp_fw_block_req = (wmp_fw_block_req)o;
        PackUtil.putByte(buf, wmp_fw_block_req.ctrl_type);
        PackUtil.putByte(buf, wmp_fw_block_req.fw_ver_major.getByte());
        PackUtil.putByte(buf, wmp_fw_block_req.fw_ver_minor.getByte());
        PackUtil.putByte(buf, wmp_fw_block_req.fw_ver_inner.getByte());
        PackUtil.putInt(buf, wmp_fw_block_req.blk_idx.getInt());
        PackUtil.putInt(buf, wmp_fw_block_req.blk_size.getInt());
    }

    @Override
    public Object unpack(PackUtil.Buf buf) throws PackException { 
        wmp_fw_block_req wmp_fw_block_req = new wmp_fw_block_req();

        wmp_fw_block_req.ctrl_type = PackUtil.getByte(buf);
        wmp_fw_block_req.fw_ver_major.setByte(PackUtil.getByte(buf));
        wmp_fw_block_req.fw_ver_minor.setByte(PackUtil.getByte(buf));
        wmp_fw_block_req.fw_ver_inner.setByte(PackUtil.getByte(buf));
        wmp_fw_block_req.blk_idx.setInt(PackUtil.getInt(buf));
        wmp_fw_block_req.blk_size.setInt(PackUtil.getInt(buf));

        return wmp_fw_block_req;
    }
}

