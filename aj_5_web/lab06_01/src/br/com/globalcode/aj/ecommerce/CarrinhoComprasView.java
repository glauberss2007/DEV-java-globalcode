package lab06_01.src.br.com.globalcode.aj.ecommerce;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import lab06_01.src.br.com.globalcode.beans.CarrinhoCompras;
import lab06_01.src.br.com.globalcode.beans.Item;
import lab06_01.src.br.com.globalcode.beans.Produto;

public class CarrinhoComprasView extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        doAction(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        doAction(request, response);
    }

    public void doAction(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String contexto = request.getContextPath();
        try {
            CarrinhoCompras carrinho = null;
            // -------------------------------------------------------------------
            // Insira a partir daqui o código pedido no laboratorio:
            // -------------------------------------------------------------------



            List<Item> itens = carrinho.getItems();
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
            out.println("<HTML>");
            out.println("<HEAD>");
            out.println("<TITLE>Ecommerce : Academia do Java</TITLE>");
            out.println("<META http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
            out.println("<LINK href= 'aj.css' rel='stylesheet' type='text/css'></LINK>");
            out.println("</HEAD>");
            out.println("<BODY>");
            String nomeDaLoja = getServletContext().getInitParameter("nome-da-loja");
            out.println("<H3>Suas compras em " + nomeDaLoja + "</H3>");
            out.println("<TABLE width = '700' border='0'>");
            out.println("<TR>");
            out.println("  <TD width = '70%' colspan='4'></TD>");
            out.println("  <TD  class = 'tituloform' width = '70%'>");
            out.println("     <A HREF= '" + contexto + "/catalogoProdutos' >Continuar compras</A>");
            out.println("  </TD>");
            out.println("  <TD width='10%'>");
            out.println("     <A HREF= '" + contexto + "/catalogoProdutos'>");
            out.println("       <img src='" + contexto + "/imagem/carrinho.gif'/> </A>");
            out.println("  </TD>");
            out.println("</TR>");
            out.println("<TR width = '%100' class='tituloCampo'>");
            out.println("<TD width = '%20'>Imagem</TD>");
            out.println("<TD width = '%10' >Nome</TD>");
            out.println("<TD width = '%10' >Codigo</TD>");
            out.println("<TD width = '%10'  >Descri&ccedil;&atilde;o</TD>");
            out.println("<TD width = '%10' >Pre&ccedil;o</TD>");
            out.println("<TD width = '%20' colspan = '2'>Quantidade</TD>");
            out.println("</TR>");

            // loop para imprimir todos os itens encontrados no carrinho de compras
            for (Item item : itens) {
                String itemFormatadoHTML = imprimeItem(request, item);
                out.println(itemFormatadoHTML);
            }
            out.println("</TABLE>");
            out.println("</BODY>");
            out.println("</HTML>");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String imprimeItem(HttpServletRequest request, Item item) {
        Produto p = item.getProduto();
        NumberFormat formatadorMoeda = NumberFormat.getCurrencyInstance();
        String preco = formatadorMoeda.format(p.getPreco());
        String pImage = "<TD width='%20'> <IMG SRC='" + request.getContextPath() + "/imagem/" + p.getImage() + "'/></TD>\n";
        String pNome = "<TD width='%10'  class='gridCampo'> " + p.getNome() + "</TD>\n";
        String pCodigo = "<TD width='%10' class='gridCampo'> " + p.getCodigo() + "</TD>\n";
        String pDesc = "<TD width='%10'  class='gridCampo'> " + p.getDescricao() + "</TD>\n";
        String pPreco = "<TD width='%10' class='gridCampo'> " + preco + " (preco unid.)</TD>\n";
        String pQuantidade = "<TD width = '%20' class='gridCampo'>"+item.getQuantidade()+"</TD>";
        String dados = "";
        dados += "<TR width = '%100'>" + pImage + pNome + pCodigo + pDesc + pPreco + pQuantidade +"</TR> \n";
        return dados;
    }
}
