package org.linjiezhijia.api.config.filter;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class EncodingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        //request.setCharacterEncoding("UTF-8");
        //�ڴ���request֮ǰ��request��getParameter����������ǿ
        /*
         * װ����ģʽ(��װ)
         * 1����ǿ���뱻��ǿ����Ҫʵ��ͳһ�ӿ�
         * 2������ǿ���д��뱻��ǿ����
         * 3����Ҫ��ǿ�ķ�����д ����Ҫ��ǿ�ķ������ñ���ǿ�����
         */
        //����ǿ�Ķ���
        HttpServletRequest req = (HttpServletRequest) request;
        //��ǿ����
        EnhanceRequest enhanceRequest = new EnhanceRequest(req);
        chain.doFilter(enhanceRequest, response);
    }

    @Override
    public void destroy() {
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }
}

class EnhanceRequest extends HttpServletRequestWrapper {
    private HttpServletRequest request;

    public EnhanceRequest(HttpServletRequest request) {
        super(request);
        this.request = request;
    }

    //��getParaameter��ǿ
    @Override
    public String getParameter(String name) {
        String parameter = request.getParameter(name);//����
        try {
            parameter = new String(parameter.getBytes("iso8859-1"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return parameter;
    }
}