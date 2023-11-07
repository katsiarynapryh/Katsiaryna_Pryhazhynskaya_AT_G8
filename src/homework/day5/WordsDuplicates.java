package homework.day5;

public class WordsDuplicates {
    //1.2 метод, который позволяет найти и вывести в консоль все дубликаты слов в строке текста, который принимает на вход в виде аргумента.

    public void countDuplicates(String stringInput) {
        String lyricsWithDuplicates = new String(stringInput);
        int count;

        lyricsWithDuplicates = lyricsWithDuplicates.toLowerCase(); //Converts the string into lowercase
        String words[] = lyricsWithDuplicates.split(" "); //Split the string into words using built-in function

        System.out.println("Duplicate words in my string: ");
        for(int i = 0; i < words.length; i++) {
            count = 1;
            for(int j = i+1; j < words.length; j++) {
                if(words[i].equals(words[j])) {
                    count++;
                    //Set words[j] to 0 to avoid printing visited word
                    words[j] = "0";
                }
            }

            //Displays the duplicate word if count is greater than 1
            if(count > 1 && words[i] != "0")
                System.out.println(words[i]);
        }
    }

}
