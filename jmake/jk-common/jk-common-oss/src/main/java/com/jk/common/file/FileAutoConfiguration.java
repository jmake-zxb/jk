package com.jk.common.file;

import com.jk.common.file.core.FileProperties;
import com.jk.common.file.local.LocalFileAutoConfiguration;
import com.jk.common.file.oss.OssAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;

/**
 * AWS 自动配置类
 *
 * @author lengleng
 * @author 858695266
 * @date 2025/05/31
 */
@Import({ LocalFileAutoConfiguration.class, OssAutoConfiguration.class })
@EnableConfigurationProperties({ FileProperties.class })
public class FileAutoConfiguration {

}
