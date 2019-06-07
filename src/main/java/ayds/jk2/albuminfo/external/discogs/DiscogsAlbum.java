package ayds.jk2.albuminfo.external.discogs;

public class DiscogsAlbum {

    private String title;
    private String year;
    private String imageUrl;

    public DiscogsAlbum(String title, String year, String imageUrl){
        this.title = title;
        this.year = year;
        this.imageUrl = imageUrl;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setYear(String year){
        this.year = year;
    }

    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }

    public String getTitle(){
        return title;
    }

    public String getYear(){
        return year;
    }

    public String getImageUrl(){
        return imageUrl;
    }
}
