package com.github.blindpirate.extensions;

/**
 * @author qiaomengnan
 * @ClassName: Bridge
 * @Description:
 * @date 2019-10-01
 */
public class Bridge {

	public static Object newInstance() {
		return new CaptureSystemOutputExtension();
	}

}
