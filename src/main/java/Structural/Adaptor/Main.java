package Structural.Adaptor;

public class Main {
    public static void main(String[] args) {
        VideoConverter aviConverter = new VideoAdapter("avi");
        VideoConverter mp4Converter = new VideoAdapter("mp4");

        aviConverter.convert("holiday_video.avi");
        mp4Converter.convert("wedding_video.mp4");
    }
}
