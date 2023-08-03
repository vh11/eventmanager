package api.api.Repository;

import api.api.Model.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventsRepository extends  JpaRepository<Events, Integer>{
    Long countById(Integer id);
}
