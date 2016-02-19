package com.tt.sims.messagev2;

import com.tt.cn.contract.payment.PaymentService;
import com.tt.cn.contract.payment.PaymentWebInitInput;
import com.tt.sims.InitApplication;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by bellag on 1/26/16.
 */
public class PaymentConfirmation extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PaymentService paymentService = InitApplication.getPaymentService();
        PaymentWebInitInput input = new PaymentWebInitInput();


        String test = paymentService.test();
        System.out.println(test);

        super.doPost(req, resp);
    }
}
