package mx.com.chelaya.service;

import java.util.List;

import javax.jws.WebService;

import mx.com.chelaya.model.ClientePedido;

@WebService(endpointInterface = "mx.com.chelaya.services.pedidoChelaYa")
public interface PedidosChelasYa {
	
	/**
	 * funcion para realizar un pedido de chelas 
	 * con los datos del pedido y del cliente 
	 * @param clientePedido  datos del cliente y del pedido
	 * @return respuesta se se recibio el pedido
	 */
	String pedirChelas(ClientePedido clientePedido);
	/**
	 * funcion para consultar la cntidad de pedidos 
	 * @return lista de pedidos
	 */
	List<ClientePedido>obtenerPedidos();
}
