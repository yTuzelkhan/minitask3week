public class PodcastEpiosde extends ContentItem implements Downloadable {
    protected String hostName;
    public PodcastEpiosde(String title, int year, int durationMinutes, String hostName) {
        super(title, year, durationMinutes);
        this.hostName = hostName;
    }
    public double getLicenseCost(int currentYear){
        if(currentYear-getYear()>2){
            return 0.5 * getDurationMinutes() + 3;
        }
        else return 0.5 * getDurationMinutes() + 1;
    }
    @Override
    public String toString() {
        return "1." + id + " 2." + title + " 3." + year + " 4." + durationMinutes +  " 5." + hostName;
    }
    public void download(){
        System.out.println("Downloading podcast hosted by Youtube");
    }
    public int getMaxDownloadsPerDay(){
        return 5;
    }
}