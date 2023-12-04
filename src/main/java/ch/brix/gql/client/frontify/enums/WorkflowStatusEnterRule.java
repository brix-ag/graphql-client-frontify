package ch.brix.gql.client.frontify.enums;

/**
 * A rule which needs to be satisfied for a `WorkflowTask` to enter a given `WorkflowStatus`.
 */
public enum WorkflowStatusEnterRule {
  @com.google.gson.annotations.SerializedName("TASK_REQUIRES_ASSIGNEE") 
  TASK_REQUIRES_ASSIGNEE,
  @com.google.gson.annotations.SerializedName("TASK_REQUIRES_MESSAGE") 
  TASK_REQUIRES_MESSAGE;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
