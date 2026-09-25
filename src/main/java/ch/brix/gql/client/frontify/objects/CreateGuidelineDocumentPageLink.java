package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CreateGuidelineDocumentPageLink {
  /**
   * **BETA** The ID of the created document page link.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** The title of the created document page link.
   */
  @com.google.gson.annotations.SerializedName("title")
  private ch.brix.gql.client.frontify.scalars.StringScalar title;
  /**
   * **BETA** The link URL of the created document page link.
   */
  @com.google.gson.annotations.SerializedName("url")
  private ch.brix.gql.client.frontify.scalars.StringScalar url;
}
