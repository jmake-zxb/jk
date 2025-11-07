package com.jk.common.log.event;

import com.jk.admin.api.entity.SysLog;
import org.springframework.context.ApplicationEvent;

import java.io.Serial;

/**
 * 系统日志事件类
 *
 * @author 1661
 */
public class SysLogEvent extends ApplicationEvent {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 构造方法，根据源SysLog对象创建SysLogEvent
	 * @param source 源SysLog对象
	 */
	public SysLogEvent(SysLog source) {
		super(source);
	}

}
