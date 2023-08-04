package Controllers;

import api.api.excepton.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import api.api.Service.*;
import api.api.Model.*;
import java.util.List;

@RestController
@RequestMapping("/api/publishers")
@CrossOrigin
public class publisherController {

    @Autowired
    PublisherService publisherService;

    @GetMapping
    public ResponseEntity<List<Publisher>> getPublishers() {
        return ResponseEntity.ok(publisherService.listAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Publisher> getPublisherById(@PathVariable("id") Integer id) throws PublisherNotFoundException {
        return ResponseEntity.ok(publisherService.get(id));
    }

    @PostMapping
    public ResponseEntity<Publisher> addPublisher(@RequestBody Publisher publisher) {
        publisherService.save(publisher);
        return ResponseEntity.ok(publisher);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<Publisher> updatePublisher(@PathVariable("id") Integer id, @RequestBody Publisher updatedPublisher) throws PublisherNotFoundException, PublisherNotFoundException {
        Publisher publisher = publisherService.get(id);
                ;
        publisher.setPublisher_email(updatedPublisher.getPublisher_email());
        publisher.setPublisher_name(updatedPublisher.getPublisher_name());
        publisher.setPublisher_description(updatedPublisher.getPublisher_description());
        publisherService.update(id, publisher);
        return ResponseEntity.ok(publisher);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Publisher> deletePublisher(@PathVariable("id") Integer id) throws PublisherNotFoundException {
        Publisher publisher = publisherService.get(id)
                ;
        publisherService.delete(id)
        ;
        return ResponseEntity.ok(publisher);
    }
}