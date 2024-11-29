public class UsaPictureBuilder extends PictureBuilder {

    public UsaPictureBuilder() {
    }

    @Override
    public UsaPictureBuilder setBasicParams(String name, int year, String author) {
        picture.setAuthor("USA! USA! USA! " + author);
        picture.setName("USA! USA! USA! " + name);
        picture.setYear(year);
        return this;
    }

    @Override
    public UsaPictureBuilder setSizeParms(Size size) {
        picture.setSize(size);
        return this;
    }

    @Override
    public UsaPictureBuilder setColorParms(String[] colors, boolean isWithFrames, String canvas) {
        picture.setColors(colors);
        picture.setWithFrames(isWithFrames);
        picture.setCanvas(canvas);
        return this;
    }

    @Override
    public UsaPictureBuilder setCategoryParms(String category, String theme) {
        picture.setCategory("USA! USA! USA! " + category);
        picture.setTheme("USA! USA! USA! " + theme);
        return this;
    }
}
