package api.api.Service;

import api.api.Model.Publisher;
import api.api.Repository.PublisherRepository;
import api.api.excepton.PublisherNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PublisherService {

    @Autowired
    PublisherRepository publisherRepository;

    public List<Publisher> listAll() {
        return (List<Publisher>) publisherRepository.findAll();
    }

    public void save(Publisher publisher) {
        publisherRepository.save(publisher);
    }

    public Publisher get(Integer id) throws PublisherNotFoundException {
        Optional<Publisher> result = publisherRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        }
        throw new PublisherNotFoundException("Could not found any publisher with the id: " + id);
    }

    public void update(Integer id, Publisher publisher) throws PublisherNotFoundException {
        Long count = publisherRepository.countById(id);
        if (count == null || count == 0) {
            throw new PublisherNotFoundException("Could not found any publisher with the id: " + id);
        }
        publisher.setId(id);
        publisherRepository.save(publisher);
    }

    public void delete(Integer id) throws PublisherNotFoundException {
        Long count = publisherRepository.countById(id);
        if (count == null || count == 0) {
            throw new PublisherNotFoundException("Could not found any publisher with the id: " + id);
        }
        publisherRepository.deleteById(id);
    }
}
