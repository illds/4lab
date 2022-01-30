package com.company;

import com.company.characters.*;
import com.company.places.Place;

public class Main {
    public static void main(String[] args) {
        Place carlhouse = new Place("Дом Карлсона");
        Place motherhouse = new Place("Дом Мамы");
        Baby malysh = new Baby("Малыш", carlhouse);
        Mother mom = new Mother("Мама", motherhouse);
        Carlson carl = new Carlson("Карлсон", carlhouse);

        carlhouse.come(carl);
        carlhouse.come(malysh);
        carlhouse.who();
        malysh.upDesireToClean();
        malysh.upDesireToClean();
        System.out.println();

        carl.lye();
        carl.comfort(carlhouse);
        carl.leaning();
        carl.ask();
        malysh.clean();
        System.out.println();

        motherhouse.come(malysh);
        motherhouse.come(mom);
        motherhouse.who();
        malysh.downDesireToClean();
        malysh.downDesireToClean();
        System.out.println();

        mom.remind();
        malysh.clean();
        mom.remind();
        malysh.upDesireToClean();
        malysh.clean();
        mom.remind();
        malysh.upDesireToClean();
        malysh.clean();
    }
}
