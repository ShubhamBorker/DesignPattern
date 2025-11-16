package Behavioural.Iterator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Photo Photo1 = new Photo("Photo 1");
        Photo Photo2 = new Photo("Photo 2");
        Photo Photo3 = new Photo("Photo 3");

        PhotoAlbum album = new PhotoAlbum(Arrays.asList(Photo1, Photo2, Photo3));
        PhotoIterator iterator = album.createIterator();

        while (iterator.hasNext()) {
            Photo photo = iterator.next();
            System.out.println("Viewing: " + photo.getName());
        }
    }
}
