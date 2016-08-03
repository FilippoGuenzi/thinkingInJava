package _10_Inner_Classes._06_anonymous_inner_classes.exercises.exercise14;

interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

class DragonZilla implements DangerousMonster {
    public void destroy() {
        System.out.println("DragonZilla destroys");
    }

    public void menace() {
        System.out.println("DragonZilla menace");
    }
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

class VeryBadVampire implements Vampire {
    public void drinkBlood() {
        System.out.println("VeryBadVampire drinks blood");
    }

    public void destroy() {
        System.out.println("Very bad vampire destroys");
    }

    public void kill() {
        System.out.println("Very bad vampire kills");
    }

    public void menace() {
        System.out.println("Very bad vampire menace");
    }
}

public class HorroShow {
    static void u(Monster b) {
        b.menace();
    }

    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }

    static void w(Lethal l) {
        l.kill();
    }

    public static void main(String[] args) {
        DangerousMonster barney = new DangerousMonster() {
            public void destroy() {
                System.out.println("barney destroys");
            }

            public void menace() {
                System.out.println("barneys menace");
            }
        };
        u(barney);
        v(barney);
        Vampire vlad = new Vampire() {
            public void drinkBlood() {
                System.out.println("vlad drinks blood");
            }

            public void destroy() {
                System.out.println("vlad destroys");
            }

            public void kill() {
                System.out.println("vlad kills");
            }

            public void menace() {
                System.out.println("vlad menace");
            }
        };
        u(vlad);
        v(vlad);
        w(vlad);
    }

}


