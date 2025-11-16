package Structural.Adaptor;

import java.util.Locale;

public class VideoAdapter implements VideoConverter{
    private String format;

    public VideoAdapter(String format) {
        this.format = format.toLowerCase();
    }

    @Override
    public void convert(String filename) {
        switch (format) {
            case "avi":
                AviConverter aviConverter = new AviConverter();
                aviConverter.convertToAvi(filename);
                break;
            case "mp4":
                Mp4Converter mp4Converter = new Mp4Converter();
                mp4Converter.convertToMp4(filename);
                break;
            default:
                System.out.println("Unsupported format: " + format);
        }
    }
}
