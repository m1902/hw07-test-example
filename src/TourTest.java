import com.gradescope.jh61b.grader.GradedTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TourTest
{
    private static final double DELTA = 1e-15;

    private final Point[] points;

    @Parameters
    public static Object[] data()
    {
        return new Object[][][]
        {
            {
                {},
                {}
            },
            {
                {500},
                {500}
            },
            {
                {500, 200},
                {500, 400}
            },
            {
                {500, 200, 300, 100, 300},
                {500, 400, 100, 100, 200}
            }
        };
    }


    public TourTest(Object[] pointX, Object[] pointY)
    {
        points = new Point[pointX.length]; // assumption both arrays are of the same length

        for (int i = 0; i < pointX.length; i++)
        {
            points[i] = new Point((int)pointX[i], (int)pointY[i]);
        }
    }

    @Test(timeout = 1000)
    @GradedTest(name = "Test InOrder Size", max_score = 0.5)
    public void testInOrderSize()
    {
        TourInterface tourRef = new TourRef();

        for (Point point : points) {
            tourRef.insertInOrder(point);
        }

        TourInterface tour = new Tour();

        for (Point point : points) {
            tour.insertInOrder(point);
        }
        assertEquals(tour.size(), tourRef.size());

    }

    @Test(timeout = 1000)
    @GradedTest(name = "Test InOrder distance", max_score = 0.5)
    public void testInOrderDistance()
    {
        TourInterface tourRef = new TourRef();

        for (Point point : points) {
            tourRef.insertInOrder(point);
        }

        TourInterface tour = new Tour();

        for (Point point : points) {
            tour.insertInOrder(point);
        }
        assertEquals(tour.distance(), tourRef.distance(), DELTA );
    }

    @Test(timeout = 1000)
    @GradedTest(name = "Test InOrder toString", max_score = 0.5)
    public void testInOrderToString()
    {
        TourInterface tourRef = new TourRef();

        for (Point point : points) {
            tourRef.insertInOrder(point);
        }

        TourInterface tour = new Tour();

        for (Point point : points) {
            tour.insertInOrder(point);
        }
        assertEquals(tour.toString(), tourRef.toString());
    }

    @Test(timeout = 1000)
    @GradedTest(name = "Test Nearest Size", max_score = 0.5)
    public void testNearestSize()
    {
        TourInterface tourRef = new TourRef();

        for (Point point : points) {
            tourRef.insertNearest(point);
        }

        TourInterface tour = new Tour();

        for (Point point : points) {
            tour.insertNearest(point);
        }
        assertEquals(tour.size(), tourRef.size());
    }

    @Test(timeout = 1000)
    @GradedTest(name = "Test Nearest distance", max_score = 0.5)
    public void testNearestDistance()
    {
        TourInterface tourRef = new TourRef();

        for (Point point : points) {
            tourRef.insertNearest(point);
        }

        TourInterface tour = new Tour();

        for (Point point : points) {
            tour.insertNearest(point);
        }
        assertEquals(tour.distance(), tourRef.distance(), DELTA );
    }

    @Test(timeout = 1000)
    @GradedTest(name = "Test Nearest toString", max_score = 0.5)
    public void testNearestToString()
    {
        TourInterface tourRef = new TourRef();

        for (Point point : points) {
            tourRef.insertNearest(point);
        }

        TourInterface tour = new Tour();

        for (Point point : points) {
            tour.insertNearest(point);
        }
        assertEquals(tour.toString(), tourRef.toString());
    }
    @Test(timeout = 1000)
    @GradedTest(name = "Test Smallest Size", max_score = 0.5)
    public void testSmallestSize()
    {
        TourInterface tourRef = new TourRef();

        for (Point point : points) {
            tourRef.insertSmallest(point);
        }

        TourInterface tour = new Tour();

        for (Point point : points) {
            tour.insertSmallest(point);
        }
        assertEquals(tour.size(), tourRef.size());
    }

    @Test(timeout = 1000)
    @GradedTest(name = "Test Smallest distance", max_score = 0.5)
    public void testSmallestDistance()
    {
        TourInterface tourRef = new TourRef();

        for (Point point : points) {
            tourRef.insertSmallest(point);
        }

        TourInterface tour = new Tour();

        for (Point point : points) {
            tour.insertSmallest(point);
        }
        assertEquals(tour.distance(), tourRef.distance(), DELTA );
    }

    @Test(timeout = 1000)
    @GradedTest(name = "Test Smallest toString", max_score = 0.5)
    public void testSmallestToString()
    {
        TourInterface tourRef = new TourRef();

        for (Point point : points) {
            tourRef.insertSmallest(point);
        }

        TourInterface tour = new Tour();

        for (Point point : points) {
            tour.insertSmallest(point);
        }
        assertEquals(tour.toString(), tourRef.toString());
    }

}
