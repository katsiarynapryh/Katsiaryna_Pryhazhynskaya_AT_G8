package homework.day5;

public class StringObjectRunner {
    public static void main(String[] args) {
        PrintLetters printLetters = new PrintLetters();
        printLetters.printLettersToColumn("maybe yes, maybe no, maybe rain, maybe snow");

        WordsDuplicates wordsDuplicates = new WordsDuplicates();
        wordsDuplicates.countDuplicates("I'm a big, big girl\n" +
                "In a big, big world\n" +
                "It's not a big, big thing\n" +
                "If you leave me");

        FindNumbers findNumbers = new FindNumbers();
        findNumbers.findNumbers("Launched on January 16, 2007, nearly a decade after Netflix, Inc. began its pioneering DVD‑by‑mail movie rental service,\n" +
                "Netflix is the most-subscribed video on demand streaming media service, with 238.39 million paid memberships in more than 190 countries");

        System.out.println();

        CurrentDate currentDate = new CurrentDate();
        currentDate.currentDate();

//        DateFormat dateFormat = new DateFormat();
//        dateFormat.dateFormat("21.59 07.09.2020");

        StringDate stringDate = new StringDate();
        stringDate.StringDate("my generated text"); //n - это количество гласных буков в получаемой строке
    }
}
