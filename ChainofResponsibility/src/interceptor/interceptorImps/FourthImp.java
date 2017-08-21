package interceptor.interceptorImps;

import handler.Handler;
import interceptor.Interceptor;

public class FourthImp  implements Interceptor{
	
	@Override
	public String intercept(Handler handler, Integer i) {
		String info = "四号lose";
		if(i==4) {
			System.out.println("数字为4，被拦截");
			return "四号success";
		}
		System.out.println(info+"， 继续调用下一个拦截器");
		System.out.println( handler.tochain());
		System.out.println("四号lose后处理");
		return "四号执行完毕";
	}
}
