package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CreateGuidelineDocumentPage {
  /**
   * **BETA** The ID of the created guideline document page.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** The ID of the document the guideline document page is created in.
   */
  @com.google.gson.annotations.SerializedName("documentId")
  private ch.brix.gql.client.frontify.scalars.IdScalar documentId;
  /**
   * **BETA** The title of the guideline document page id.
   */
  @com.google.gson.annotations.SerializedName("title")
  private ch.brix.gql.client.frontify.scalars.StringScalar title;
  /**
   * **BETA** The ID of the category the guideline document page is created in.
   */
  @com.google.gson.annotations.SerializedName("categoryId")
  private ch.brix.gql.client.frontify.scalars.IdScalar categoryId;
}
