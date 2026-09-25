package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class DuplicateGuidelineDocumentPage {
  /**
   * **BETA** The ID of the duplicated guideline document page.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** The title of the duplicated guideline document page.
   */
  @com.google.gson.annotations.SerializedName("title")
  private ch.brix.gql.client.frontify.scalars.StringScalar title;
}
