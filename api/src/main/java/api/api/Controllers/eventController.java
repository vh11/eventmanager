package api.api.Controllers;

import api.api.excepton.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import api.api.Service.*;
import api.api.Model.*;
import java.util.List;

@RestController
@RequestMapping("/api/events")
@CrossOrigin
public class eventController {

    @Autowired
    EventService eventService;

    @GetMapping
    public ResponseEntity<List<Events>> getEvents() {
        return ResponseEntity.ok(eventService.listAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Events> getEventById(@PathVariable("id") Integer id) throws  EventNotFoundException {
        return ResponseEntity.ok(eventService.get(id));
    }

    @PostMapping
    public ResponseEntity<Events> addEvent(@RequestBody Events events) {
        eventService.saveEvent(events);
        return ResponseEntity.ok(events);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<Events> updateEvents(@PathVariable("id") Integer id, @RequestBody Events updatedEvents) throws  EventNotFoundException {
        Events events = eventService.get(id);
        ;
        events.setEvent_name(updatedEvents.getEvent_name());
        events.setEvent_category(updatedEvents.getEvent_category());
        events.setEvent_description(updatedEvents.getEvent_description());
        events.setEvent_location(updatedEvents.getEvent_location());
        events.setDate_from(updatedEvents.getDate_from());
        events.setPublisher(updatedEvents.getPublisher());
        eventService.updateEvent(id, events);
        return ResponseEntity.ok(events);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Events> deleteEvent(@PathVariable("id") Integer id) throws  EventNotFoundException {
        Events events = eventService.get(id)
                ;
        eventService.delete(id)
        ;
        return ResponseEntity.ok(events);
    }
}