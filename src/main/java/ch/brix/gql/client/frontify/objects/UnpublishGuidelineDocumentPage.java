package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class UnpublishGuidelineDocumentPage {
  /**
   * **BETA** The ID of the unpublished guideline document page.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** Whether or not the guideline document page is published.
   */
  @com.google.gson.annotations.SerializedName("isPublished")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar isPublished;
}
