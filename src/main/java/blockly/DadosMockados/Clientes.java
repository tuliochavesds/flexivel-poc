package blockly.DadosMockados;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Clientes {

public static final int TIMEOUT = 300;

/**
 *
 * @author Túlio Chaves De Souza
 * @since 06/05/2024, 10:57:08
 *
 */
public static Var TabelaClientes() throws Exception {
 return new Callable<Var>() {

   private Var resposta = Var.VAR_NULL;

   public Var call() throws Exception {
    resposta =
    cronapi.list.Operations.newList(
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("codigo",
    Var.valueOf("1787")) , Var.valueOf("cliente",
    Var.valueOf("REFRIMATE")) , Var.valueOf("ultCompra",
    Var.valueOf("31/12/2022")) , Var.valueOf("valorUltCompra",
    Var.valueOf("R$ 63.000")) , Var.valueOf("diasSemCompra",
    Var.valueOf("21")) , Var.valueOf("meta",
    Var.valueOf("R$ 23.000")) , Var.valueOf("realizado",
    Var.valueOf("R$ 39.000")) , Var.valueOf("utilNf",
    Var.valueOf("1357")) , Var.valueOf("mix",
    Var.valueOf("6")) , Var.valueOf("visita",
    Var.valueOf("23/02/2023")) , Var.valueOf("projetos",
    Var.valueOf("8")) , Var.valueOf("status",
    Var.valueOf("Ativo"))),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("codigo",
    Var.valueOf("1787")) , Var.valueOf("cliente",
    Var.valueOf("REFRIMATE")) , Var.valueOf("ultCompra",
    Var.valueOf("31/12/2022")) , Var.valueOf("valorUltCompra",
    Var.valueOf("R$ 63.000")) , Var.valueOf("diasSemCompra",
    Var.valueOf("21")) , Var.valueOf("meta",
    Var.valueOf("R$ 23.000")) , Var.valueOf("realizado",
    Var.valueOf("R$ 39.000")) , Var.valueOf("utilNf",
    Var.valueOf("1357")) , Var.valueOf("mix",
    Var.valueOf("6")) , Var.valueOf("visita",
    Var.valueOf("23/02/2023")) , Var.valueOf("projetos",
    Var.valueOf("8")) , Var.valueOf("status",
    Var.valueOf("Inativo"))),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("codigo",
    Var.valueOf("1787")) , Var.valueOf("cliente",
    Var.valueOf("REFRIMATE")) , Var.valueOf("ultCompra",
    Var.valueOf("31/12/2022")) , Var.valueOf("valorUltCompra",
    Var.valueOf("R$ 63.000")) , Var.valueOf("diasSemCompra",
    Var.valueOf("21")) , Var.valueOf("meta",
    Var.valueOf("R$ 23.000")) , Var.valueOf("realizado",
    Var.valueOf("R$ 39.000")) , Var.valueOf("utilNf",
    Var.valueOf("1357")) , Var.valueOf("mix",
    Var.valueOf("6")) , Var.valueOf("visita",
    Var.valueOf("23/02/2023")) , Var.valueOf("projetos",
    Var.valueOf("8")) , Var.valueOf("status",
    Var.valueOf("Ativo"))),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("codigo",
    Var.valueOf("1787")) , Var.valueOf("cliente",
    Var.valueOf("REFRIMATE")) , Var.valueOf("ultCompra",
    Var.valueOf("31/12/2022")) , Var.valueOf("valorUltCompra",
    Var.valueOf("R$ 63.000")) , Var.valueOf("diasSemCompra",
    Var.valueOf("21")) , Var.valueOf("meta",
    Var.valueOf("R$ 23.000")) , Var.valueOf("realizado",
    Var.valueOf("R$ 39.000")) , Var.valueOf("utilNf",
    Var.valueOf("1357")) , Var.valueOf("mix",
    Var.valueOf("6")) , Var.valueOf("visita",
    Var.valueOf("23/02/2023")) , Var.valueOf("projetos",
    Var.valueOf("8")) , Var.valueOf("status",
    Var.valueOf("Ativo"))),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("codigo",
    Var.valueOf("1787")) , Var.valueOf("cliente",
    Var.valueOf("REFRIMATE")) , Var.valueOf("ultCompra",
    Var.valueOf("31/12/2022")) , Var.valueOf("valorUltCompra",
    Var.valueOf("R$ 63.000")) , Var.valueOf("diasSemCompra",
    Var.valueOf("21")) , Var.valueOf("meta",
    Var.valueOf("R$ 23.000")) , Var.valueOf("realizado",
    Var.valueOf("R$ 39.000")) , Var.valueOf("utilNf",
    Var.valueOf("1357")) , Var.valueOf("mix",
    Var.valueOf("6")) , Var.valueOf("visita",
    Var.valueOf("23/02/2023")) , Var.valueOf("projetos",
    Var.valueOf("8")) , Var.valueOf("status",
    Var.valueOf("Ativo"))),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("codigo",
    Var.valueOf("1787")) , Var.valueOf("cliente",
    Var.valueOf("REFRIMATE")) , Var.valueOf("ultCompra",
    Var.valueOf("31/12/2022")) , Var.valueOf("valorUltCompra",
    Var.valueOf("R$ 63.000")) , Var.valueOf("diasSemCompra",
    Var.valueOf("21")) , Var.valueOf("meta",
    Var.valueOf("R$ 23.000")) , Var.valueOf("realizado",
    Var.valueOf("R$ 39.000")) , Var.valueOf("utilNf",
    Var.valueOf("1357")) , Var.valueOf("mix",
    Var.valueOf("6")) , Var.valueOf("visita",
    Var.valueOf("23/02/2023")) , Var.valueOf("projetos",
    Var.valueOf("8")) , Var.valueOf("status",
    Var.valueOf("Ativo"))),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("codigo",
    Var.valueOf("1787")) , Var.valueOf("cliente",
    Var.valueOf("REFRIMATE")) , Var.valueOf("ultCompra",
    Var.valueOf("31/12/2022")) , Var.valueOf("valorUltCompra",
    Var.valueOf("R$ 63.000")) , Var.valueOf("diasSemCompra",
    Var.valueOf("21")) , Var.valueOf("meta",
    Var.valueOf("R$ 23.000")) , Var.valueOf("realizado",
    Var.valueOf("R$ 39.000")) , Var.valueOf("utilNf",
    Var.valueOf("1357")) , Var.valueOf("mix",
    Var.valueOf("6")) , Var.valueOf("visita",
    Var.valueOf("23/02/2023")) , Var.valueOf("projetos",
    Var.valueOf("8")) , Var.valueOf("status",
    Var.valueOf("Ativo"))),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("codigo",
    Var.valueOf("1787")) , Var.valueOf("cliente",
    Var.valueOf("REFRIMATE")) , Var.valueOf("ultCompra",
    Var.valueOf("31/12/2022")) , Var.valueOf("valorUltCompra",
    Var.valueOf("R$ 63.000")) , Var.valueOf("diasSemCompra",
    Var.valueOf("21")) , Var.valueOf("meta",
    Var.valueOf("R$ 23.000")) , Var.valueOf("realizado",
    Var.valueOf("R$ 39.000")) , Var.valueOf("utilNf",
    Var.valueOf("1357")) , Var.valueOf("mix",
    Var.valueOf("6")) , Var.valueOf("visita",
    Var.valueOf("23/02/2023")) , Var.valueOf("projetos",
    Var.valueOf("8")) , Var.valueOf("status",
    Var.valueOf("Ativo"))),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("codigo",
    Var.valueOf("1787")) , Var.valueOf("cliente",
    Var.valueOf("REFRIMATE")) , Var.valueOf("ultCompra",
    Var.valueOf("31/12/2022")) , Var.valueOf("valorUltCompra",
    Var.valueOf("R$ 63.000")) , Var.valueOf("diasSemCompra",
    Var.valueOf("21")) , Var.valueOf("meta",
    Var.valueOf("R$ 23.000")) , Var.valueOf("realizado",
    Var.valueOf("R$ 39.000")) , Var.valueOf("utilNf",
    Var.valueOf("1357")) , Var.valueOf("mix",
    Var.valueOf("6")) , Var.valueOf("visita",
    Var.valueOf("23/02/2023")) , Var.valueOf("projetos",
    Var.valueOf("8")) , Var.valueOf("status",
    Var.valueOf("Ativo"))),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("codigo",
    Var.valueOf("1787")) , Var.valueOf("cliente",
    Var.valueOf("REFRIMATE")) , Var.valueOf("ultCompra",
    Var.valueOf("31/12/2022")) , Var.valueOf("valorUltCompra",
    Var.valueOf("R$ 63.000")) , Var.valueOf("diasSemCompra",
    Var.valueOf("21")) , Var.valueOf("meta",
    Var.valueOf("R$ 23.000")) , Var.valueOf("realizado",
    Var.valueOf("R$ 39.000")) , Var.valueOf("utilNf",
    Var.valueOf("1357")) , Var.valueOf("mix",
    Var.valueOf("6")) , Var.valueOf("visita",
    Var.valueOf("23/02/2023")) , Var.valueOf("projetos",
    Var.valueOf("8")) , Var.valueOf("status",
    Var.valueOf("Ativo"))),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("codigo",
    Var.valueOf("1787")) , Var.valueOf("cliente",
    Var.valueOf("REFRIMATE")) , Var.valueOf("ultCompra",
    Var.valueOf("31/12/2022")) , Var.valueOf("valorUltCompra",
    Var.valueOf("R$ 63.000")) , Var.valueOf("diasSemCompra",
    Var.valueOf("21")) , Var.valueOf("meta",
    Var.valueOf("R$ 23.000")) , Var.valueOf("realizado",
    Var.valueOf("R$ 39.000")) , Var.valueOf("utilNf",
    Var.valueOf("1357")) , Var.valueOf("mix",
    Var.valueOf("6")) , Var.valueOf("visita",
    Var.valueOf("23/02/2023")) , Var.valueOf("projetos",
    Var.valueOf("8")) , Var.valueOf("status",
    Var.valueOf("Ativo"))),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("codigo",
    Var.valueOf("1787")) , Var.valueOf("cliente",
    Var.valueOf("REFRIMATE")) , Var.valueOf("ultCompra",
    Var.valueOf("31/12/2022")) , Var.valueOf("valorUltCompra",
    Var.valueOf("R$ 63.000")) , Var.valueOf("diasSemCompra",
    Var.valueOf("21")) , Var.valueOf("meta",
    Var.valueOf("R$ 23.000")) , Var.valueOf("realizado",
    Var.valueOf("R$ 39.000")) , Var.valueOf("utilNf",
    Var.valueOf("1357")) , Var.valueOf("mix",
    Var.valueOf("6")) , Var.valueOf("visita",
    Var.valueOf("23/02/2023")) , Var.valueOf("projetos",
    Var.valueOf("8")) , Var.valueOf("status",
    Var.valueOf("Ativo"))));
    return resposta;
   }
 }.call();
}

}

