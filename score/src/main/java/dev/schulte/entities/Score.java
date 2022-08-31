package dev.schulte.entities;

import javax.persistence.*;

@Entity
@Table(name = "score")
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "points")
    private int points;

    @Column(name = "initials")
    private String initials;

    public Score() {
    }

    public Score(int id, int points, String initials) {
        this.id = id;
        this.points = points;
        this.initials = initials;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    @Override
    public String toString() {
        return "Score{" +
                "id=" + id +
                ", points=" + points +
                ", initials='" + initials + '\'' +
                '}';
    }
}
