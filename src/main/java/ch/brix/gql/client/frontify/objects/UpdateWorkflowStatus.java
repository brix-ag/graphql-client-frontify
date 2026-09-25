package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class UpdateWorkflowStatus {
  /**
   * **BETA** The updated `WorkflowStatus`.
   */
  @com.google.gson.annotations.SerializedName("workflowStatus")
  private ch.brix.gql.client.frontify.objects.WorkflowStatus workflowStatus;
}
