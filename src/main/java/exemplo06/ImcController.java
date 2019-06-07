package exemplo06;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/")
public class ImcController extends HttpServlet {

    @Override
    protected void service(
            HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        String resultado = "";

        String alturaStr = request.getParameter("altura");
        String pesoStr = request.getParameter("peso");
        if (alturaStr != null && pesoStr != null) {
            float altura = Float.parseFloat(alturaStr);
            float peso = Float.parseFloat(pesoStr);
            float imc = peso / (altura * altura);
            resultado = ImcModel.imcValor(imc);
        }

        // Adiciona a variável na requisição para o JSP trabalhar.
        request.setAttribute("resultado", resultado);

        // Redireciona requisição para o JSP.
        request.getRequestDispatcher("/maior-menor-view.jsp").forward(request, response);
    }
}
