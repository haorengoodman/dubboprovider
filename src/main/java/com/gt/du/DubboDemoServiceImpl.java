package com.gt.du;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.gt.du.inter.dubbointerface.DubboDemoInterface;

/**
 * dubbo provider 实现服务定义接口
 * @author journal
 *
 */
public class DubboDemoServiceImpl implements DubboDemoInterface{

	public String sayHello(String name) {
		String result = "";
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh::mm:ss");
		String dateStr = format.format(date);
		result += "["+dateStr+"]  hello "+ name;
		return result;
	}

}
