package org.smart4j.chapter2.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by suziyao on 2017/5/1.
 * 客户创建
 */
@WebServlet("/customer_create")
public class CustomerCreateServlet extends HttpServlet{
    /**
     * 进入客户创建界面
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException{
        //todo
    }

    /**
     * 处理创建客户请求
     */
    @Override
    protected void  doPost(HttpServletRequest req, HttpServletResponse resq)
        throws ServletException, IOException{
        //todo
    }
}
