/*
 * CatalogoProdutos.java
 *
 */
package lab08_01.src.br.com.globalcode.aj.ecommerce;

import br.com.globalcode.aj.dao.ProdutoDAO;
import br.com.globalcode.aj.dao.ProdutoDB;
import lab08_01.src.br.com.globalcode.util.GlobalcodeException;
import java.util.List;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CatalogoProdutos extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ProdutoDAO produtosDB = new ProdutoDB();
        List listaProdutos = null;
        try {
            listaProdutos = produtosDB.getCatalogoProdutos();

            request.setAttribute("catalogo", listaProdutos);
            RequestDispatcher rd = request.getRequestDispatcher("/jsp/CatalogoProdutosView.jsp");
            rd.forward(request, response);

        } catch (GlobalcodeException e) {
            throw new ServletException(e);
        }
    }
}
