import com.flowacademy.jarmu.*;

public class Verseny {

    public void autoKiir(Auto auto) {
        System.out.println(auto);
    }

    public static void main(String[] args) {

        for (String arg: args){
            System.out.print(arg.toString() + ", ");
        }
        System.out.println();

        int autokSzama = args.length / 5;
        Auto[] autoTomb = new Auto[autokSzama];
        int n = 0;

        for (int i = 0; i < args.length; i += 5) {
            String tipus = args[i+1];
            String pilota = args[i];
            int loero = Integer.parseInt(args[i+2]);
            float beallitas = Float.parseFloat(args[i+4]);
            int maxSebesseg = Integer.parseInt(args[i+3]);

            autoTomb[n] = new Versenyauto(loero, maxSebesseg, tipus, pilota, beallitas);
            n++;
        }

        float elsoHelyezettVersenykepesseg = 0;
        float masodikHelyezettVersenykepesseg = 0;
        float harmadikHelyezettVersenykepesseg = 0;
        float negyedikHelyezettVersenykepesseg = 0;

        int elsoHelyezettIndex = 0;
        int masodikHelyezettIndex = 0;
        int harmadikHelyezettIndex = 0;
        int negyedikHelyezettIndex = 0;

        Auto elsoHelyezett = autoTomb[elsoHelyezettIndex];
        Auto masodikHelyezett = autoTomb[masodikHelyezettIndex];
        Auto harmadikHelyezett = autoTomb[harmadikHelyezettIndex];
        Auto negyedikHelyezett = autoTomb[negyedikHelyezettIndex];

        for (int i = 0; i < autoTomb.length; i++) {
            if (autoTomb[i].versenykepesseg() > elsoHelyezettVersenykepesseg){

                harmadikHelyezettVersenykepesseg = masodikHelyezettVersenykepesseg;
                masodikHelyezettVersenykepesseg = elsoHelyezettVersenykepesseg;
                elsoHelyezettVersenykepesseg = autoTomb[i].versenykepesseg();

                harmadikHelyezett = masodikHelyezett;
                masodikHelyezett = elsoHelyezett;
                elsoHelyezett = autoTomb[i];


            } else if (autoTomb[i].versenykepesseg() > masodikHelyezettVersenykepesseg){

                harmadikHelyezettVersenykepesseg = masodikHelyezettVersenykepesseg;
                masodikHelyezettVersenykepesseg = autoTomb[i].versenykepesseg();

                harmadikHelyezett = masodikHelyezett;
                masodikHelyezett = autoTomb[i];


            } else if (autoTomb[i].versenykepesseg() > harmadikHelyezettVersenykepesseg){

                harmadikHelyezettVersenykepesseg = autoTomb[i].versenykepesseg();

                harmadikHelyezett = autoTomb[i];

            } else {
                negyedikHelyezettVersenykepesseg = autoTomb[i].versenykepesseg();

                negyedikHelyezett = autoTomb[i];

            }
        }

        System.out.println("1." + elsoHelyezett.toString());
        System.out.println("2." + masodikHelyezett.toString());
        System.out.println("3." + harmadikHelyezett.toString());



    }
}
