package lab04_03.src.br.com.globalcode.aj.dao;

import java.util.List;
import lab04_03.src.br.com.globalcode.beans.Produto;
import lab04_03.src.br.com.globalcode.util.GlobalcodeException;

public interface ProdutoDAO {

    public void save(Produto p) throws GlobalcodeException;

    public List<Produto> getCatalogoProdutos() throws GlobalcodeException;

    public Produto getProdutoById(int id) throws GlobalcodeException;

    public void createTable() throws GlobalcodeException;
}