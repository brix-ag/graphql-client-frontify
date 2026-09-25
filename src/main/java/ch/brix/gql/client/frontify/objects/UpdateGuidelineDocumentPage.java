package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class UpdateGuidelineDocumentPage {
  /**
   * **BETA** The ID of the updated document page.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** The title of the document page after the update.
   */
  @com.google.gson.annotations.SerializedName("title")
  private ch.brix.gql.client.frontify.scalars.StringScalar title;
  /**
   * **BETA** The heading of the document page after the update.
   */
  @com.google.gson.annotations.SerializedName("heading")
  private ch.brix.gql.client.frontify.scalars.StringScalar heading;
  /**
   * **BETA** The subheading of the document page after the update.
   */
  @com.google.gson.annotations.SerializedName("subheading")
  private ch.brix.gql.client.frontify.scalars.StringScalar subheading;
}
