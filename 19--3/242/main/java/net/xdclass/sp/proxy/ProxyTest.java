package net.xdclass.sp.proxy;

public class ProxyTest {


    public static void main(String [] args){

    //    PayService payService = new PayServiceImpl();
    //    payService.callback("absdfwr2332");


     PayService payService = new StaticProxyPayServiceImpl(new PayServiceImpl());
     payService.save(234,4232);

     payService.callback("3r23423423");

    }


}
