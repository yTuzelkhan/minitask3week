public class VideoLecture extends ContentItem implements Downloadable {
    protected String quality;
    public VideoLecture(String title, int year, int durationMinutes, String quality) {
        super(title, year, durationMinutes);
        this.quality = quality;
    }
    public double getLicenseCost(int currentYear){
        if(currentYear-getYear()>2){
            return 0.5 * getDurationMinutes() + 5;
        }
        else return 0.5 * getDurationMinutes() + 2;
    }
    @Override
    public String toString() {
        return "1." + id + " 2." + title + " 3." + year + " 4." + durationMinutes +  " 5." + quality;
    }
    public void download(){
        System.out.println("Downloading video in 16K");
    }
    public int getMaxDownloadsPerDay(){
        return 3;
    }
}