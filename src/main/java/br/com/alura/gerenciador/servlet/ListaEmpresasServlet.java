package br.com.alura.gerenciador.servlet;

import br.com.alura.gerenciador.models.Banco;
import br.com.alura.gerenciador.models.Empresa;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

//@WebServlet(name = "ListaEmpresasServlet", value = "/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("SERVICE | Listando todas as empresas");

        Banco banco = new Banco();
        List<Empresa> lista = banco.getEmpresas();
        req.setAttribute("empresas", lista);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/listaEmpresas.jsp");
        requestDispatcher.forward(req, resp);
    }
}
