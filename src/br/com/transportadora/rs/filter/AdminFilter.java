package br.com.transportadora.rs.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebFilter(filterName="/AdminFilter",
			urlPatterns="/remessa/*")
public class AdminFilter implements Filter {
 
	private static final String AUTHENTICATION_HEADER = "Authorization";
    
    public AdminFilter() {
        // TODO Auto-generated constructor stub
    }

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("--------------->>>>>>>>>>>>>AdminFilter<<<<<<<<<<<<<-------------");
		if(request instanceof HttpServletRequest){
			HttpServletRequest httpServletRequest = (HttpServletRequest) request;
			String authCredenciais = httpServletRequest.getHeader(AUTHENTICATION_HEADER);
			Autenticacao aut = new Autenticacao();
			
			if(aut.autenticarAdmin(authCredenciais)){
				chain.doFilter(request, response);
			}else {
				if(response instanceof HttpServletResponse){
					HttpServletResponse httpServletResponse = (HttpServletResponse) response;
					httpServletResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
					httpServletResponse.getWriter().write("Acesso não autorizado");
					httpServletResponse.getWriter().flush();
					httpServletResponse.getWriter().close();
				}
			}
		}
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
