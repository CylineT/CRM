package handler.handlerImp;

import java.util.List;

import handler.Handler;
import interceptor.Interceptor;

public class HandlerImp implements Handler {

	private String resultStr;
	
	//拦截器list
	List<Interceptor> interceptors;
	//被拦截对象
	Integer i; 
	
	public HandlerImp(List<Interceptor> interceptors, Integer i) {
		super();
		this.interceptors = interceptors;
		this.i = i;
	}
	
	@Override
	public String tochain() {
		if(interceptors.size()!=0) {
			Interceptor currentInterceptor = interceptors.remove(0);
			resultStr = currentInterceptor.intercept(this, i);
			return resultStr;
		}
		resultStr="报告：拦截器已调用完毕，没能拦截，将会继续后续处理。。";
		return resultStr;
	}
}
