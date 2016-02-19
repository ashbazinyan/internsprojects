package com.tt.sims;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;


import com.tt.cn.contract.payment.PaymentService;
import com.tt.cn.contract.payment.PaymentWebInitInput;
import com.tt.core.TrustAllManager;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitApplication extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static ClassPathXmlApplicationContext context;

    /**
     * Initialize the application
     */
    @Override
    public void init() throws ServletException {
        super.init();


        initSecurity();
        initProxy();

        ResourceBundle resourceBundle = ResourceBundle.getBundle("wsconnectors");
      String env = resourceBundle.getString("environment");

        context = new ClassPathXmlApplicationContext(new String[]{"classpath:cxf.xml"});
    }
    public void initSecurity() {
        try {

            ResourceBundle resourceBundle = ResourceBundle.getBundle("wsconnectors");

            String keystoreFile = resourceBundle.getString("javax.net.ssl.keyStore");
            String keystorePassword = resourceBundle.getString("javax.net.ssl.keyStorePassword");
            String keystoreType = resourceBundle.getString("javax.net.ssl.keyStoreType");
   try {
                TrustAllManager.trustAll(keystoreFile, keystoreType, keystorePassword);
            } catch (Exception e) {

            }


            System.setProperty("javax.net.ssl.keyStore", keystoreFile);
            System.setProperty("javax.net.ssl.keyStorePassword", keystorePassword);
            System.setProperty("javax.net.ssl.keyStoreType", keystoreType);

           String truststoreFile = resourceBundle.getString("javax.net.ssl.trustStore");
            String truststorePassword = resourceBundle.getString("javax.net.ssl.trustStorePassword");
            String truststoreType = resourceBundle.getString("javax.net.ssl.trustStoreType");

            System.setProperty("javax.net.ssl.trustStore", truststoreFile);
            System.setProperty("javax.net.ssl.trustStorePassword", truststorePassword);
            System.setProperty("javax.net.ssl.trustStoreType", truststoreType);
        } catch (MissingResourceException e) {
}
    }


    public void initProxy() {
        try {
            ResourceBundle bundle = ResourceBundle.getBundle("wsconnectors");

            if (bundle.getString("enableProxy").equals("true")) {
                System.setProperty("http.proxyHost", bundle.getString("proxyHost"));
                System.setProperty("http.proxyPort", bundle.getString("proxyPort"));
                System.setProperty("https.proxyHost", bundle.getString("proxyHost"));
                System.setProperty("https.proxyPort", bundle.getString("proxyPort"));
            }


        } catch (Exception e) {

        }
    }


    public static PaymentService getPaymentService() {
        return (PaymentService) context.getBean("paymentService");
    }

}
