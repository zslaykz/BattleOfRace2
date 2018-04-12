package team;


import hero.Unit;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Team {

    private static final int TEAM_MEAMBERS = 3;

    private Unit[] units;

    public void createTeam(){
        Unit[] heroes = new Unit[TEAM_MEAMBERS];
        heroes[0] = createLiederHero();
        StatUtil.addHeroStat(heroes[0]);
        for (int i = 1; i < TEAM_MEMBERS; i++) {
            System.out.println("Create " + i + " comrade hero");
            heroes[i] = createComradeHero();
            StatUtil.addHeroStat(heroes[i]);
        }
        this.heroes = heroes;
    }

    private Unit createComradeHero() {
        String heroName = Unit.getHeroName();
        String race = InputData.getRaceName();
        return new Hero(heroName, HeroRanks.COMRADE,
                ProfessionMap.getProfession().get(race).get(InputData.getProfessionName(race)));
    }

    private Hero createLiederHero() {
        System.out.println("Create leader hero");
        String heroName = InputData.getHeroName();
        String race = InputData.getRaceName();
        return new Hero(heroName, HeroRanks.LEADER,
                ProfessionMap.getProfession().get(race).get(InputData.getProfessionName(race)));
    }
}
