package br.com.alura.gerenciador.servlet;

import br.com.alura.gerenciador.models.Banco;
import br.com.alura.gerenciador.models.Empresa;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "RemoveEmpresaServlet", value = "/removeEmpresa")
public class RemoveEmpresaServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("SERVICE | Removendo empresa da lista");

        Banco banco = new Banco();

        Integer id = Integer.valueOf(req.getParameter("id"));
        List<Empresa> empresas = banco.getEmpresas();

        for (Empresa empresa : empresas) {
            if (empresa.getId() == id)
                empresas.remove(empresa);
        }

        req.setAttribute("empresas", empresas);

        resp.sendRedirect("listaEmpresas");
    }
}
