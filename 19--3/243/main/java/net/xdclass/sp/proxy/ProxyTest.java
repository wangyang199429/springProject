package net.xdclass.sp.proxy;

public class ProxyTest {


    public static void main(String [] args){

    //    PayService payService = new PayServiceImpl();
    //    payService.callback("absdfwr2332");

//
//     PayService payService = new StaticProxyPayServiceImpl(new PayServiceImpl());
//     payService.save(234,4232);
//
//     payService.callback("3r23423423");



        //JDK动态代理
        JdkProxy jdkProxy = new JdkProxy();

        //获取代理类对象
        PayService payServiceProxy = (PayService)jdkProxy.newProxyInstance(new PayServiceImpl());


        //调用目标方法
        payServiceProxy.callback("dsfsdfdsfew");
        payServiceProxy.save(23,42423);

    }


}
