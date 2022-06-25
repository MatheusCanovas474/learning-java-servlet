package br.com.alura.gerenciador.acao;

import br.com.alura.gerenciador.models.Banco;
import br.com.alura.gerenciador.models.Empresa;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AlteraEmpresa {

    public void executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        String nomeEmpresa = req.getParameter("nome");
        String paramDataEmpresa = req.getParameter("data");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataAbertura;
        try {
            dataAbertura = sdf.parse(paramDataEmpresa);
        } catch (ParseException e) {
            throw new ServletException(e);
        }

        Banco banco = new Banco();
        Empresa empresa = banco.buscaEmpresaById(id);
        empresa.setNome(nomeEmpresa);
        empresa.setDataAbertura(dataAbertura);

        resp.sendRedirect("entrada?acao=ListaEmpresa");
    }

}
