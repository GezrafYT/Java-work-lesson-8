package class_usage_practice;

import java.util.Scanner;

public class ArithmeticProgression
{
    private int fM, diff;

    public int get_fM()
    {
        return this.fM;
    }

    public int get_diff()
    {
        return this.diff;
    }

    public void set_fM(int fM)
    {
        this.fM = fM;
    }
    public void set_diff(int diff)
    {
        this.diff = diff;
    }
    public ArithmeticProgression(int fM, int diff) //בנאי ראשי
    {
        this.fM = fM;
        this.diff = diff;
    }

    public ArithmeticProgression(ArithmeticProgression other) //בנאי העתקה
    {
        this.fM = other.fM;
        this.diff = other.diff;
    }

    public boolean equal(ArithmeticProgression other)
    {
        if(this.fM == other.fM && this.diff == other.diff)
        {
            return true;
        }
        return false;
    }

    public boolean compareDiff(int other_diff)
    {
        if (this.diff == other_diff)
        {
            return true;
        }
        return false;
    }

    public void printGeneralSeries()
    {
        System.out.println("Formula: aN = " + this.fM + " + " + this.diff + "(n-1)");
    }

    public int memberCalculation(int n)
    {
        int aN = this.fM + this.diff * (n-1);

        return aN;
    }

    public float calculateN(int aN)
    {
        float n = (float) (aN - this.fM  + this.diff) / this.diff;

        if(n % 1 == 0)
        {
            return n;
        }

        return 0;
    }


}
