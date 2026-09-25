package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class DeleteGuidelineDocument {
  /**
   * **BETA** The ID of the deleted document.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
}
