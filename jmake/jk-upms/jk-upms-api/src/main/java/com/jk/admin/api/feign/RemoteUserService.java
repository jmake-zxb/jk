package com.jk.admin.api.feign;

import com.jk.admin.api.dto.UserDTO;
import com.jk.admin.api.dto.UserInfo;
import com.jk.common.core.constant.ServiceNameConstants;
import com.jk.common.core.util.R;
import com.jk.common.feign.annotation.NoToken;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 远程用户服务接口：提供用户信息查询功能
 *
 * @author lengleng
 */
@FeignClient(contextId = "remoteUserService", value = ServiceNameConstants.UPMS_SERVICE)
public interface RemoteUserService {

	/**
	 * (未登录状态调用，需要加 @NoToken) 通过用户名查询用户、角色信息
	 * @param user 用户查询对象
	 * @return R
	 */
	@NoToken
	@GetMapping("/user/info/query")
    R<UserInfo> info(@SpringQueryMap UserDTO user);

}
