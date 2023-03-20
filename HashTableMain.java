package assignments259.dshashtable;

public class HashTableMain {
    public static void main(String[] args) {
        System.out.println("Welcome To Data Structure Program Using Java Generics: Hash Tables");
        HashTableDS<String, Integer> hashTable = new HashTableDS<>();
        String sentence = "To be or not to be";
        String[] sentenceArray = sentence.toLowerCase().split(" ");

        for (String word : sentenceArray) {
            Integer count = hashTable.get(word);

            if (count == null)
                count = 1;
            else
                count = count + 1;
            hashTable.add(word, count);
        }
        System.out.println(hashTable);
    }
}
