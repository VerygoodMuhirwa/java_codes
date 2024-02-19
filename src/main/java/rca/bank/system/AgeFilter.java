package rca.bank;

import javax.servlet.Filter;


import javax.servlet.http.HttpFilter;
import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public abstract class AgeFilter implements Filter {
	public void doFilter(javax.servlet.ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String ageStr = request.getParameter("age");
		if(ageStr != null && ! ageStr.isEmpty()) {
			try {
				int age = Integer.parseInt(ageStr);
				if(age > 18) {
					chain.doFilter(request,response);
				}else {
					request.setAttribute("errorMessage","You must be at least 18 years old to register");
					request.getRequestDispatcher("Register.jsp").forward(request, response);
					}
		}catch (NumberFormatException e) {
			 request.setAttribute("errorMessage", "Invalid age format.");
	            request.getRequestDispatcher("Register,jsp").forward(request, response);
		}

				}else {
					 request.setAttribute("errorMessage", "Age is required.");
				        request.getRequestDispatcher("Register.jsp").forward(request, response);
				    }
				}
	}


}
	
