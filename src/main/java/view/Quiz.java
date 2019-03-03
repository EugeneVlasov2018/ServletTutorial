package view;

public class Quiz {
    private int id;
    private String numberOgQuestion;
    private String bodyOfQuestion;

    public Quiz(int id, String numberOgQuestion, String bodyOfQuestion) {
        this.id = id;
        this.numberOgQuestion = numberOgQuestion;
        this.bodyOfQuestion = bodyOfQuestion;
    }

    public Quiz(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "id=" + id +
                ", numberOgQuestion='" + numberOgQuestion + '\'' +
                ", bodyOfQuestion='" + bodyOfQuestion + '\'' +
                '}';
    }
}
