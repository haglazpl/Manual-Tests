public class AnagramVerificationMain {

    static String text1 = "Silent";
    static String text2 = "Listen";

    public static void main(String[] args) {
        AnagramVerificationApp app = new AnagramVerificationApp();
        app.run(text1, text2);
    }
}