import javax.swing.text.AbstractDocument;
import java.util.ArrayList;

public class ContentDemo {
    public static void main(String[] args) {
        ArrayList<ContentItem> items = new ArrayList<ContentItem>();
        items.add(new VideoLecture("math",2001,12,"HD"));
        items.add(new VideoLecture("biology",2020,25,"4K"));
        items.add(new PodcastEpiosde("English_study",2025,30,"Spotify"));
        items.add(new PodcastEpiosde("History_of_banana",1999,60,"Apple_music"));
        int currentYear = java.time.Year.now().getValue();
        for(ContentItem item:items){
            System.out.println(item.toString() + " | licenseCost=" + item.getLicenseCost(currentYear));
            if (item instanceof Downloadable) {
                Downloadable downloadable1 = (Downloadable) item;
                downloadable1.download();
                System.out.println("Max downloads/day: " + downloadable1.getMaxDownloadsPerDay());
            }
        }
    }
}
