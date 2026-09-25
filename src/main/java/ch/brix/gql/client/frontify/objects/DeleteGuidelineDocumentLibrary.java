package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class DeleteGuidelineDocumentLibrary {
  /**
   * **BETA** The ID of the deleted document library.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
}
