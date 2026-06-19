// [B계정,Conflict/B 브랜치에서 추가함]
// [A계정, Conflict/A 브랜치에서 추가]

public class Board {
    // [A계정이 add]
    private int    id;
    private String title;
    private String author;
    // getter/setter 생략
   // [B 계정이 add]
}
    // feature/A: 조회수 기능 추가
    private int viewCount = 0;
    public int  getViewCount()         { return viewCount; }
    public void incrementViewCount()   { this.viewCount++; }
    // feature/A: 조회수 기능 추가
    private int viewCount = 0;
    public int  getViewCount()         { return viewCount; }
    public void incrementViewCount()   { this.viewCount++; }
