package udemy.springframework.model.petclinic.services.map;

import java.util.*;

public abstract class AbstractMapService<T, ID> {

    protected Map<Long,T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return (T) map.get(id);
    }

    T save(ID id, T object) {
        map.put((Long) id, object);
        return object;
    }

    void deleteByID(ID id) {
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(Entry -> Entry.getValue().equals(object));
    }
}
