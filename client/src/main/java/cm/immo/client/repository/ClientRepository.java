package cm.immo.client.repository;

import org.springframework.data.repository.CrudRepository;

import cm.immo.client.modele.Client;

public interface ClientRepository extends CrudRepository<Client, Integer> {

}
