package cm.immo.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cm.immo.client.modele.Client;
import cm.immo.client.repository.ClientRepository;

@RestController
public class ClientController {
	@Autowired // This means to get the bean called userRepository
	    // Which is auto-generated by Spring, we will use it to handle the data
	private ClientRepository clientRepository; 
	
	@GetMapping(path="/client")
	public @ResponseBody Iterable<Client> getAllClients() {
	// This returns a JSON or XML with the users
	return clientRepository.findAll(); 
	}
	
	@PostMapping(path="/client")
	public Client createClient(@RequestBody Client client) {
	// This create the Clients
		
		return clientRepository.save(client); 
	}

}
