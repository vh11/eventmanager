package api.api.Service;

import api.api.Model.Events;
import api.api.Repository.EventsRepository;
import api.api.excepton.EventNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    EventsRepository eventsRepository;

    public List<Events> listAll() {
        return (List<Events>) eventsRepository.findAll();
    }

    public void saveEvent(api.api.Model.Events events) {
        eventsRepository.save(events);
    }

    public Events get(Integer id) throws EventNotFoundException {
        Optional<Events> result = eventsRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        }
        throw new EventNotFoundException("Could not found any event with the id: " + id);
    }

    public void updateEvent(Integer id, Events events) throws EventNotFoundException {
        Long count = eventsRepository.countById(id);
        if (count == null || count == 0) {
            throw new EventNotFoundException("Could not found any event with the id: " + id);
        }
        events.setId(id);
        eventsRepository.save(events);
    }

    public void delete(Integer id) throws EventNotFoundException {
        Long count = eventsRepository.countById(id);
        if (count == null || count == 0) {
            throw new EventNotFoundException("Could not found any event with the id: " + id);
        }
        eventsRepository.deleteById(id);
    }
}
