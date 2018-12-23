package com.zhiguogongfang.hrmapp.interceptor;

import com.zhiguogongfang.hrmapp.common.HrmConstants;
import com.zhiguogongfang.hrmapp.domain.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthorizedInterceptor implements HandlerInterceptor {
    private static String[] IGNORE_URI = {"loginform", "/login", "/404.html"};

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        boolean flag = false;
        String servletPath = httpServletRequest.getServletPath().toLowerCase();
        for (String s : IGNORE_URI) {
            if (servletPath.contains(s)) {
                flag = true;
                break;
            }
        }
        if(!flag){
            User user =(User)httpServletRequest.getSession().getAttribute(HrmConstants.USER_SESSION);
            if(user==null){
                httpServletRequest.setAttribute("message","请先登录再访问");
                httpServletRequest.getRequestDispatcher(HrmConstants.LOGIN).forward(httpServletRequest,httpServletResponse);
                return flag;
            }else{
                flag=true;
            }
        }
        return flag;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
