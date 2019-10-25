package mx.com.chelaya.service;

import java.util.ArrayList;
import java.util.List;

import mx.com.chelaya.model.ClientePedido;

public class PedidoChelasYaService implements PedidosChelasYa  {

	private static List<ClientePedido> pedidos = new ArrayList<>();
	
	@Override
	public String pedirChelas(ClientePedido clientePedido) {
		String mensajeRespuesta ="";
		if(clientePedido.getEdad() < 18) {
			mensajeRespuesta = "No se vende alcohol a menores de edad";
		}else {
			mensajeRespuesta = "Pedido Recibido"+
							   "de:"+clientePedido.getNombre()+
							   "se enviara el pedido a:"+ clientePedido.getDireccion();
			pedidos.add(clientePedido);
		}
		return mensajeRespuesta;
	}

	@Override
	public List<ClientePedido> obtenerPedidos() {
		// TODO Auto-generated method stub
		return pedidos;
	}

}
