package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CreateGuidelineDocumentPageCategory {
  /**
   * **BETA** The ID of the created document page category.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** The title of the created document page category.
   */
  @com.google.gson.annotations.SerializedName("title")
  private ch.brix.gql.client.frontify.scalars.StringScalar title;
}
