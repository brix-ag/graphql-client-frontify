package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class UpdateGuidelineDocument {
  /**
   * **BETA** The ID of the updated document.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** The title of the document after the update.
   */
  @com.google.gson.annotations.SerializedName("title")
  private ch.brix.gql.client.frontify.scalars.StringScalar title;
}
