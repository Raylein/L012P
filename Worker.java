/* 
sleeping is not something a worker would be doing as they are currently on the job. Test software and write code should be subclasses of work.
public class OnTheJob would be a good class where you have the work options,work, attend meeting, and lunch break. 
This code could be better if you removed the actions to write code, test software,design UI, and sleep. 
*/
public interface Worker {
    void work();
    void eat();
    void sleep();
    void attendMeeting();
    void writeCode();
    void designUI();
    void testSoftware();
}

