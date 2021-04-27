/*
 * ValidaPedido.java
 */
package lab08_01.src.br.com.globalcode.aj.ecommerce;

import br.com.globalcode.aj.business.ValidadorPedido;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidaPedido extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ValidadorPedido validador = new ValidadorPedido();
        validador.validarPedido(request);
        List<String> listaDeProblemas = (List<String>) request.getAttribute("problemas");

        String destino = null;

        // ------------------------------------------------------------------------
        // Adicione aqui o código pedido no laboratorio
        // ------------------------------------------------------------------------




        RequestDispatcher dispatcher = request.getRequestDispatcher(destino);
        dispatcher.forward(request, response);

    }

}
