package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class UpdateWorkflowTask {
  /**
   * **BETA** The updated `WorkflowTask`.
   */
  @com.google.gson.annotations.SerializedName("workflowTask")
  private ch.brix.gql.client.frontify.objects.WorkflowTask workflowTask;
}
