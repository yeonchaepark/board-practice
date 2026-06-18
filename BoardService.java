import java.util.*;
public class BoardService {
    private List<Board> boards = new ArrayList<>();
    public List<Board> findAll() { System.out.println("[A버전] 전체 목록 조회");
        return boards; }
    public Board       findById(int id) {
        return boards.stream()
                     .filter(b -> b.getId() == id)
                     .findFirst().orElse(null);
    }
}
    // feature/B: 삭제 기능 추가
    public boolean delete(int id) {
        Board board = findById(id);
        if (board == null)
            throw new IllegalArgumentException("게시글을 찾을 수 없습니다. ID: " + id);
        return boards.remove(board);
    }
    // 수정 기능 추가
    public Board update(int id, String newTitle, String newContent) {
        Board board = findById(id);
        if (board == null)
            throw new IllegalArgumentException("게시글을 찾을 수 없습니다. ID: " + id);
        board.setTitle(newTitle);
        board.setContent(newContent);
        return board;
    }
