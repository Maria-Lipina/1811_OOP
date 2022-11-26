import chars.BaseHero;
import chars.Team;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) { //������ ��� ��� ���� ����
//        list.forEach(System.out::println); // list.forEach(n -> System.out.println(n));

        //� ����� �� ������� �������� �� ������ ����������� ����������� chars.BaseHero. ����������, ���������, ������� � ������ ����� ���� � ����� � ���������� ���������, ��������, ���������� � ����� � ������

        String [] request = new String [] {"chars.Peasant", "chars.Robber", "chars.Sniper", "chars.Warlock"};
        String [] request1 = new String [] {"chars.Peasant", "chars.Spearman", "chars.Xbowman", "chars.Monk"};
        ArrayList<BaseHero> lightSide = Team.make(10, request);
        ArrayList<BaseHero> darkSide = Team.make(10, request1);
        lightSide.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("\n----\n");
        darkSide.forEach(n -> System.out.println(n.getInfo()));

    }

}