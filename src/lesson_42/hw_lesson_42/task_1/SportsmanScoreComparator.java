package lesson_42.hw_lesson_42.task_1;

import java.util.Comparator;

public class SportsmanScoreComparator implements Comparator<Sportsman> {
    @Override
    public int compare(Sportsman s1, Sportsman s2) {
//        return Integer.compare(s1.getScore(), s2.getScore());
    return s1.getScore()- s2.getScore();
    }
}
