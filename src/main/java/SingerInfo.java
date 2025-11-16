import java.util.*;

public class SingerInfo {


    public String singerName;
    private String songName;

    public SingerInfo(String s1 , String s2)
    {
        songName = s2;
        singerName = s1;
    }

    public String getSingerName() {
        return singerName;
    }

    public String getSongName() {
        return songName;
    }

    @Override
    public int hashCode()
    {
        return singerName.hashCode() + songName.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SingerInfo that = (SingerInfo) o;
        return singerName.equals(that.singerName) && Objects.equals(songName, that.songName);
    }


    public static void main(String[] args) {
        SingerInfo s1 = new SingerInfo("chinu", "song1");
        SingerInfo s2 = new SingerInfo("Nitu","song2");
        SingerInfo s3 = new SingerInfo("chinu","song1");
        SingerInfo s4 = new SingerInfo("shubhu","song1");

        List<SingerInfo> l = new ArrayList<>();
        l.add(s1);
        l.add(s2);
        l.add(s3);
        l.add(s4);

        HashSet<SingerInfo> h = new HashSet<>();
        h.add(s1);
        h.add(s2);
        h.add(s3);
        h.add(s4);
        Iterator i1 = h.iterator();
        while(i1.hasNext())
        {
            SingerInfo s = (SingerInfo) i1.next();
            System.out.println("singename is " + s.getSingerName() + " songname is " + s.getSongName());
            //did it detected 2 similar objects no?? so we need to override hashcode and equals
        }



    }

}
