package br.com.alura.gerenciador.acao;

import br.com.alura.gerenciador.models.Banco;
import br.com.alura.gerenciador.models.Empresa;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListaEmpresa {

    public void executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Banco banco = new Banco();
        List<Empresa> lista = banco.getEmpresas();
        req.setAttribute("empresas", lista);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/listaEmpresas.jsp");
        requestDispatcher.forward(req, resp);
    }


}
