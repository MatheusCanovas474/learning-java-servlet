package br.com.alura.gerenciador.servlet;

import br.com.alura.gerenciador.acao.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "EntradaServlet", value = "/entrada")
public class EntradaServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String paramAcao = req.getParameter("acao");

        if (paramAcao.equals("ListaEmpresa")) {
            log("SERVICE | Listando empresas!");

            ListaEmpresa acao = new ListaEmpresa();
            acao.executa(req, resp);
        } else if (paramAcao.equals("MostraEmpresa")) {
            log("SERVICE | Mostrando empresas!");

            MostraEmpresa acao = new MostraEmpresa();
            acao.executa(req, resp);
        } else if(paramAcao.equals("RemoveEmpresa")) {
            log("SERVICE | Removendo empresas!");

            RemoveEmpresa acao = new RemoveEmpresa();
            acao.executa(req, resp);
        } else if(paramAcao.equals("AlteraEmpresa")) {
            log("SERVICE | Alterando empresas!");

            AlteraEmpresa acao = new AlteraEmpresa();
            acao.executa(req, resp);
        } else if(paramAcao.equals("NovaEmpresa")) {
            log("SERVICE | Registrando novas empresas!");

            NovaEmpresa acao = new NovaEmpresa();
            acao.executa(req, resp);
        } else {
            throw new IllegalArgumentException("Servico '" + paramAcao + "' nao suportado pela API.");
        }
    }
}
