package class1;

public class Ex1 {
    public static void main(String[] args) {
        MovieReview m1 = movieReview("인셉션", "잼씀");
        MovieReview m2 = movieReview("어바웃머시기", "노잼");
        MovieReview[] mArr = {m1, m2};
        for (MovieReview m : mArr) {
            System.out.println(m.title + " - " + m.review);
        }

    }
    public static MovieReview movieReview(String title, String review){
        MovieReview m = new MovieReview();
        m.title=title;
        m.review=review;
        return m;
    }
}
