package Itmo.lessons2;

public enum Skills {
    DEXTERITY("Ловкость"),
    INTELLIGENCE("Ум"),
    ENDURE("Выносливость"),
    FAST_RUN("Быстрый бег"),
    DIGGER("Копатель"),
    FORCE("Сила");
    private final String description;

    Skills(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
