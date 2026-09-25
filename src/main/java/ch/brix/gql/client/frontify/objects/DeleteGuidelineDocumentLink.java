package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class DeleteGuidelineDocumentLink {
  /**
   * **BETA** The ID of the deleted document link.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
}
