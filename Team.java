package Homework1;

public class Team {
    String teamName;
    Competitor[] teamMembers = new Competitor[4];

    public Team(String teamName, Competitor[] teamMembers) {
        this.teamName = teamName;
        this.teamMembers = teamMembers;
    }

    public String getTeamName() {
        return "Team name: " + teamName;
    }

    public Competitor[] getMembers() {
        return teamMembers;
    }

    public void showResults() {
        for(Competitor competitor : teamMembers) {
            competitor.showResult();
        }
    }

    public void showMembersFinishedCourse() {
        for(Competitor competitor : teamMembers) {
            if(competitor.isOnDistance()) {
                competitor.showResult();
            }
        }
    }
}
