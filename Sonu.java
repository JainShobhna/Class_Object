public class Sonu {
    private String songs;
    private String language;

    public Sonu(String song, String lang) {
        this.songs = song;
        this.language = lang;

    }

    public String getSong() {

        return this.songs;
    }

    public String getLanguage() {
        return this.language;
    }

    public void dance() {

        switch (getLanguage()) {
            case "Hindi":
            case "Rajasthani":
            case "English":
                System.out.println("Song is perfect");
                break;
            default:
                System.out.println("Please select another language to dance");
        }
    }
}
