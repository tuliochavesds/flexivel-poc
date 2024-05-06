package blockly.DadosMockados;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class TabelaHome {

public static final int TIMEOUT = 300;

/**
 *
 * @author Túlio Chaves De Souza
 * @since 06/05/2024, 08:06:43
 *
 */
public static Var DadosTabelaHome() throws Exception {
 return new Callable<Var>() {

   private Var resposta = Var.VAR_NULL;

   public Var call() throws Exception {
    resposta =
    cronapi.list.Operations.newList(
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("pedido",
    Var.valueOf("1787")) , Var.valueOf("codCliente",
    Var.valueOf("1231231421")) , Var.valueOf("valor",
    Var.valueOf("R$ 63.000")) , Var.valueOf("previsao",
    Var.valueOf("23/02/2023"))),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("pedido",
    Var.valueOf("1787")) , Var.valueOf("codCliente",
    Var.valueOf("1231231421")) , Var.valueOf("valor",
    Var.valueOf("R$ 63.000")) , Var.valueOf("previsao",
    Var.valueOf("23/02/2023"))),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("pedido",
    Var.valueOf("1787")) , Var.valueOf("codCliente",
    Var.valueOf("1231231421")) , Var.valueOf("valor",
    Var.valueOf("R$ 63.000")) , Var.valueOf("previsao",
    Var.valueOf("23/02/2023"))),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("pedido",
    Var.valueOf("1787")) , Var.valueOf("codCliente",
    Var.valueOf("1231231421")) , Var.valueOf("valor",
    Var.valueOf("R$ 63.000")) , Var.valueOf("previsao",
    Var.valueOf("23/02/2023"))),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("pedido",
    Var.valueOf("1787")) , Var.valueOf("codCliente",
    Var.valueOf("1231231421")) , Var.valueOf("valor",
    Var.valueOf("R$ 63.000")) , Var.valueOf("previsao",
    Var.valueOf("23/02/2023"))),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("pedido",
    Var.valueOf("1787")) , Var.valueOf("codCliente",
    Var.valueOf("1231231421")) , Var.valueOf("valor",
    Var.valueOf("R$ 63.000")) , Var.valueOf("previsao",
    Var.valueOf("23/02/2023"))));
    return resposta;
   }
 }.call();
}

}

