import java.util.List;

public class Miskas {


    public static void ivairusMiskas(List<? extends Medis> medziai) {
        System.out.println("Ivairus Miskas:");
        for (Medis medis : medziai) {
            medis.turi();
        }
        System.out.println();
    }

    public static void spygliuociuMiskas(List<? extends Spygliuotis> spygliuociai) {
        System.out.println("Spygliuociu miskas:");
        for (Spygliuotis spygliuotis : spygliuociai) {
            spygliuotis.turi();
        }
        System.out.println();
    }

    public static void berzuMiskas(List<Berzas> berzai) {
        System.out.println("Berzu miskas:");
        for (Berzas berzas : berzai) {
            berzas.turi();
        }
        System.out.println();
    }
}

