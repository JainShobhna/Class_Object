class Garvi extends Sonu {

    private int height;

    public Garvi(String song, String lang, int starHeight) {
        super(song, lang);
        // TODO Auto-generated constructor stub
        this.height = starHeight;
        System.out.println(getSong());
        System.out.println(getLanguage());
    }

    public void setHeight(int newValue) {
        height = newValue;
    }

    public int getHeight() {
        return this.height;
    }

    public boolean isSongPerfact() {
        return (this.getSong()) != null;
    }
}
