package Homework1;

public class Course {

    Obstacle[] obstacles;


    public Course(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        Competitor[] teamMembers = team.getMembers();
        if(teamMembers.length > 0) {
            for(Competitor competitor : teamMembers) {
                for (Obstacle obstacle : obstacles) {
                    obstacle.doIt(competitor);
                    if (!competitor.isOnDistance()) break;
                }
            }
        } else {
            System.out.println("There are no members in the team!");
        }
    }
}
