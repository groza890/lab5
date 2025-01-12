package problema2;

/**
 *
 */
public class PerecheNumere {
    private int a;
    private int b;

    public PerecheNumere(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public PerecheNumere(){}

    public int getA()
    {
        return a;
    }

    public void setA(int a)
    {
        this.a = a;
    }

    public int getB()
    {
        return b;
    }

    public void setB(int b)
    {
        this.b = b;
    }

    @Override
    public String toString() {
        return "[" + a + ", " + b + "]";
    }

    public boolean Fibonacci(int x, int y) {

        if ((a == x && b == y) || (a == y && b == x)) {
            return true;
        }

        if (x > a || y > b) {
            return false;
        }

        return Fibonacci(y, x + y);
    }


    public int cmmmc()
    {
        int x=a,y=b;

        while(x!=y)
        {
            if(x>y)
                x=x-y;
            else
                y=y-x;
        }
        int cmmdc=x;
        return a*b/cmmdc;
    }

    public boolean sumaCifrelorEgala()
    {
        int sumaA=0, sumaB=0, x=a,y=b;

        while(x!=0)
        {
            sumaA=sumaA+x%10;
            x=x/10;
        }
        while(y!=0)
        {
            sumaB=sumaB+y%10;
            y=y/10;
        }

        return sumaA==sumaB;
    }

    public boolean acelasiNRCifrePare()
    {
        int x=a,y=b, cA=0, cB=0;

        while(x!=0)
        {
            if((x%10)%2==0)
                cA++;
            x=x/10;
        }

        while(y!=0)
        {
            if((y%10)%2==0)
                cB++;
            y=y/10;
        }

        return cA==cB;
    }
}
