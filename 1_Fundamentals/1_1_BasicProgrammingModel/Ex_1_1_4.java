/**
 * 1.1.4 What (if anything) is wrong with each of the following statements?
 * a.
 * b.
 * c.
 * d.
 * if (a > b) then c = 0;
 * if a > b { c = 0; }
 * if (a > b) c = 0;
 * if (a > b) c = 0 else b = 0;
 *
 * @author <a href="mailto:piotr@piotrovski.com">Piotr Piotrowski</a>
 */
public class Ex_1_1_4 {

    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
//      keyword then does not exist 
//        if (a > b) then c = 0;

//        lack of braces around a > b
//        if a > b { c = 0; }

//        looks good (and works)
//        if (a > b) c = 0;

//        lack of ; after c = 0
//        if (a > b) c = 0 else b = 0;
    }

}
