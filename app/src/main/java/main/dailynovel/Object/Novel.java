package main.dailynovel.Object;

public class Novel {

    private int novelID;
    public int getNovelID() {
        return novelID;
    }
    public void setNovelID(int novelID) {
        this.novelID = novelID;
    }

    private String novelName;
    public String getNovelName() {
        return novelName;
    }
    public void setNovelName(String novelName) {
        this.novelName = novelName;
    }

    private String novelAuthors;
    public String getNovelAuthors() {
        return novelAuthors;
    }
    public void setNovelAuthors(String novelAuthors) {
        this.novelAuthors = novelAuthors;
    }

    private String novelType;
    public String getNovelType() {
        return novelType;
    }
    public void setNovelType(String novelType) {
        this.novelType = novelType;
    }

    private String novelStatus;
    public String getNovelStatus() {
        return novelStatus;
    }
    public void setNovelStatus(String novelStatus) {
        this.novelStatus = novelStatus;
    }

    private int novelVote;
    public int getNovelVote() {
        return novelVote;
    }
    public void setNovelVote(int novelVote) {
        this.novelVote = novelVote;
    }

    private String novelCover;
    public String getNovelCover() {
        return novelCover;
    }
    public void setNovelCover(String novelCover) {
        this.novelCover = novelCover;
    }

    public Novel() {
    }

    public Novel(int novelID, String novelName, String novelAuthors, String novelType, String novelStatus, int novelVote, String novelCover) {
        this.novelID = novelID;
        this.novelName = novelName;
        this.novelAuthors = novelAuthors;
        this.novelType = novelType;
        this.novelStatus = novelStatus;
        this.novelVote = novelVote;
        this.novelCover = novelCover;
    }
}
