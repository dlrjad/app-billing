package com.proyecto.app.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.proyecto.app.models.entity.Cliente;

/*Se heredaba de CrudRepository pero ahora de PagingAndSortingRepository que
 * heredera a su vez de CrudRepository*/
public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long> {

}
