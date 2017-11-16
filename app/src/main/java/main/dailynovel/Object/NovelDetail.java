package main.dailynovel.Object;

public class NovelDetail {

    private int novelID;
    public int getNovelID() {
        return novelID;
    }
    public void setNovelID(int novelID) {
        this.novelID = novelID;
    }

    private int novelChapter;
    public int getNovelChapter() {
        return novelChapter;
    }
    public void setNovelChapter(int novelChapter) {
        this.novelChapter = novelChapter;
    }

    private String chapterName;
    public String getChapterName() {
        return chapterName;
    }
    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    private String chapterContent;
    public String getChapterContent() {
        return chapterContent;
    }
    public void setChapterContent(String chapterContent) {
        this.chapterContent = chapterContent;
    }

    public NovelDetail() {
    }

    public NovelDetail(int novelID, int novelChapter, String chapterName, String chapterContent) {
        this.novelID = novelID;
        this.novelChapter = novelChapter;
        this.chapterName = chapterName;
        this.chapterContent = chapterContent;
    }
}
