package com.axioma.axiomatrainee.security;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

@Component
public class HeadersFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpHeaders headers = prepareHeaders();
        for (String header : headers.keySet()) {
            response.addHeader(header, String.valueOf(headers.get(header)));
        }
        filterChain.doFilter(request, response);
    }

    private HttpHeaders prepareHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.addAll("Access-Control-Allow-Origin", Collections.singletonList("*"));
        headers.addAll("Access-Control-Allow-Methods", List.of("GET", "POST", "OPTIONS"));
        headers.addAll("Access-Control-Allow-Headers", List.of("Content-Type", "Authorization"));
        return headers;
    }
}