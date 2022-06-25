package br.com.alura.gerenciador.acao;

import br.com.alura.gerenciador.models.Banco;
import br.com.alura.gerenciador.models.Empresa;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MostraEmpresa {

    public void executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));

        Banco banco = new Banco();

        Empresa empresa = banco.buscaEmpresaById(id);

        req.setAttribute("empresa", empresa);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/formEditarEmpresa.jsp");
        requestDispatcher.forward(req, resp);
    }

}
