package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class AddWorkflowStatusAssignees {
  /**
   * **BETA** The updated `WorkflowStatus`.
   */
  @com.google.gson.annotations.SerializedName("workflowStatus")
  private ch.brix.gql.client.frontify.objects.WorkflowStatus workflowStatus;
}
