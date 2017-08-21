package interceptor.interceptorImps;

import handler.Handler;
import interceptor.Interceptor;

public class ThirdImp  implements Interceptor{
	
	@Override
	public String intercept(Handler handler, Integer i) {
		String info = "三号lose";
		if(i==3) {
			System.out.println("数字为3，被拦截");
			return "三号success";
		}
		System.out.println(info+"， 继续调用下一个拦截器");
		System.out.println(handler.tochain());
		System.out.println("三号lose后处理");
		return "三号执行完毕";
	}
}
