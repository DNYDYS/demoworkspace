/**
 * @Title: AuthenticationInterceptor.java
 * @Package cn.osxm.springboot.com
 * @Description: TODO
 * @author oscarchen
 * @date 2020��4��8��
 * @version V1.0
 */
package cn.osxm.springboot.com.auth;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName: AuthenticationInterceptor
 * @Description: TODO
 * @author oscarchen
 */
@Component
public class AuthenticationInterceptor implements HandlerInterceptor {
	/**
	 * Ԥ����ص�����. ����ֵ�� true������false �ж�
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("��ʼ����.........");
		// ҵ�����
		return true;
	}

	/**
	 * ����ص�����
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

	}

	/**
	 * 
	 * ������try-catch-finally�е�finally
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

	}

}