package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class DeleteWorkflowStatus {
  /**
   * The Id of the deleted `WorkflowStatus`.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
}
