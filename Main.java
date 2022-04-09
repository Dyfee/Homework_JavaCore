package Homework1;

public class Main {
    public static void main(String[] args) {
        Competitor[] competitors = {new Human("Charlie"), new Human("Kerry"), new Dog("Fluffy"), new Cat("Barsik")};
        Obstacle[] obstacles = {new Cross(500), new Wall(2), new Water(1)};

        Team team = new Team("Luckiest", competitors);

        System.out.println("Created new team");
        System.out.println(team.getTeamName());

        System.out.println("Greeting team members");
        team.showResults();

        Course course = new Course(obstacles);

        System.out.println("Team goes to course");
        course.doIt(team);

        System.out.println("Show team results");
        team.showResults();

        System.out.println("Team members finished course");
        team.showMembersFinishedCourse();
    }
}
