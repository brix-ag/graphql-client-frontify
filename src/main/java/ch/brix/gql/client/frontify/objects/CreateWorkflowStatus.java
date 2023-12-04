package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CreateWorkflowStatus {
  /**
   * **BETA** The newly created `WorkflowStatus`.
   */
  @com.google.gson.annotations.SerializedName("workflowStatus")
  private ch.brix.gql.client.frontify.objects.WorkflowStatus workflowStatus;
}
