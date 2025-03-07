package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class DeleteWorkflowTask {
  /**
   * The Id of the deleted `WorkflowTask`.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
}
