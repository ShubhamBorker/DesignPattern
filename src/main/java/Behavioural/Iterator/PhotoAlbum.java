package Behavioural.Iterator;

import java.util.List;

public class PhotoAlbum {
    private List<Photo> photos;
    public PhotoAlbum(List<Photo> photos) {
        this.photos = photos;
    }
    public PhotoIterator createIterator() {
        return new AlbumIterator();
    }
    private class AlbumIterator implements PhotoIterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < photos.size();
        }

        @Override
        public Photo next() {
            return hasNext() ? photos.get(index++) : null;
        }
    }

}
