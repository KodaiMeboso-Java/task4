import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<JumpHero> jumpHeros = new ArrayList<>();
        jumpHeros.add(new JumpHero("ONE PIECE", "ルフィ", 1997));
        jumpHeros.add(new JumpHero("ドラゴンボール", "孫悟空", 1984));
        jumpHeros.add(new JumpHero("ドラゴンクエストダイの大冒険", "勇者ダイ", 1989));
        jumpHeros.add(new JumpHero("HUNTER☓HUNTER", "ゴン＝フリークス", 1998));
        jumpHeros.add(new JumpHero("NARUTO", "うずまきナルト", 1999));
        jumpHeros.add(new JumpHero("家庭教師ヒットマンリボーン", "沢田綱吉", 2004));
        jumpHeros.add(new JumpHero("ワールドトリガー", "空閑遊馬", 2013));

        jumpHeros.stream().filter(j -> j.getYear() <= 2000).forEach(System.out::println);
    }
}
