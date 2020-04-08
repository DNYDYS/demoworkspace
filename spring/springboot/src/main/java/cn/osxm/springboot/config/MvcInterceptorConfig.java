/**
 * @Title: MvcInterceptorConfig.java
 * @Package cn.osxm.springboot.config
 * @Description: TODO
 * @author oscarchen
 * @date 2020��4��8��
 * @version V1.0
 */
package cn.osxm.springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import cn.osxm.springboot.com.auth.AuthenticationInterceptor;

/**
  * @ClassName: MvcInterceptorConfig
  * @Description: TODO
  * @author oscarchen
  */
@Configuration
public class MvcInterceptorConfig extends WebMvcConfigurationSupport{

	@Autowired
    private AuthenticationInterceptor loginInterceptor;

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        // addPathPatterns ,����·��/**��ʾ������������
        // excludePathPatterns ����Ҫ���ص�·��
        registry.addInterceptor(loginInterceptor).addPathPatterns("/**")
        .excludePathPatterns("/login","/account/register");    
        super.addInterceptors(registry);
    }

}