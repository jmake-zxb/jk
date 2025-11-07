package com.jk.admin.api.feign;

import com.jk.admin.api.entity.SysLog;
import com.jk.common.core.constant.ServiceNameConstants;
import com.jk.common.core.util.R;
import com.jk.common.feign.annotation.NoToken;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 远程日志服务接口
 *
 * @author 1661
 */
@FeignClient(contextId = "remoteLogService", value = ServiceNameConstants.UPMS_SERVICE)
public interface RemoteLogService {

	/**
	 * 保存日志 (异步多线程调用，无token)
	 * @param sysLog 日志实体
	 * @return succes、false
	 */
	@NoToken
	@PostMapping("/log/save")
    R<Boolean> saveLog(@RequestBody SysLog sysLog);

}
