public class Exercise10 {
    public static void main(String[] args) {
        int packagePrice = 10_000;
        String packageType = "Bronze";
        switch (packageType) {
            case "Bronze": packagePrice = packagePrice+250;
            break;
            case "Silver": packagePrice += 500;
                break;
            case "Gold": packagePrice += 1000;
                break;
        }
        System.out.println(packagePrice);
    }
}
