//Score class is the compiler for the TestSCore java
public class Score {

    int TestScore1;
    int TestScore2;
    int TestScore3;
    int TestScore4;
    int TestScore5;

    public Score(int TestScore1, int TestScore2, int TestScore3, int TestScore4, int TestScore5){
        this.TestScore1 = TestScore1;
        this.TestScore2 = TestScore2;
        this.TestScore3 = TestScore3;
        this.TestScore4 = TestScore4;
        this.TestScore5 = TestScore5;

    }
    // formula to calculate average in the TestScore java
    public int average(){
        return ((TestScore1 + TestScore2 + TestScore3 + TestScore4 + TestScore5)/5);
    }

}
