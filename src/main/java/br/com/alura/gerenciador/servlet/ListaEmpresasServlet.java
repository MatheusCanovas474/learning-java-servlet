package br.com.alura.gerenciador.servlet;

import br.com.alura.gerenciador.models.Banco;
import br.com.alura.gerenciador.models.Empresa;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ListaEmpresasServlet", value = "/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Banco banco = new Banco();
        List<Empresa> lista = banco.getEmpresas();
        PrintWriter out = resp.getWriter();

        out.println("<html><body>");

        out.println("<ul>");
        for (Empresa empresa : lista) {
            out.println("<li>" + empresa.getNome() + "</li>");
        }
        out.println("</ul>");

        out.println("</body></html>");
    }
}