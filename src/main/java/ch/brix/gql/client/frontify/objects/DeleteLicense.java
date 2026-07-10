package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class DeleteLicense {
  /**
   * The Id of the deleted `License`.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
}
