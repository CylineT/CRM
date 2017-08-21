package interceptor.interceptorImps;

import handler.Handler;
import interceptor.Interceptor;

public class SecondImp  implements Interceptor{
	
	@Override
	public String intercept(Handler handler, Integer i) {
		String info = "二号lose";
		if(i==2) {
			System.out.println("数字为2，被拦截");
			return "二号success";
		}
		System.out.println(info+"， 继续调用下一个拦截器");
		System.out.println(handler.tochain());
		System.out.println("二号lose后处理");
		return "二号执行完毕";
	}
}
