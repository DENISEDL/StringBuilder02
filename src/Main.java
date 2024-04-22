public class Main {
    public static void main(String[] args) {
    UnicodeExtractor extractor = new UnicodeExtractor("Hello Michele !");
    int index = 4;
        System.out.println(extractor.getUnicodeCharAtIndex(index));
}
    }