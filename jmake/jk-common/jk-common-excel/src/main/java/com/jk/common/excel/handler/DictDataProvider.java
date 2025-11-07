package com.jk.common.excel.handler;


import com.jk.common.excel.vo.DictEnum;

/**
 * dict 数据提供程序
 *
 * @author lengleng
 * @date 2024/08/30
 */
public interface DictDataProvider {

	/**
	 * 获取 dict
	 * @param type 类型
	 * @return {@link DictEnum[] }
	 */
	DictEnum[] getDict(String type);

}
