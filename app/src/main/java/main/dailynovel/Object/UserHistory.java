package main.dailynovel.Object;

public class UserHistory {

    private String userID;
    public String getUserID() {
        return userID;
    }
    public void setUserID(String userID) {
        this.userID = userID;
    }

    private int novelView;
    public int getNovelView() {
        return novelView;
    }
    public void setNovelView(int novelView) {
        this.novelView = novelView;
    }

    private int novelSub;
    public int getNovelSub() {
        return novelSub;
    }
    public void setNovelSub(int novelSub) {
        this.novelSub = novelSub;
    }

    private int lastView;
    public int getLastView() {
        return lastView;
    }
    public void setLastView(int lastView) {
        this.lastView = lastView;
    }

    private int lastChapter;
    public int getLastChapter() {
        return lastChapter;
    }
    public void setLastChapter(int lastChapter) {
        this.lastChapter = lastChapter;
    }

    public UserHistory() {
    }

    public UserHistory(String userID, int novelView, int novelSub, int lastView, int lastChapter) {
        this.userID = userID;
        this.novelView = novelView;
        this.novelSub = novelSub;
        this.lastView = lastView;
        this.lastChapter = lastChapter;
    }
}
