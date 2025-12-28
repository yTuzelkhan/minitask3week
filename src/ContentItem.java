abstract class ContentItem {
    protected int id;
    protected static int idGen=1;
    protected String title;
    protected int year;
    protected int durationMinutes;
    public ContentItem(String title, int year, int durationMinutes) {
        id = idGen++;
        setTitle(title);
        setYear(year);
        setDurationMinutes(durationMinutes);
    }
    public void setTitle(String title) {
        if(title==null)throw new IllegalArgumentException();
        else{
            this.title = title;
        }
    }
    public String getTitle() {
        return title;
    }
    public void setYear(int year) {
        if(year<1990 || year>2025)throw new IllegalArgumentException();
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    public void setDurationMinutes(int durationMinutes) {
        if(0>durationMinutes)throw new IllegalArgumentException();
        this.durationMinutes = durationMinutes;
    }
    public int getDurationMinutes() {
        return durationMinutes;
    }
    public int getAge(){
        return 2025-year;
    }
    public abstract double getLicenseCost(int currentYear);
    public String toString(){
        return "id:" + id + " title:" + title + " year:" + year + " durationMinutes:" + durationMinutes;
    }
}