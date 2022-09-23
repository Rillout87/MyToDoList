public abstract class AbstractPriority implements Priority {
    private PriorityLevel priorityLevel;

    AbstractPriority(PriorityLevel priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    AbstractPriority() {
        this(PriorityLevel.NONE);
    }

    public PriorityLevel getPriorityLevel() {
        return priorityLevel;
    }

}
