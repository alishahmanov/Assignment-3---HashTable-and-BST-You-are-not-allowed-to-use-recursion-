public class Chef {
    private String fullName;
    private int experience;

    public Chef(String fullName, int experience) {
        this.fullName = fullName;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return fullName + ", " + experience + " years of experience";
    }
}
