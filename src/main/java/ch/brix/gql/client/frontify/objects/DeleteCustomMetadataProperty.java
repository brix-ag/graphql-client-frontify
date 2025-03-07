package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class DeleteCustomMetadataProperty {
  /**
   * The Id of the deleted `CustomMetadataProperty`.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
}
