package person;

public enum Gender {
    FEMALE ("Woman", "Nő"),
    MALE ("Man", "Férfi");

    final String englishName;
    final String hungarianName;

    Gender(String englishName, String hungarianName) {
        this.englishName = englishName;
        this.hungarianName = hungarianName;
    }

}
