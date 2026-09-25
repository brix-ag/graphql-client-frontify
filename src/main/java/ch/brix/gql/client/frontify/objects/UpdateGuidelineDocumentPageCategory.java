package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class UpdateGuidelineDocumentPageCategory {
  /**
   * **BETA** The ID of the updated document page category.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** The title of the document page category after the update.
   */
  @com.google.gson.annotations.SerializedName("title")
  private ch.brix.gql.client.frontify.scalars.StringScalar title;
}
