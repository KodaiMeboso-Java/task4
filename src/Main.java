import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<JumpHero> jumpheros = new ArrayList<>();
        jumpheros.add(new JumpHero("ONE PIECE", "ルフィ", 1997));
        jumpheros.add(new JumpHero("ドラゴンボール", "孫悟空", 1984));
        jumpheros.add(new JumpHero("ドラゴンクエストダイの大冒険", "勇者ダイ", 1989));
        jumpheros.add(new JumpHero("HUNTER☓HUNTER", "ゴン＝フリークス", 1998));
        jumpheros.add(new JumpHero("NARUTO", "うずまきナルト", 1999));
        jumpheros.add(new JumpHero("家庭教師ヒットマンリボーン", "沢田綱吉", 2004));
        jumpheros.add(new JumpHero("ワールドトリガー", "空閑遊馬", 2013));

        /*List<JumpHero> list = jumpheros.stream()
                .filter(j -> j.getYear() <= 2000)
                .collect(Collectors.toList());
        System.out.println(list);*/
        jumpheros.stream().filter(j -> j.getYear() <= 2000).forEach(System.out::println);
    }
}
