package br.com.alura.gerenciador.servlet;

import br.com.alura.gerenciador.models.Banco;
import br.com.alura.gerenciador.models.Empresa;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "MostrarEmpresaServlet", value = "/mostrarEmpresa")
public class MostrarEmpresaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Integer id = Integer.valueOf(req.getParameter("id"));

        Banco banco = new Banco();

        Empresa empresa = banco.buscaEmpresaById(id);

        System.out.println(empresa.toString());

        req.setAttribute("empresa", empresa);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/formEditarEmpresa.jsp");
        requestDispatcher.forward(req, resp);
    }
}
