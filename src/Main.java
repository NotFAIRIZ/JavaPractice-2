public class Main {
    public static void main(String[] args) {

        String location = "US";
        PictureBuilder pb;

        if ("UA".equals(location)) {
            pb = new UkrainePictureBuilder();
        } else {
            pb = new UsaPictureBuilder();
        }

        System.out.println("USA picture buildr:");

        pb.setBasicParams("Cool USA picture", 1984, "Someone");

        Picture picture = pb.build();

        System.out.println(picture);

        location = "UA";

        if ("UA".equals(location)) {
            pb = new UkrainePictureBuilder();
        } else {
            pb = new UsaPictureBuilder();
        }
        System.out.println();

        System.out.println("UA picture buildr:");

        pb.setBasicParams("Cool UA picture", 1984, "Someone");

        picture = pb.build();

        System.out.println(picture);

    }
}
