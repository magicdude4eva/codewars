import java.security.InvalidParameterException;

// TODO: create the User class/object
// it must support rank, progress, and the incProgress(int rank) method
public class User {
    public int rank = -8;
    public int progress;

    public void incProgress(int rank) {
        if (rank < -8 || rank == 0 || rank > 8) {
            throw new InvalidParameterException();
        }

        int rankDiff = getInnerRank(rank) - getInnerRank(this.rank);
        if (rankDiff == 0) {
            progress += 3;
        } else if (rankDiff == -1) {
            progress += 1;
        } else if (rankDiff > 0) {
            progress += (10 * rankDiff * rankDiff);
        }
      
        if (progress > 100) {
            int rankBefore = this.rank;
            this.rank += progress / 100;
            progress %= 100;

            if (rankBefore < 0 && this.rank >= 0) {
                this.rank += 1;
            }
        }
      
        if (this.rank >= 8) {
            this.rank = 8;
            progress = 0;
        }
    }

    private int getInnerRank(int rank) {
        return rank > 0 ? rank - 1 : rank;
    }
}
