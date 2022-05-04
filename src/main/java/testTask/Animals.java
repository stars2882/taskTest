package testTask;

public class Animals {
    private int pigs;
    private int chickens;
    private int cows;

    public int getPigs() {
        return pigs;
    }

    public void setPigs(int pigs) {
        this.pigs = pigs;
    }

    public int getChickens() {
        return chickens;
    }

    public void setChickens(int chickens) {
        this.chickens = chickens;
    }

    public int getCows() {
        return cows;
    }

    public void setCows(int cows) {
        this.cows = cows;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animals animals = (Animals) o;

        if (pigs != animals.pigs) return false;
        if (chickens != animals.chickens) return false;
        return cows == animals.cows;
    }

    @Override
    public int hashCode() {
        int result = pigs;
        result = 31 * result + chickens;
        result = 31 * result + cows;
        return result;
    }
}
