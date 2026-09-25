package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class UpdateGuidelineDocumentLibrary {
  /**
   * **BETA** The ID of the updated document library.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** The title of the document library after the update.
   */
  @com.google.gson.annotations.SerializedName("title")
  private ch.brix.gql.client.frontify.scalars.StringScalar title;
}
