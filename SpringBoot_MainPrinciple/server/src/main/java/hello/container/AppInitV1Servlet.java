package hello.container;

import hello.servlet.HelloServlet;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletRegistration;

/**
 * http://localhost:8080/hello-servlet
 * 서블릿이 등록되면서 초기화하는 코드
 */
public class AppInitV1Servlet implements AppInit {


    @Override
    public void onStartup(ServletContext servletContext) {
        System.out.println("AppInitV1Servlet.onStartup");

        // 순수 서블릿 코드 등록
        ServletRegistration.Dynamic helloServlet = servletContext.addServlet("helloServlet", new HelloServlet());
        helloServlet.addMapping("/hello-servlet");
    }
}
