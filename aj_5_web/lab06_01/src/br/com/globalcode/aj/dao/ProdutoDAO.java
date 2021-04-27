package lab06_01.src.br.com.globalcode.aj.dao;

import java.util.List;
import lab06_01.src.br.com.globalcode.beans.Produto;
import lab06_01.src.br.com.globalcode.util.GlobalcodeException;

public interface ProdutoDAO {

    public void save(Produto p) throws GlobalcodeException;

    public List<Produto> getCatalogoProdutos() throws GlobalcodeException;

    public Produto getProdutoById(int id) throws GlobalcodeException;

    public void createTable() throws GlobalcodeException;
}