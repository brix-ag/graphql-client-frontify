package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class MoveWorkflowTask {
  /**
   * **BETA** The `WorkflowStatus` with the moved tasks.
   */
  @com.google.gson.annotations.SerializedName("workflowStatus")
  private ch.brix.gql.client.frontify.objects.WorkflowStatus workflowStatus;
}
