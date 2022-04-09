package pl.coderslab.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component działa identycznie jak @Service, obojętnie czego użyjemy
@Service
public class PersonService {

    private PersonRepository personRepository;

//    @Autowired w starszych wersjach Spring'a trzeba dodać adnotację, do wstrzykiwania,
//    w nowych nie trzeba, ale można
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public PersonRepository getPersonRepository() {
        return personRepository;
    }
    //getter potrzebny w tym konkretnym zadaniu - powie nam czy coś zostało wstrzyknięte
}
