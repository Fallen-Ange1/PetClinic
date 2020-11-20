package udemy.springframework.model.petclinic.services.map;

import udemy.springframework.model.petclinic.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return (T) map.get(id);
    }

    T save(T object) {
        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextID());
            }
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object cannot be null");
        }
        return object;
    }

    void deleteByID(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(Entry -> Entry.getValue().equals(object));
    }

    private long getNextID() {
        Long nextID;
        try {
            nextID = Collections.max(map.keySet()) + 1;
        }catch (NoSuchElementException ex){
            nextID = 1L;
        }
        return nextID;
    }
}
