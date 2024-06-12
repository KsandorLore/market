public interface QueueBehaviour {

    void takeInQueue (Actor actor);
    Actor releaseFromQueue();
    boolean isEmpty();
    int size();

}
