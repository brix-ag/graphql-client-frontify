package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CreateAssetWorkflowTask {
  /**
   * **BETA** The newly created `WorkflowTask`.
   */
  @com.google.gson.annotations.SerializedName("workflowTask")
  private ch.brix.gql.client.frontify.objects.WorkflowTask workflowTask;
}
