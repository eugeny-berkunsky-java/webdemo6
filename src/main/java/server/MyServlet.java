package server;

import beans.Person;
import services.Calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "MyServlet", urlPatterns = {"*.html"})
public class MyServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.endsWith("hello.html")) {
            sayHello(request, response);
        } else if (uri.endsWith("calc.html")) {
            calculate(request, response);
        } else request.getRequestDispatcher("undefined.jsp").forward(request, response);
    }

    private void calculate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        Calculator calculator = (Calculator) session.getAttribute("calculator");
        if (calculator == null) {
            calculator = new Calculator();
            session.setAttribute("calculator", calculator);
        }
//        Calculator calculator = new Calculator();
        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));
        calculator.setA(a);
        calculator.setB(b);
        request.getRequestDispatcher("calc.jsp").forward(request, response);
    }

    private void sayHello(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String personName = request.getParameter("personname");
        Person person = new Person();
        person.setName(personName);
        request.setAttribute("person", person);
        request.getRequestDispatcher("hello.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
