import java.util.*;
public class BoardRepository {
    private List<Board> store = new ArrayList<>();
    private int sequence = 0;
    public Board         save(Board board)  { /* ... */ return board; }
    public Optional<Board> findById(int id) {
        return store.stream().filter(b -> b.getId() == id).findFirst();
    }
    public List<Board>   findAll()          { return new ArrayList<>(store); }
    public void          delete(int id)     { store.removeIf(b -> b.getId() == id); }
}
