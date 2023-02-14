public class ServerNameGenerator {
    public static void main(String[] args) {

        String[] adjectives = new String[10];
        adjectives[0] = "stormy";
        adjectives[1] = "dark";
        adjectives[2] = "rainy";
        adjectives[3] = "ferocious";
        adjectives[4] = "mischievous";
        adjectives[5] = "menacing";
        adjectives[6] = "untrustworthy";
        adjectives[7] = "dangerous";
        adjectives[8] = "venomous";
        adjectives[9] = "dangerous";

        String[] nouns = new String[10];
        nouns[0] = "storm cloud";
        nouns[1] = "viper";
        nouns[2] = "bat";
        nouns[3] = "snake";
        nouns[4] = "demon";
        nouns[5] = "ghost";
        nouns[6] = "storm";
        nouns[7] = "kidnapper";
        nouns[8] = "rodent";
        nouns[9] = "witch";


        System.out.println(wednesdayNicName(adjectives, nouns));

    }


    public static String wednesdayNicName(String[] adjectives, String[] nouns) {
        return ("Wednesday, my " + adjectives[(int) Math.floor(Math.random() * (9 + 1))] + "-" + nouns[(int) Math.floor(Math.random() * (9 + 1))] + "!");
    }
}
