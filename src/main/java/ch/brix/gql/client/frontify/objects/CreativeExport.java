package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CreativeExport {
  /**
   * `CreativeJob` Id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * `CreativeJob` status.
   */
  @com.google.gson.annotations.SerializedName("status")
  private ch.brix.gql.client.frontify.enums.CreativeJobStatus status;
  /**
   * Generated Creative.
   */
  @com.google.gson.annotations.SerializedName("result")
  private ch.brix.gql.client.frontify.objects.CreativeResult result;
}
