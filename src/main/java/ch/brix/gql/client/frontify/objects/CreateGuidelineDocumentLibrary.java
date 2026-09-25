package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CreateGuidelineDocumentLibrary {
  /**
   * **BETA** The ID of the created document library.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** The title of the created document
   */
  @com.google.gson.annotations.SerializedName("title")
  private ch.brix.gql.client.frontify.scalars.StringScalar title;
  /**
   * **BETA** The heading of the created document
   */
  @com.google.gson.annotations.SerializedName("heading")
  private ch.brix.gql.client.frontify.scalars.StringScalar heading;
  /**
   * **BETA** The subheading of the created document
   */
  @com.google.gson.annotations.SerializedName("subheading")
  private ch.brix.gql.client.frontify.scalars.StringScalar subheading;
}
