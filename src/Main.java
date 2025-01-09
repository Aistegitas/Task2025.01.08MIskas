import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Azuolas azuolas = new Azuolas();
        Berzas berzas1 = new Berzas();
        Berzas berzas2 = new Berzas();
        Berzas berzas3 = new Berzas();
        Egle egle = new Egle();
        Pusis pusis = new Pusis();
        Kadagys kadagys = new Kadagys();


        List<Medis> visiMedziai = new ArrayList<>();
        visiMedziai.add(azuolas);
        visiMedziai.add(berzas1);
        visiMedziai.add(egle);
        visiMedziai.add(pusis);
        visiMedziai.add(kadagys);


        List<Spygliuotis> spygliuociai = new ArrayList<>();
        spygliuociai.add(egle);
        spygliuociai.add(pusis);
        spygliuociai.add(kadagys);


        List<Berzas> berzai = new ArrayList<>();
        berzai.add(berzas1);
        berzai.add(berzas2);
        berzai.add(berzas3);


        Miskas.ivairusMiskas(visiMedziai);
        Miskas.spygliuociuMiskas(spygliuociai);
        Miskas.berzuMiskas(berzai);
    }
}